package ar.ejercicio15;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testInversor {

	private Inversor inversor1;
	
	
	@BeforeEach
	void setUp() {
		inversor1 = new Inversor();
	}
	
	@Test
	void testAgregarInversion() {
		Inversion accion = new Accion("una accion",1,500);
		Inversion plazoFijo = new PlazoFijo(1000,0.1,LocalDate.now());
		inversor1.agregarInversion(accion);
		assertTrue(inversor1.getCartera().contains(accion));
		inversor1.agregarInversion(plazoFijo);
		assertTrue(inversor1.getCartera().contains(plazoFijo));
	}
	
	@Test
	void testQuitarInversion() {
		Inversion plazoFijo = new PlazoFijo(1000,0.1,LocalDate.now());
		Inversion accion = new Accion("una accion",1,500);
		assertFalse(inversor1.quitarInversion(accion));
		assertFalse(inversor1.quitarInversion(plazoFijo));
		inversor1.agregarInversion(accion);
		inversor1.quitarInversion(accion);
		assertFalse(inversor1.getCartera().contains(accion));
		inversor1.agregarInversion(plazoFijo);
		inversor1.quitarInversion(plazoFijo);
		assertFalse(inversor1.getCartera().contains(plazoFijo));
	}
	
	@Test
	void testValorCartera() {
		assertEquals(0,inversor1.valorCartera());
		Inversion accion = new Accion("una accion",1,500);
		Inversion plazoFijo = new PlazoFijo(1000,0.1,LocalDate.now());
		inversor1.agregarInversion(accion);
		assertEquals(accion.getValorActual(),inversor1.valorCartera());
		inversor1.agregarInversion(plazoFijo);
		assertEquals(accion.getValorActual()+plazoFijo.getValorActual(),inversor1.valorCartera());
	}
}

package ar.ejercicio24;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrdenServicioTest {

	private OrdenServicio ordenSinDescuento;
	private OrdenServicio ordenConDescuento;

	
	@BeforeEach
	void setUp() {
		ordenSinDescuento = new OrdenServicio(new Usuario("Pepe","domicilio"), LocalDate.now(), "123", 10, "desc");
		ordenSinDescuento.agregarProducto(new Producto (null, null, 100, false));
		ordenConDescuento= new OrdenServicio(new Usuario("Pepe","domicilio"), LocalDate.now(), "123", 11, "desc");
		ordenConDescuento.agregarProducto(new Producto (null, null, 100, false));
	}
	

	

	@Test
	void testCalcularCostoSinDescuento() {
		ordenSinDescuento.agregarTecnico(new Tecnico(null, null, 100));
		assertEquals(1100, ordenSinDescuento.calcularCosto());
	}
	
	@Test
	void testCalcularCostoConDescuento() {
		ordenConDescuento.agregarTecnico(new Tecnico(null, null, 100));
		assertEquals(1080, ordenConDescuento.calcularCosto());
	}
	
}

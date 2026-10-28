package ar.ejercicio17;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCarpeta {
	
	private Carpeta carpeta;
	
	@BeforeEach
	void setUp() {
		carpeta = new Carpeta();
	}
	
	@Test
	void testTamanio() {
		assertEquals(0,carpeta.tamanio());
		Email email = new Email (new ArrayList<>(), "123","123");
		carpeta.agregarEmail(email);
		assertEquals(6, carpeta.tamanio());
		Email email2 = new Email (new ArrayList<>(), "1234","123");
		carpeta.agregarEmail(email2);
		assertEquals(13, carpeta.tamanio());
	}
	
	@Test
	void testBuscar() {
		assertEquals(null,carpeta.buscar("algo"));
		Email email = new Email (new ArrayList<>(), "algo","123");
		Email emailSegundoEnLaLista = new Email (new ArrayList<>(), "algo","123");
		carpeta.agregarEmail(email);
		carpeta.agregarEmail(emailSegundoEnLaLista);
		assertSame(email,carpeta.buscar("algo"));
		assertSame(email,carpeta.buscar("123"));
	}
	
	@Test
	void testMover() { //Asumo que el email siempre está en la carpeta origen, porque eso dice el enunciado
		Email email = new Email (new ArrayList<>(), "algo","123");
		carpeta.agregarEmail(email);
		Carpeta destino = new Carpeta();
		carpeta.mover(email, destino);
		assertFalse(carpeta.getEmails().contains(email));
		assertTrue(destino.getEmails().contains(email));
	}
}

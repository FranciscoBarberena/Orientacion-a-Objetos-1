package ar.ejercicio17;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestArchivo {
	
	private Archivo archivo;
	
	@BeforeEach
	void setUp() {
		archivo = new Archivo("1234");
	}
	
	@Test
	void testTamanio() {
		assertEquals(4, archivo.tamanio());
	}
	
}
	


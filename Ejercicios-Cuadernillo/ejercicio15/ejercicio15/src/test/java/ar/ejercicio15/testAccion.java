package ar.ejercicio15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testAccion {
	private Accion accionIndividual;
	private Accion accionMultiple;
	
	@BeforeEach
	void setUp() {
		accionIndividual = new Accion("Accion1", 1, 100);
		accionMultiple = new Accion("Accion2", 2, 100);
	}
	
	@Test
	void testGetValorActual() {
		assertEquals(100, accionIndividual.getValorActual());
		assertEquals(accionIndividual.getValorUnitario(),accionIndividual.getValorActual());
		assertEquals(200, accionMultiple.getValorActual());
		assertNotEquals(accionMultiple.getValorUnitario(),accionMultiple.getValorActual());
	}
}

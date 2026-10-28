package ar.ejercicio15;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testPlazoFijo {
	private PlazoFijo plazoFijoSinGanancia;
	private PlazoFijo plazoFijoConGanancia;
	
	@BeforeEach
	void setUp() {
		plazoFijoSinGanancia = new PlazoFijo(1,0.1,LocalDate.now());
		plazoFijoConGanancia = new PlazoFijo(1,0.1,LocalDate.now().minusDays(1));
	}
	@Test
	void testGetValorActual () {
		assertEquals(plazoFijoSinGanancia.getValorActual(), 1);
		assertEquals(plazoFijoSinGanancia.getValorActual(), plazoFijoSinGanancia.getMontoDepositado());
		assertEquals(plazoFijoConGanancia.getValorActual(), 1*1.1);
		assertNotEquals(plazoFijoConGanancia.getValorActual(), plazoFijoConGanancia.getMontoDepositado());
	}
}


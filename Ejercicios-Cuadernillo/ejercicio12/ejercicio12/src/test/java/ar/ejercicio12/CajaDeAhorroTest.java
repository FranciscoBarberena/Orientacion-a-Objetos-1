package ar.ejercicio12;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CajaDeAhorroTest {
	
	private CajaDeAhorro caja1;
	
	@BeforeEach
	void setUp() throws Exception {
		this.caja1 = new CajaDeAhorro();
		caja1.depositar(100);
	}
	@Test
	void testDepositar() {
		assertEquals(98, caja1.getSaldo());
	}
	
	@Test
	void testExtraer() {
		boolean pudo = caja1.extraer(50);
		assertTrue(pudo);
		assertEquals(47, caja1.getSaldo());
	}
	@Test
	void testExtraerFallido() {
		boolean pudo = caja1.extraer(98); //Lo cambié a 98 porque es dificil depositar $100 exactos
		assertFalse(pudo);
		assertEquals(98, caja1.getSaldo());
	}
	
	void testTransferir() {
		CajaDeAhorro cajaDestino = new CajaDeAhorro();
		boolean pudo = caja1.transferirACuenta(98, cajaDestino);
		assertFalse(pudo);
		assertEquals(98, caja1.getSaldo());
		assertEquals(0, cajaDestino.getSaldo());
		pudo = caja1.transferirACuenta(50, cajaDestino);
		assertTrue(pudo);
		assertEquals(47,caja1.getSaldo());
		assertEquals(49,cajaDestino.getSaldo());
	}
	@Test
	void testTransferirACuentaCorriente() {
		CuentaCorriente cajaDestino = new CuentaCorriente();
		boolean pudo = caja1.transferirACuenta(98, cajaDestino);
		assertFalse(pudo);
		assertEquals(98, caja1.getSaldo());
		assertEquals(0, cajaDestino.getSaldo());
		pudo = caja1.transferirACuenta(50, cajaDestino);
		assertTrue(pudo);
		assertEquals(47,caja1.getSaldo());
		assertEquals(50,cajaDestino.getSaldo());
	}
}

package ar.ejercicio12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaCorrienteTest {
	private CuentaCorriente cuenta500;
	private CuentaCorriente cuenta200;
	private CuentaCorriente cuenta;

	@BeforeEach
	void setUp() throws Exception {
		cuenta = new CuentaCorriente();
		cuenta500 = new CuentaCorriente();
		cuenta500.setLimiteDescubierto(500);
		cuenta200 = new CuentaCorriente();
		cuenta200.setLimiteDescubierto(200);
	}
	@Test
	void testDepositar() {
		cuenta.depositar(100);
		assertEquals(100, cuenta.getSaldo());
	}
	@Test
	void testExtraer() {
		boolean pudo = cuenta500.extraer(300);
		assertTrue(pudo);
		assertEquals(-300,cuenta500.getSaldo());
	}
	@Test
	void testExtraerFallido() {
		boolean pudo = cuenta500.extraer(600);
		assertFalse(pudo);
		assertEquals(0,cuenta500.getSaldo());
	}
	
	@Test
	void testTransferirACuenta() {
		CuentaCorriente cuentaDestino = new CuentaCorriente();
		boolean pudo = cuenta200.transferirACuenta(300, cuentaDestino);
		assertFalse(pudo);
		assertEquals(0,cuenta200.getSaldo());
		assertEquals(0,cuentaDestino.getSaldo());
		pudo = cuenta200.transferirACuenta(100, cuentaDestino);
		assertTrue(pudo);
		assertEquals(-100,cuenta200.getSaldo());
		assertEquals(100,cuentaDestino.getSaldo());
	}
	@Test
	void testTransferirACajaDeAhorro() {
		CajaDeAhorro cuentaDestino = new CajaDeAhorro();
		boolean pudo = cuenta200.transferirACuenta(300, cuentaDestino);
		assertFalse(pudo);
		assertEquals(0,cuenta200.getSaldo());
		assertEquals(0,cuentaDestino.getSaldo());
		pudo = cuenta200.transferirACuenta(100, cuentaDestino);
		assertTrue(pudo);
		assertEquals(-100,cuenta200.getSaldo());
		assertEquals(98,cuentaDestino.getSaldo());
	}
}

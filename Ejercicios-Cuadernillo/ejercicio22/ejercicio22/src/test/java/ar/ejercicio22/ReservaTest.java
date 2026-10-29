package ar.ejercicio22;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReservaTest {

	private Reserva reserva;
	
	@BeforeEach
	void setUp() {
		reserva = new Reserva(LocalDate.of(2025, 1, 1), LocalDate.of(2025, 1, 31), 10);
	}
	
	
	@Test
	void calcularPrecioTest(){
		assertEquals(30*10, reserva.calcularPrecio());
	}
	
	@Test
	void estaEnRangoTest() {
		assertTrue(reserva.estaEnRango(LocalDate.of(2025, 1, 31), LocalDate.of(2025, 2, 10)));
		assertFalse(reserva.estaEnRango(LocalDate.of(2024, 12, 30), LocalDate.of(2024, 12, 31)));
		assertTrue(reserva.estaEnRango(LocalDate.of(2024, 12, 30), LocalDate.of(2025, 1, 1)));
	}
	
}

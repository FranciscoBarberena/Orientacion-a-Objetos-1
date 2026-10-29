package ar.ejercicio23;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.ejercicio22.Reserva;

public class PoliticaEstrictaTest {

	private PoliticaDeCancelacion politica;
	@BeforeEach
	void setUp() {
		politica = new PoliticaEstricta();
	}
	@Test
	void calcularReembolsoTest() {
		Reserva reservaLejana = new Reserva(LocalDate.now().plusDays(10000),LocalDate.now().plusDays(10002),10);
		assertEquals(0,politica.calcularReembolso(reservaLejana));
	}
	
}

package ar.ejercicio23;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.ejercicio22.Reserva;

public class PoliticaFlexibleTest {

	private PoliticaDeCancelacion politica;
	@BeforeEach
	void setUp() {
		politica = new PoliticaFlexible();
	}
	@Test
	void calcularReembolsoTest() {
		Reserva reservaManana = new Reserva(LocalDate.now().plusDays(1),LocalDate.now().plusDays(2),10);
		assertEquals(reservaManana.calcularPrecio(),politica.calcularReembolso(reservaManana));
	}
	
}

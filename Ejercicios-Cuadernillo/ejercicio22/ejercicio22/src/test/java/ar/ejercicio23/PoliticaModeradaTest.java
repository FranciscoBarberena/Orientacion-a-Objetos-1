package ar.ejercicio23;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.ejercicio22.Reserva;

public class PoliticaModeradaTest {

	private PoliticaDeCancelacion politica;
	@BeforeEach
	void setUp() {
		politica = new PoliticaModerada();
	}
	@Test
	void calcularReembolsoTest() {
		Reserva reservaManana = new Reserva(LocalDate.now().plusDays(1),LocalDate.now().plusDays(2),10);
		assertEquals(0,politica.calcularReembolso(reservaManana));
		
		Reserva reservaPasadoManana = new Reserva(LocalDate.now().plusDays(2),LocalDate.now().plusDays(3),10);
		assertEquals(0.5*reservaPasadoManana.calcularPrecio(),politica.calcularReembolso(reservaPasadoManana));
		
		Reserva reservaLejana = new Reserva(LocalDate.now().plusDays(7),LocalDate.now().plusDays(8),10);
		assertEquals(reservaLejana.calcularPrecio(),politica.calcularReembolso(reservaLejana));
	}
	
}

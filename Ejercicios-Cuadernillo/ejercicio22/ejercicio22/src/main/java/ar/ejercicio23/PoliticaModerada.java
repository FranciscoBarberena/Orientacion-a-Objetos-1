package ar.ejercicio23;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import ar.ejercicio22.Reserva;

public class PoliticaModerada implements PoliticaDeCancelacion {

	@Override
	public double calcularReembolso(Reserva reserva) {
		long antelacion = ChronoUnit.DAYS.between(LocalDate.now(),reserva.getFechaInicio());
		if (antelacion >= 7)
			return reserva.calcularPrecio();
		if (antelacion >= 2)
			return reserva.calcularPrecio() * 0.5;
		return 0;
	}

}

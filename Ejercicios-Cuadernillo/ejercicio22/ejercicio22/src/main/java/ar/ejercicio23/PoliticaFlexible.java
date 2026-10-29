package ar.ejercicio23;

import ar.ejercicio22.Reserva;

public class PoliticaFlexible implements PoliticaDeCancelacion{

	@Override
	public double calcularReembolso(Reserva reserva) {
		return reserva.calcularPrecio();
	}

	
	
}

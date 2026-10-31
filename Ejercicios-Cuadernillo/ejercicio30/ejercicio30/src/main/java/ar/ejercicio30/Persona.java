package ar.ejercicio30;

import java.time.LocalDate;

public class Persona extends Cliente{
	
	private String dni;
	@Override
	public double calcularMonto(LocalDate from, LocalDate to) {
	    return 0.9 * super.calcularMonto(from, to);
	}

}

package ar.ejercicio15;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo implements Inversion{
	
	private double montoDepositado;
	private double porcentajeInteresDiarios;
	private LocalDate fechaConstitucion;
	
	
	
	
	public double getMontoDepositado() {
		return montoDepositado;
	}



	



	public PlazoFijo(double montoDepositado, double porcentajeInteresDiarios, LocalDate fechaConstitucion) {
		this.montoDepositado = montoDepositado;
		this.porcentajeInteresDiarios = porcentajeInteresDiarios;
		this.fechaConstitucion = fechaConstitucion;
	}



	public double getValorActual() {
		return montoDepositado + porcentajeInteresDiarios*(ChronoUnit.DAYS.between(fechaConstitucion, LocalDate.now()))*montoDepositado;
	}
}

package ar.ejercicio35;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Servicio {

	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private double costoPorDia;

	public Servicio(LocalDate fechaInicio, LocalDate fechaFin, double costoPorDia) {
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.costoPorDia = costoPorDia;
	}

	protected double calcularCostoDias() {
		return calcularDias() * costoPorDia;
	}

	protected int calcularDias() {
		return (int) ChronoUnit.DAYS.between(fechaInicio, fechaFin);
	}

	public abstract double calcularCosto();

}

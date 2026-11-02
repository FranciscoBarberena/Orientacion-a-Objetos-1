package ar.ejercicio35;

import java.time.LocalDate;

public class AlquilerAuto extends Servicio{
	private double costoPorKm, kilometrosRecorridos;
	private String tipoVehiculo;

	

	public AlquilerAuto(double costoPorKm, double kilometrosRecorridos, double costoPorDia, LocalDate fechaInicio,
			LocalDate fechaFin, String tipoVehiculo) {
		super(fechaInicio, fechaFin, costoPorDia);
		this.costoPorKm = costoPorKm;
		this.kilometrosRecorridos = kilometrosRecorridos;
		this.tipoVehiculo = tipoVehiculo;
	}



	@Override
	public double calcularCosto() {
		return this.calcularCostoDias() + (costoPorKm * kilometrosRecorridos);
	}



}

package ar.Parcial_2025_11_29;

import java.time.LocalDate;

public class SuscripcionPackPromo extends Suscripcion{

	private double precioPorDia;
	private int cantidadDias;
	
	public SuscripcionPackPromo(LocalDate fechaInicio, double precioPorDia, int cantidadDias) {
		super(fechaInicio);
		this.precioPorDia = precioPorDia;
		this.cantidadDias = cantidadDias;
	}
	
	@Override
	protected double calcularCostoBase() {
		return precioPorDia*cantidadDias;
	}

}

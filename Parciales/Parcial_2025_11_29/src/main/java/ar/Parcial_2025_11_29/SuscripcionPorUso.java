package ar.Parcial_2025_11_29;

import java.time.LocalDate;

public class SuscripcionPorUso extends Suscripcion{

	private double precioPorGB;
	private double cantidadGB;
	
	
	
	public SuscripcionPorUso(LocalDate fechaInicio, double precioPorGB, double cantidadGB) {
		super(fechaInicio);
		this.precioPorGB = precioPorGB;
		this.cantidadGB = cantidadGB;
	}




	@Override
	protected double calcularCostoBase() {
		return precioPorGB*cantidadGB;
	}

}

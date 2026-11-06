package ar.Parcial_2025_11_29;

import java.time.LocalDate;

public abstract class Suscripcion {
	
	private LocalDate fechaInicio;
	
	public Suscripcion(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	private double calcularMontoConIva(double valor) {
		return valor * 1.21;
	}
	
	protected abstract double calcularCostoBase();
	
	private double calcularRecargo(LocalDate fechaPago, double monto) {
        if (fechaPago.isAfter(this.fechaInicio))
            return monto * 0.3;
        return 0.0;
    }
	
	public double montoAPagar(LocalDate fechaPago) {
		double costoBase = this.calcularCostoBase();
	    double recargo = this.calcularRecargo(fechaPago, costoBase);
	    return this.calcularMontoConIva(costoBase + recargo);
	}
	

}

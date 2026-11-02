package ar.ejercicio34;

public abstract class TipoDePlan {

	public double calcularTotal(int cantidadDeIPs,int antiguedad ) {
		return this.calcularPenalizacion(cantidadDeIPs, antiguedad) + this.calcularCostoBase();
	}

	protected abstract double calcularCostoBase();

	protected abstract double calcularPenalizacion(int cantidadDeIPs, int antiguedad);
	
}

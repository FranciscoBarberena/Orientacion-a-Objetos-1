package ar.ejercicio34;

public class PlanIndividual extends TipoDePlan {

	private int minutosContratados;

	
	
	
	
	
	public PlanIndividual(int minutosContratados) {
		this.minutosContratados = minutosContratados;
	}

	@Override
	protected double calcularCostoBase() {
		return 20 * minutosContratados;
	}

	@Override
	protected double calcularPenalizacion(int cantidadDeIPs, int antiguedad) {
		if (cantidadDeIPs <= 0)
			return 0;
		return (cantidadDeIPs - 1) * 300;
	}

}

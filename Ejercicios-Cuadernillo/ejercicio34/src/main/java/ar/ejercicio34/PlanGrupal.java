package ar.ejercicio34;

public class PlanGrupal extends TipoDePlan{

	private int cantidadLimiteIPs;
	
	
	
	
	public PlanGrupal(int cantidadLimiteIPs) {
		this.cantidadLimiteIPs = cantidadLimiteIPs;
	}

	@Override
	protected double calcularCostoBase() {
		return 800 * cantidadLimiteIPs;
	}

	@Override
	protected double calcularPenalizacion(int cantidadDeIPs, int antiguedad) {
		int excesoDeIPs = cantidadDeIPs - cantidadLimiteIPs;
		if ((antiguedad > 10) || (excesoDeIPs <= 0)){
			return 0;
		}
		return excesoDeIPs * 500;
	}

}

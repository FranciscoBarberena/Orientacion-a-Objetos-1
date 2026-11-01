package ar.ejercicio31;

public class MedioTransferencia implements MedioDePago{

	@Override
	public double calcularComision(double monto) {
		return monto * 0.01;
	}

	
	
}

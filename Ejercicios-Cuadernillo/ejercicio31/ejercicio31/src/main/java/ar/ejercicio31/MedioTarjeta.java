package ar.ejercicio31;

public class MedioTarjeta implements MedioDePago{

	@Override
	public double calcularComision(double monto) {
		return monto * 0.03;
	}

	
	
}

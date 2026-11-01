package ar.ejercicio31;

public class Venta {

	private double monto;
	private MedioDePago medioDePago;

	public double getMonto() {
		return monto;
	}

	public double calcularValor() {
		return monto + medioDePago.calcularComision(monto);
	}

}

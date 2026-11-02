package ar.ejercicio34;

public class Item {

	private String nombre;
	private double precioUnitario;
	private int cantidad;
	
	public double calcularCosto() {
		return precioUnitario * cantidad;
	}

}

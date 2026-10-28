package ar.ejercicio15;

public class Accion implements Inversion{
	private String nombre;
	private int cantidad;
	private double valorUnitario;
	
	
	
	
	public Accion(String nombre, int cantidad, double valorUnitario) {
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.valorUnitario = valorUnitario;
	}



	

	public double getValorUnitario() {
		return valorUnitario;
	}







	public double getValorActual() {
		return cantidad*valorUnitario;
	}
	
}

package ar.edu.unlp.oo1.ejercicio2;
public class Producto {
	private double peso;
	private double precioPorKilo;
	private String descripcion;
	
	
	
	public double getPeso() {
		return peso;
	}

	

	public Producto(String descripcion, double peso,double precioPorKilo) {
		this.peso = peso;
		this.precioPorKilo = precioPorKilo;
		this.descripcion = descripcion;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}



	public double getPrecioPorKilo() {
		return precioPorKilo;
	}



	public void setPrecioPorKilo(double precioPorKilo) {
		this.precioPorKilo = precioPorKilo;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public double getPrecio() {
		return getPeso()*getPrecioPorKilo();
	}
}

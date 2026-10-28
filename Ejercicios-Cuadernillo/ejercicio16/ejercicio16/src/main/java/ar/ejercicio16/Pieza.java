package ar.ejercicio16;

public abstract class Pieza {

	private String material;
	private String color;
	
	
	public Pieza(String material, String color) {
		this.material = material;
		this.color = color;
	}
	
	public abstract double calcularVolumen();
	public abstract double calcularSuperficie();
	
	
	
	
	public String getMaterial() {
		return material;
	}
	public String getColor() {
		return color;
	}

	
	
}

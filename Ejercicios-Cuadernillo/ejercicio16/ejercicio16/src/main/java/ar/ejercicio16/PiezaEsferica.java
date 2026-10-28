package ar.ejercicio16;

public class PiezaEsferica extends Pieza {

	

	private double radio;

	
	public PiezaEsferica(String material, String color, double radio) {
		super(material, color);
		this.radio = radio;
	}
	
	@Override
	public double calcularVolumen() {
		return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
	}

	@Override
	public double calcularSuperficie() {
		return 4 * Math.PI * Math.pow(radio, 2);
	}

}

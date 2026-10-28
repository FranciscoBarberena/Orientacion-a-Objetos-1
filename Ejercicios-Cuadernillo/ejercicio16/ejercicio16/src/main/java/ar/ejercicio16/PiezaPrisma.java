package ar.ejercicio16;

public class PiezaPrisma extends Pieza {

	

	private double ladoMayor;
	private double ladoMenor;
	private double altura;

	public PiezaPrisma(String material, String color, double altura, double ladoMayor, double ladoMenor) {
		super(material, color);
		this.altura = altura;
		this.ladoMayor = ladoMayor;
		this.ladoMenor = ladoMenor;
	}
	
	
	@Override
	public double calcularVolumen() {
		return ladoMayor * ladoMenor * altura;
	}

	@Override
	public double calcularSuperficie() {
		return 2 * (ladoMayor * ladoMenor + ladoMayor * altura + ladoMenor * altura);
	}

}

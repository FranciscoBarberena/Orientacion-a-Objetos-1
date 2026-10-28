package ar.ejercicio16;

import java.util.ArrayList;
import java.util.List;

public class ReporteDeConstruccion {
	
	
	private List<Pieza> piezas;
	
	public ReporteDeConstruccion() {
		piezas = new ArrayList<>();
	}
	
	
	
	public List<Pieza> getPiezas() {
		return piezas;
	}



	public double volumenDeMaterial(String material) {
		return piezas.stream().filter(pieza -> pieza.getMaterial().equals(material))
				.mapToDouble(pieza->pieza.calcularVolumen())
				.sum();
		
	}
	public double superficieDeColor(String color) {
		return piezas.stream().filter(pieza -> pieza.getColor().equals(color))
				.mapToDouble(pieza -> pieza.calcularSuperficie())
				.sum();
	}
	
	public boolean agregarPieza(Pieza pieza) {
		return piezas.add(pieza);
	}
}

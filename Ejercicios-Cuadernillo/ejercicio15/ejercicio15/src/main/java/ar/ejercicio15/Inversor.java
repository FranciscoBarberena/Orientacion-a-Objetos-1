package ar.ejercicio15;

import java.util.ArrayList;
import java.util.List;

public class Inversor {
	
	private List<Inversion> cartera; 
	
	
	
	public List<Inversion> getCartera() {
		return cartera;
	}

	public Inversor() {
		cartera = new ArrayList<>();
	}
	
	public boolean agregarInversion(Inversion inv) {
		return cartera.add(inv);
	}
	public boolean quitarInversion(Inversion inv) {
		return cartera.remove(inv);
	}
	public double valorCartera() {
		return cartera.stream().mapToDouble(inversion -> inversion.getValorActual()).sum();
	}

	
}

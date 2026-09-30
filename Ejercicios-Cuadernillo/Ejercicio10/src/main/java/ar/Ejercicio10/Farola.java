package ar.Ejercicio10;

import java.util.ArrayList;
import java.util.List;

public class Farola {
	
	private boolean encendida;
	private List<Farola> vecinas;
	
	public Farola() {
		encendida = false;
		vecinas = new ArrayList<>();
	}
	
	public void pairWithNeighbor( Farola otraFarola ) {
		vecinas.add(otraFarola);
		otraFarola.getNeighbors().add(this);
	}
	
	
	public List<Farola> getNeighbors() {
		return vecinas;
	}

	public void turnOn(){
		if (this.isOff()) {
			encendida = true;
			for (Farola v : vecinas) {
				v.turnOn();
			}
		}
	}
	
	public void turnOff(){
		if (this.isOn()) {
			encendida = false;
			for (Farola v : vecinas) {
				v.turnOff();
			}
		}
	}
	
	public boolean isOn() {
		return encendida;
	}
	
	public boolean isOff() {
		return !encendida;
	}



	
}

package ar.ejercicio22;

import java.time.LocalDate;

import ar.ejercicio18.DateInterface;
import ar.ejercicio18.DateLapse;

public class Reserva {

	private DateInterface rango;
	private double precioPorNocheHistorico;
	

	public Reserva(LocalDate inicio, LocalDate fin, double precioPorNocheHistorico)  {
		rango = new DateLapse(inicio,fin);
		this.precioPorNocheHistorico = precioPorNocheHistorico;
	}
	
	
	public boolean estaEnRango(LocalDate inicio, LocalDate fin) {
		DateInterface rangoARevisar = new DateLapse(inicio, fin);
		return this.rango.overlaps(rangoARevisar);
	}
	

	public double calcularPrecio() {
		return rango.sizeInDays()*this.precioPorNocheHistorico;
	}


	public boolean isCurrent() {
		return rango.isCurrentlyHappening();
	}


	public LocalDate getFechaInicio() {
		// TODO Auto-generated method stub
		return rango.getFrom();
	}

}

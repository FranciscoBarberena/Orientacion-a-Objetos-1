package ar.ejercicio34;

import java.time.LocalDate;

import ar.ejercicio18.DateLapse;

public abstract class Actividad {

	private LocalDate fechaInicio;
	private String ip;
	protected int minutosTotales;
	
	
	
	
	public Actividad(LocalDate fechaInicio, String ip, int minutosTotales) {
		this.fechaInicio = fechaInicio;
		this.ip = ip;
		this.minutosTotales = minutosTotales;
	}

	public String getIP() {
		return ip;
	}

	public abstract double calcularMonto();

	public boolean estoyEnRango(DateLapse rango) {
		return rango.includesDate(fechaInicio);
	}

}

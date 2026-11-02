package ar.ejercicio34;

import java.time.LocalDate;

public class Video extends Actividad{

	

	private int minutosPublicidad;
	
	public Video(LocalDate fechaInicio, String ip, int minutosTotales, int minutosPublicidad) {
		super(fechaInicio, ip, minutosTotales);
		this.minutosPublicidad = minutosPublicidad;
	}
	
	@Override
	public double calcularMonto() {
		return 10 * minutosReales();
	}

	private int minutosReales() {
		return minutosTotales - minutosPublicidad;
	}

	
	
}

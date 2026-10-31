package ar.ejercicio28;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Material {

	private String titulo; 
	private LocalDate fechaIncorporacion;
	
	
	
	
	public Material(String titulo, LocalDate fechaIncorporacion) {
		this.titulo = titulo;
		this.fechaIncorporacion = fechaIncorporacion;
	}

	public int antiguedad() {
		return (int) ChronoUnit.YEARS.between(fechaIncorporacion, LocalDate.now());
	}
	
	public boolean incorporadoAntesDe(int anio) {
		return fechaIncorporacion.getYear() < anio;
	}
	
}

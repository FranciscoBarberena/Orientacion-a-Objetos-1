package ar.ejercicio30;

import java.time.LocalDate;

public abstract class Envio {

	protected LocalDate fechaDespacho;
	protected String direccionOrigen;
	protected String direccionDestino;
	protected double pesoGramos;

	
	public abstract double calcularCosto();

	public Envio(LocalDate fechaDespacho, String direccionOrigen, String direccionDestino, double pesoGramos) {
		this.fechaDespacho = fechaDespacho;
		this.direccionOrigen = direccionOrigen;
		this.direccionDestino = direccionDestino;
		this.pesoGramos = pesoGramos;
	}
	
	
	public boolean estoyEnRango(LocalDate from, LocalDate to) {
		return !fechaDespacho.isBefore(from) && !fechaDespacho.isAfter(to);
	}
	
	
}

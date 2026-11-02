package ar.ejercicio34;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import ar.ejercicio18.DateLapse;

public class Cliente {

	private LocalDate fechaDeAlta;
	private String nombre;
	private List<Actividad> actividades;
	private TipoDePlan plan;
	
	
	
	public Cliente(LocalDate fechaDeAlta, String nombre) {
		this.fechaDeAlta = fechaDeAlta;
		this.nombre = nombre;
		actividades = new ArrayList<>();
	}

	public int antiguedad() { //Es publico para los tests, deberia ser privado
		return Period.between(fechaDeAlta, LocalDate.now()).getYears();
	}
	
	int cantidadDeIPs(DateLapse rango) { //Es publico para los tests, deberia ser privado
		return (int) actividades.stream()
				.filter(actividad -> actividad.estoyEnRango(rango))
				.map(actividad -> actividad.getIP())
				.distinct()
				.count();
	}
	
	public double calcularMonto(LocalDate from, LocalDate to) {
		DateLapse rango = new DateLapse(from,to);
		return plan.calcularTotal(cantidadDeIPs(rango), antiguedad()) + 
				actividades.stream()
				.filter(actividad -> actividad.estoyEnRango(rango))
				.mapToDouble(actividad -> actividad.calcularMonto())
				.sum();
	}
	
	public boolean agregarActividad(Actividad actividad) {
		return actividades.add(actividad);
	}

	public void cambiarDePlan(TipoDePlan plan) {
		this.plan = plan;
	}
	
	
}

package ar.ejercicio22;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String nombre;
	private String direccion;
	private String DNI;
	private List<Inmueble> propiedades;
	private List<Reserva> reservas;
	
	
	
	
	public Usuario(String nombre, String direccion, String dni) {
		this.nombre = nombre;
		this.direccion = direccion;
		DNI = dni;
		reservas = new ArrayList<>();
		propiedades = new ArrayList<>();
	}




	public double calcularIngresos(LocalDate inicio, LocalDate fin) {
		return 0.75*propiedades.stream()
				.mapToDouble(propiedad -> propiedad.calcularIngresos(inicio,fin))
				.sum();
	}




	public boolean agregarReserva(Reserva reserva) {
		return reservas.add(reserva);
		
	}




	public boolean eliminarReserva(Reserva reserva) {
		return reservas.remove(reserva);
		
	}
	
}

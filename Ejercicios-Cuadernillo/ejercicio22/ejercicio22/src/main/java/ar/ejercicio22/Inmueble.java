package ar.ejercicio22;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Inmueble {

	private String direccion;
	private String nombre;
	private double precioPorNoche;
	private List<Reserva> reservas;
	
	
	
	
	public Inmueble(String direccion, String nombre, double precioPorNoche) {
		this.direccion = direccion;
		this.nombre = nombre;
		this.precioPorNoche = precioPorNoche;
		this.reservas = new ArrayList<>();
	}

	public double getPrecioPorNoche() {
		return precioPorNoche;
	}

	public boolean isAvailable(LocalDate inicio, LocalDate fin) {
		Reserva encontrada = reservas.stream().filter(reserva -> reserva.estaEnRango(inicio, fin)).findFirst()
				.orElse(null);
		if (encontrada == null)
			return true;
		return false;
	}

	public double calcularIngresos(LocalDate inicio, LocalDate fin) {
		return reservas.stream().filter(reserva -> reserva.estaEnRango(inicio,fin)).mapToDouble(reserva -> reserva.calcularPrecio()).sum();
	}

	public boolean crearReserva(LocalDate inicio, LocalDate fin, Usuario inquilino) {
		if (this.isAvailable(inicio, fin)) {
			Reserva reserva = new Reserva(inicio, fin,this.getPrecioPorNoche());
			reservas.add(reserva);
			inquilino.agregarReserva(reserva);
			return true;
		}
		return false;
	}
	
	public boolean cancelarReserva (Reserva reserva, Usuario inquilino) {
		if (reserva.estaEnRango(LocalDate.MIN, LocalDate.now()))
			return false;
		reservas.remove(reserva);
		inquilino.eliminarReserva(reserva);
		return true;
	}

}

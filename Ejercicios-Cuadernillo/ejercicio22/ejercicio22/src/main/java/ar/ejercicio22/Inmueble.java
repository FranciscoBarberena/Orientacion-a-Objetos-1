package ar.ejercicio22;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ar.ejercicio23.PoliticaDeCancelacion;

public class Inmueble {

	private String direccion;
	private String nombre;
	private double precioPorNoche;
	private List<Reserva> reservas;
	private PoliticaDeCancelacion politica;
	
	
	
	
	public Inmueble(String direccion, String nombre, double precioPorNoche,PoliticaDeCancelacion politica) {
		this.direccion = direccion;
		this.nombre = nombre;
		this.precioPorNoche = precioPorNoche;
		this.reservas = new ArrayList<>();
		this.politica = politica;
	}
	
	

	public void setPolitica(PoliticaDeCancelacion politica) {
		this.politica = politica;
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
	
	public double cancelarReserva (Reserva reserva, Usuario inquilino) {
		if (reserva.isCurrent())
			return -1; //Debería ser una excepción o algo por el estilo
		reservas.remove(reserva);
		inquilino.eliminarReserva(reserva);
		return this.politica.calcularReembolso(reserva);
		
	}

}

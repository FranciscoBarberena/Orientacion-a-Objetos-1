package ar.ejercicio35;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private List<Servicio> listaServicios;

	public Usuario(String nombre) {
		this.nombre = nombre;
		this.listaServicios = new ArrayList<>();
	}

	public void agregarServicio(Servicio servicio) {
		listaServicios.add(servicio);
	}

	public double calcularGastoTotal() {
		return listaServicios.stream().mapToDouble(servicio -> servicio.calcularCosto()).sum();
	}
}

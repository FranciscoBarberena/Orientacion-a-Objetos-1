package ar.ejercicio30;

import java.time.LocalDate;
import java.util.List;

public abstract class Cliente {
	
	private String nombre;
	private String direccion;
	private List<Envio> envios;
	
	public double calcularMonto(LocalDate from, LocalDate to) {
		return envios.stream().filter(envio -> envio.estoyEnRango(from, to)).mapToDouble(envio -> envio.calcularCosto()).sum();
	}

}

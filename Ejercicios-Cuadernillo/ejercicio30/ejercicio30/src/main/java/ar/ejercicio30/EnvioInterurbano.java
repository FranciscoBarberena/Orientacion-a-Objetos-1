package ar.ejercicio30;

import java.time.LocalDate;

public class EnvioInterurbano extends Envio{

	public EnvioInterurbano(LocalDate fechaDespacho, String direccionOrigen, String direccionDestino,
			double pesoGramos) {
		super(fechaDespacho, direccionOrigen, direccionDestino, pesoGramos);
	}

	@Override
	public double calcularCosto() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}

package ar.ejercicio30;

import java.time.LocalDate;

public class EnvioInternacional extends Envio {

	
	private PoliticaDeEnvio politica;

	public EnvioInternacional(LocalDate fechaDespacho, String direccionOrigen, String direccionDestino, double pesoGramos,
			PoliticaDeEnvio politica) {
		super(fechaDespacho, direccionOrigen, direccionDestino, pesoGramos);
		this.politica = politica;
	}


	@Override
	public double calcularCosto() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

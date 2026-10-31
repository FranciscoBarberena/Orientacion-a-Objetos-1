package ar.ejercicio28;

import java.time.LocalDate;

public class RevistaDigital extends MaterialDigital  {

	private int numero;

	
	
	public RevistaDigital(String titulo, LocalDate fechaIncorporacion, String nombreArchivo, double pesoArchivoMB,
			int numero) {
		super(titulo, fechaIncorporacion, nombreArchivo, pesoArchivoMB);
		this.numero = numero;
	}



	@Override
	protected String getCarpeta() {
		// TODO Auto-generated method stub
		return "revistas";
	}

	
	
	
	
	
	
	
}

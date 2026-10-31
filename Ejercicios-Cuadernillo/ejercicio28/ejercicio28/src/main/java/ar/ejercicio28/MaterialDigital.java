package ar.ejercicio28;

import java.time.LocalDate;

public abstract class MaterialDigital extends Material implements Descargable {

	

	private String nombreArchivo;
	private double pesoArchivoMB;

	
	
	public MaterialDigital(String titulo, LocalDate fechaIncorporacion, String nombreArchivo, double pesoArchivoMB) {
		super(titulo, fechaIncorporacion);
		this.nombreArchivo = nombreArchivo;
		this.pesoArchivoMB = pesoArchivoMB;
	}

	@Override
	public String enlaceDeDescarga() {
		return ("https://biblioteca.example.org/descargas/" + this.getCarpeta() + "/" + nombreArchivo);
	}

	protected abstract String getCarpeta();

	@Override
	public double tamanioEnMB() {
		return pesoArchivoMB;
	}

}

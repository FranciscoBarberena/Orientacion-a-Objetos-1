package ar.ejercicio28;

import java.time.LocalDate;

public class LibroDigital extends MaterialDigital{

	private String autor;

	
	public LibroDigital(String titulo, LocalDate fecha, String nombreArchivo, double peso, String autor) {
	    super(titulo, fecha, nombreArchivo, peso); // Llama al constructor de MaterialDigital
	    this.autor = autor;
	}
	
	@Override
	protected String getCarpeta() {
		// TODO Auto-generated method stub
		return "libros";
	}
	
	
	
	
}

package ar.ejercicio24;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String nombreCompleto;
	private String domicilio;
	private List<Orden> ordenes;
	
	
	
	
	public Usuario(String nombreCompleto, String domicilio) {
		this.nombreCompleto = nombreCompleto;
		this.domicilio = domicilio;
		this.ordenes = new ArrayList<>();
	}


	public boolean agregarOrden(Orden orden) {
		return ordenes.add(orden);
	}
	
	
	public List<Orden> getOrdenes(){
		return this.ordenes;
	}
}

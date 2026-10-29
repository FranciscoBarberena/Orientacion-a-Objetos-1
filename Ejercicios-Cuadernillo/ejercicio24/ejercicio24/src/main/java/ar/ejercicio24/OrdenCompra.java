package ar.ejercicio24;

import java.time.LocalDate;
import java.util.List;

public class OrdenCompra extends Orden{


	private double precioEnvio;
	
	
	public OrdenCompra(Usuario usuario, LocalDate fecha, String domicilio, double precioEnvio) {
		super(usuario, fecha, domicilio);
		this.precioEnvio = precioEnvio;
	}


	protected boolean aplicoDescuento() {
		return this.getCantidadDeProductos()>=5;
	}
	
	
	
}

package ar.ejercicio07;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ticket {
	private LocalDate fecha;
	private List<Producto> productos;
	
	
	public Ticket(LocalDate fecha, List<Producto> productos) {
		this.fecha = fecha;
		if (productos != null) {
			this.productos = new ArrayList<>();
			this.productos.addAll(productos); //Esto esta mal porque siguen siendo los mismos objetos
		}
			
	}


	
	public LocalDate getFecha() {
		return fecha;
	}

	
	public List<Producto> getProductos() {
		return productos;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public int getCantidadDeProductos() {
		return productos.size();
	}




	public double getPesoTotal() {
		double pesoTotal = 0;
		for (Producto p : productos)
			pesoTotal += p.getPeso();
		return pesoTotal;
	}



	public double getPrecioTotal() {
		double precioTotal = 0;
		for (Producto p : productos)
			precioTotal += p.getPrecio();
		return precioTotal;
	}



	public double impuesto() {
		return 0.21*getPrecioTotal();
	}
}

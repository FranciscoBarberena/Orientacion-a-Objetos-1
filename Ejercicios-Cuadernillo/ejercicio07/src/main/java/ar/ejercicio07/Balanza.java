package ar.ejercicio07;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Balanza {
	
	private List<Producto> productos;

	
	
	
	public Balanza() {
		this.productos = new ArrayList<>();
	}

	public void ponerEnCero() {
		productos.clear();
	}
	
	public void agregarProducto (Producto producto) {
		productos.add(producto);

	}
	
	
	public List<Producto> getProductos() {
		return productos;
	}

	public int getCantidadDeProductos() {
		return productos.size();
	}
	
	public double getPrecioTotal() {
		double precioTotal = 0;
		for (Producto p : productos)
			precioTotal += p.getPrecio();
		return precioTotal;
	}
	
	public double getPesoTotal() {
		double pesoTotal = 0;
		for (Producto p : productos)
			pesoTotal += p.getPeso();
		return pesoTotal;
	}

	
	public Ticket emitirTicket() {
		Ticket tick = new Ticket(LocalDate.now(),this.getProductos());
		return tick;
	}
}

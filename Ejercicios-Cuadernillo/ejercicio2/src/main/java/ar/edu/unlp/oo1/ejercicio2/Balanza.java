package ar.edu.unlp.oo1.ejercicio2;
import java.time.LocalDate;
public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	public void ponerEnCero() {
		cantidadDeProductos = 0;
		precioTotal = 0;
		pesoTotal = 0;
	}
	public void agregarProducto (Producto producto) {
		
	}
	
	
	
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}
	public double getPrecioTotal() {
		return precioTotal;
	}
	public double getPesoTotal() {
		return pesoTotal;
	}

	
	public Ticket emitirTicket() {
		Ticket tick = new Ticket(LocalDate.now(),cantidadDeProductos,pesoTotal,precioTotal);
		return tick;
	}
}

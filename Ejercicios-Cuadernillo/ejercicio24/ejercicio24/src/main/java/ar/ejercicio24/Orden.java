package ar.ejercicio24;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Orden {

	private Usuario usuario;
	private LocalDate fecha;
	private String domicilio;
	private List<Producto> productos;
	
	
	
	
	public Orden(Usuario usuario, LocalDate fecha, String domicilio) {
		this.usuario = usuario;
		this.fecha = fecha;
		this.domicilio = domicilio;
		this.productos = new ArrayList<>();
	}


	protected abstract boolean aplicoDescuento();


	protected int getCantidadDeProductos() {
		return productos.size();
	}
	
	public double calcularCosto() {
		double valorSinDescuento = this.calcularCostoBase();
		if (this.aplicoDescuento())
			return valorSinDescuento * 0.9;
		return valorSinDescuento;
	}
	
	protected double calcularCostoBase() {
		return productos.stream().mapToDouble(producto -> producto.getCosto()).sum();
	}
	
	public boolean agregarProducto(Producto producto) {
		return productos.add(producto);
	}
	
	
	
}

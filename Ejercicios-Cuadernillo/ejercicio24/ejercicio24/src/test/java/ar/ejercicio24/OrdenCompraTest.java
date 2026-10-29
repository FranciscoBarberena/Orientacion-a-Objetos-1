package ar.ejercicio24;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrdenCompraTest {
	private Orden orden;
	private Producto producto0;
	private Producto producto1;
	private Producto producto2;
	private Producto producto3;
	private Producto producto4;

	@BeforeEach
	void setUp() {
		orden = new OrdenCompra(new Usuario("Pepe", "123"), LocalDate.now(), "1234", 100);
		producto0 = new Producto("producto", "hierro", 1000, false);
		producto1 = new Producto("producto", "hierro", 2000, false);
		producto2 = new Producto("producto", "hierro", 500, false);
		producto3 = new Producto("producto", "hierro", 500, false);
		producto4 = new Producto("producto", "hierro", 1000, false);
	}

	@Test
	void testCalcularCostoSinProductos() {
		assertEquals(0, orden.calcularCosto());

	}

	@Test
	void testCalcularCostoSinDescuento() {
		orden.agregarProducto(producto0);
		orden.agregarProducto(producto1);
		orden.agregarProducto(producto2);
		orden.agregarProducto(producto3);
		assertEquals(4000, orden.calcularCosto());
	}
	
	@Test
	void testCalcularCostoConDescuento() {
		orden.agregarProducto(producto0);
		orden.agregarProducto(producto1);
		orden.agregarProducto(producto2);
		orden.agregarProducto(producto3);
		orden.agregarProducto(producto4);
		assertEquals(4500, orden.calcularCosto());
	}
}

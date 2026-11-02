package ar.ejercicio34;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.ejercicio18.DateLapse;

public class ClienteTest {
	
	private Cliente cliente;
	private Cliente cliente2;

	
	@BeforeEach
	void setUp() {
		cliente = new Cliente(LocalDate.now(),"Nuevo");
		cliente2 = new Cliente(LocalDate.now().minusYears(1),"Viejo");
	}
	
	@Test
	void antiguedadTest() {
		assertEquals(0,cliente.antiguedad());
		assertEquals(1,cliente2.antiguedad());
	}
	
	@Test
	void cantidadDeIPsTest() {
		// NO hace falta probar los valores del rango, porque eso deberia testearse en DateLapse ?? Aca solo pruebo las 2 particiones
		// sin IPs y con 1 o mas IP (pruebo borde que seria con 1 IP, y uno mas que seria con 2 IPs)
		
		// Particion vacia
		DateLapse rango = new DateLapse(LocalDate.MIN, LocalDate.now());
		assertEquals(0,cliente.cantidadDeIPs(rango));
		
		// Particion con 1 IP
		Actividad actividad1 = new Juego(LocalDate.of(2026,1,1),"IP1",20);
		Actividad actividad2 = new Video(LocalDate.of(2025,1,1),"IP1",20,0);
		cliente.agregarActividad(actividad1);
		assertEquals(1, cliente.cantidadDeIPs(rango));
		cliente.agregarActividad(actividad2);
		assertEquals(1, cliente.cantidadDeIPs(rango));
		
		// Particion con 2 IP
		Actividad actividad3 = new Video(LocalDate.of(2025,1,1),"IP2",20,0);
		cliente.agregarActividad(actividad3);
		assertEquals(2, cliente.cantidadDeIPs(rango));

	}
	
}

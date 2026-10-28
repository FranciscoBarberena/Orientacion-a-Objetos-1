package ar.ejercicio17;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestClienteDeCorreo {
	
	private ClienteDeCorreo cliente; 
	
	@BeforeEach
	void setUp() {
		cliente = new ClienteDeCorreo();
	}
	
	@Test
	void testEspacioOcupado() {
		assertEquals(0, cliente.espacioOcupado());
		Carpeta carpeta = new Carpeta();
		cliente.getCarpetas().add(carpeta);
		assertEquals(0, cliente.espacioOcupado());
		Email email = new Email(new ArrayList<>(),"1","1");
		cliente.recibir(email);
		assertEquals(2, cliente.espacioOcupado());
		cliente.recibir(email);
		assertEquals(4, cliente.espacioOcupado());
		carpeta.agregarEmail(email);
		assertEquals(6, cliente.espacioOcupado());
		carpeta.agregarEmail(email);
		assertEquals(8, cliente.espacioOcupado());
	}
	@Test
	void testBuscar() {
		assertEquals(null,cliente.buscar("1"));
		Email email = new Email(new ArrayList<>(),"1","2");
		cliente.recibir(email);
		assertSame(email,cliente.buscar("1"));
		Email email2 = new Email(new ArrayList<>(),"p","s");
		Carpeta carpeta = new Carpeta();
		cliente.getCarpetas().add(carpeta);
		carpeta.agregarEmail(email2);
		assertSame(email2,cliente.buscar("p"));
		
	}
}

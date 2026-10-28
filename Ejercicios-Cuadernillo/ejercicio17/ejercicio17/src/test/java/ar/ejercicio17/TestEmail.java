package ar.ejercicio17;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestEmail {

	private Email email;
	
	@BeforeEach
	void setUp() {
		email = new Email(new ArrayList<>(),"1234","1234");
	}
	
	@Test
	void testTamanio() {
		assertEquals(8, email.tamanio());
		Archivo adjunto = new Archivo("12345");
		email.agregarAdjunto(adjunto);
		assertEquals(13, email.tamanio());
	}
	
}

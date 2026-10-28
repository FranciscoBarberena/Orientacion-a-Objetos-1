package ar.ejercicio17;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {
	
	private List<Email> emails;
	
	public Carpeta() {
		emails = new ArrayList<>();
	}
	
	public String getNombre() {
		return null;
	}
	
	
	
	public List<Email> getEmails() {
		return emails;
	}

	public void mover(Email email, Carpeta destino) {
		emails.remove(email);
		destino.agregarEmail(email);
	}
	
	public boolean agregarEmail(Email email) {
		return emails.add(email);
	}

	public Email buscar(String texto) {
		return emails.stream().filter(email -> email.contieneTexto(texto)).findFirst().orElse(null);
	}

	public int tamanio() {
		return emails.stream().mapToInt(email -> email.tamanio()).sum();
	}
}

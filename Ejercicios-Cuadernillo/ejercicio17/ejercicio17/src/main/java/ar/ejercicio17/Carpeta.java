package ar.ejercicio17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import unlp.oo1.bag.Bag;
import unlp.oo1.bag.BagImpl;

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

	// Ejercicio 26

	public int cantidadDeMails() {
		return emails.size();
	}

	public Bag<String> clasificarPorCategoria() {

		Bag<String> mapaTamanio = emails.stream().map(email -> email.tamanio()).map(numero -> {
			if (numero <= 300)
				return "Pequeño";
			if (numero <= 500)
				return "Mediano";
			return "Grande";
		}).collect(Collectors.toCollection(BagImpl::new));
		return mapaTamanio;
	}

	public String reportePorDia() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Bag<String> mapaReporte = emails.stream()
				.map(email -> email.getFechaRecibido().format(formatter))
				.collect(Collectors.toCollection(BagImpl::new));
		return mapaReporte.toString();
	}
}

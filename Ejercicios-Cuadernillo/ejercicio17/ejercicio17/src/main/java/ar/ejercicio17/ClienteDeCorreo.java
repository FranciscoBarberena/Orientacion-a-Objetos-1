package ar.ejercicio17;

import java.util.ArrayList;
import java.util.List;

public class ClienteDeCorreo {

	private Carpeta inbox;
	private List<Carpeta> carpetas;

	public ClienteDeCorreo() {
		this.inbox = new Carpeta();
		this.carpetas = new ArrayList<>();
		carpetas.add(inbox);
	}

	public List<Carpeta> getCarpetas() {
		return carpetas;
	}

	public void recibir(Email email) {
		inbox.agregarEmail(email);
	}

	public Email buscar(String texto) {

		Email encontrado = carpetas.stream().
				map(carpeta -> carpeta.buscar(texto))
				.filter(emailEncontrado -> emailEncontrado != null)
				.findFirst()
				.orElse(null);

		return encontrado;
	}

	public int espacioOcupado() {
		int espacioCarpetas = carpetas.stream().mapToInt(carpeta -> carpeta.tamanio()).sum();
		return espacioCarpetas;
	}
	
	// Ejercicio 26
	
	public int cantidadDeMailsTotal() {
		return carpetas.stream().mapToInt(carpeta -> carpeta.cantidadDeMails()).sum();
	}

}

package ar.ejercicio17;

import java.util.ArrayList;
import java.util.List;

public class ClienteDeCorreo {

	private Carpeta inbox;
	private List<Carpeta> carpetas;
	
	
	public ClienteDeCorreo() {
	    this.inbox = new Carpeta();
	    this.carpetas = new ArrayList<>();
	}
	
	
	
	





	public List<Carpeta> getCarpetas() {
		return carpetas;
	}




	public void recibir(Email email) {
		inbox.agregarEmail(email);
	}
	
	public Email buscar (String texto) {
		Email encontrado = inbox.buscar(texto);
		if (encontrado == null) {
			encontrado = carpetas.stream()
						.map(carpeta -> carpeta.buscar(texto))
						.filter(emailEncontrado -> emailEncontrado != null)
						.findFirst()
						.orElse(null);
		}
		return encontrado;
	}
	public int espacioOcupado() {
		int espacioInbox = inbox.tamanio();
		int espacioCarpetas = carpetas.stream().mapToInt(carpeta -> carpeta.tamanio()).sum();
		return espacioInbox + espacioCarpetas;
	}
	
}

package ar.ejercicio17;

import java.util.List;

public class Email {
	
	private List<Archivo> adjuntos;
	private String titulo;
	private String cuerpo;
	
	
	
	
	public Email(List<Archivo> adjuntos, String titulo, String cuerpo) {
		this.adjuntos = adjuntos;
		this.titulo = titulo;
		this.cuerpo = cuerpo;
	}
	
	public boolean agregarAdjunto(Archivo adjunto) {
		return adjuntos.add(adjunto);
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	public String getCuerpo() {
		return this.cuerpo;
	}
	public List<Archivo> adjuntos(){
		return adjuntos;
	}
	public boolean contieneTexto(String texto) {
		return titulo.contains(texto) || cuerpo.contains(texto);
	}
	public int tamanio() {
		return titulo.length() + cuerpo.length() + adjuntos.stream().mapToInt(adjunto -> adjunto.tamanio()).sum();
	}
}

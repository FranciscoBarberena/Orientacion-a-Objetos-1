package ar.ejercicio24;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrdenServicio extends Orden{

	private int horas;
	private String descripcion;
	private List<Tecnico> tecnicos;
	
	public OrdenServicio(Usuario usuario, LocalDate fecha, String domicilio, int horas, String descripcion) {
		super(usuario, fecha, domicilio);
		this.horas = horas;
		this.descripcion = descripcion;
		this.tecnicos = new ArrayList<>();
		
	}
	
	
	@Override
	protected double calcularCostoBase() {
		return super.calcularCostoBase() + tecnicos.stream().mapToDouble(tecnico -> tecnico.getValorHora()*horas).sum();
	}
	
	@Override
	protected boolean aplicoDescuento() {
		return horas > 10;
	}
	
	public boolean agregarTecnico(Tecnico tecnico){
		return tecnicos.add(tecnico);
	}
}

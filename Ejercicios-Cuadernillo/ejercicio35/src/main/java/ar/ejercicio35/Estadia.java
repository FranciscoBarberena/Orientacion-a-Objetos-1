package ar.ejercicio35;

import java.time.LocalDate;

public class Estadia extends Servicio{
	  private String destino;
	  private int cantidadPersonas;  
	 

	  public Estadia(String destino, double costoPorDia, LocalDate fechaInicio, LocalDate fechaFin,
			int cantidadPersonas) {
			super(fechaInicio, fechaFin, costoPorDia);
		this.destino = destino;
		this.cantidadPersonas = cantidadPersonas;
	}



	  @Override
	  public double calcularCosto() {
		return this.calcularCostoDias() * cantidadPersonas;
	  } 
}


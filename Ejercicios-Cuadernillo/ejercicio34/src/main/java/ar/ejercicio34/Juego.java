package ar.ejercicio34;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Juego extends Actividad{

	

	private List<Item> items;
	
	
	public Juego(LocalDate fechaInicio, String ip, int minutosTotales) {
		super(fechaInicio, ip, minutosTotales);
		items = new ArrayList<>();
	}
	
	@Override
	public double calcularMonto() {
		if (minutosTotales <= 360)
			return 0;
		return items.stream().mapToDouble(item -> item.calcularCosto()).sum();
	}
	
	public boolean agregarItem(Item item) {
		return items.add(item);
	}

}

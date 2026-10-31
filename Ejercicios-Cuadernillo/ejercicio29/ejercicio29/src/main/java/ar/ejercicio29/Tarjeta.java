package ar.ejercicio29;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Tarjeta implements MetodoDePago{

	
	private List<Compra> compras;
	private String numero;
	private String titular;
	private LocalDate vencimiento;
	
	
	

	public Tarjeta(String numero, String titular, LocalDate vencimiento) {
		this.numero = numero;
		this.titular = titular;
		this.vencimiento = vencimiento;
		this.compras = new ArrayList<>();
	}

	public boolean autorizarPago(double monto) {
		return vencimiento.isAfter(LocalDate.now());
	}

	public void pagar(double monto) {
		compras.add(new Compra(LocalDate.now(),monto));
		
	}

}

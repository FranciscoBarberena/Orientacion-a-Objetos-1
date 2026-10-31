package ar.ejercicio29;

public class CuentaDNI implements MetodoDePago{

	private String sucursal;
	private String numero;
	private double saldo;
	
	
	@Override
	public boolean autorizarPago(double monto) {
		return this.saldo >= monto;
	}
	@Override
	public void pagar(double monto) {
		this.saldo = this.saldo - monto;
	}
	
	
	
}

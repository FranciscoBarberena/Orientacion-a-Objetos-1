package ar.ejercicio12;

public class CuentaCorriente extends Cuenta{

	private double limiteDescubierto;
	
	
	public CuentaCorriente() {
		super();
		this.limiteDescubierto = 0;
	}


	public boolean puedeExtraer(double monto) {
		return -(this.getSaldo()-monto) <= this.limiteDescubierto;
	}


	public double getLimiteDescubierto() {
		return limiteDescubierto;
	}


	public void setLimiteDescubierto(double limiteDescubierto) {
		this.limiteDescubierto = limiteDescubierto;
	}
	
	
}

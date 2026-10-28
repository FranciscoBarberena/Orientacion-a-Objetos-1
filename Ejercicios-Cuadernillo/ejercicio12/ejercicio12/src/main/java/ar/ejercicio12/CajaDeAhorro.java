package ar.ejercicio12;

public class CajaDeAhorro extends Cuenta {
	@Override
	public boolean puedeExtraer(double monto) {
		return (this.getSaldo() - 1.02 * monto) >= 0;
	}

	@Override
	protected void extraerSinControlar(double monto) {
		super.extraerSinControlar(monto * 1.02);
	}

	@Override
	public void depositar(double monto) {
		super.depositar(0.98 * monto);
	}
}

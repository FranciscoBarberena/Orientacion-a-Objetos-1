package ar.ejercicio29;

public class SUBE { //  No hic que la SUBE implemente MetodoDePago porque creo que sería incorrecto poder recargar una SUBE con otra SUBE.

	private double saldo;
	
	public boolean autorizarPago(double monto) { //No detalla implementación el enunciado
		return false;
	}
	public void pagar(double monto) { //No detalla implementación el enunciado
	}
	
	public boolean recargar(double monto, MetodoDePago metodoDePago) {
		if (metodoDePago.autorizarPago(monto)) {
			saldo += monto;
			metodoDePago.pagar(monto);
			return true;
		}
		return false;
	}
	
}

package ar.ejercicio18;

import java.time.LocalDate;

public class DateLapse2 implements DateInterface{
	private LocalDate from;
	private long sizeInDays;
	
	
	
	public DateLapse2(LocalDate from, int sizeInDays) {
		this.from = from;
		this.sizeInDays = sizeInDays;
	}

	public LocalDate getFrom() {
	// “Retorna la fecha de inicio del rango”
		return this.from;
	}
	
	public LocalDate getTo() {
	// “Retorna la fecha de fin del rango”
		return this.from.plusDays(sizeInDays);
	}
	public long sizeInDays() {
		// “retorna la cantidad de días entre la fecha 'from' y la fecha 'to'”
		return this.sizeInDays;
	}
	public boolean includesDate(LocalDate other) {
	// “recibe un objeto LocalDate y retorna true si la fecha está entre el from y el to del receptor y false en caso contrario. 
	//	Hice los limites inclusivos”.
		if (this.sizeInDays()<0)
			return !other.isBefore(this.getTo()) && !other.isAfter(from);
		return !other.isBefore(from) && !other.isAfter(this.getTo());
	}

	@Override
	public boolean overlaps(DateInterface rangoARevisar) {
		return !this.getFrom().isAfter(rangoARevisar.getTo()) && !this.getTo().isBefore(rangoARevisar.getFrom());	}
}

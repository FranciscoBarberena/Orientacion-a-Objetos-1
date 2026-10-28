package ar.ejercicio18;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse implements DateInterface{
	private LocalDate from;
	private LocalDate to;
	
	
	
	
	public DateLapse(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}

	public LocalDate getFrom() {
	// “Retorna la fecha de inicio del rango”
		return this.from;
	}
	
	public LocalDate getTo() {
	// “Retorna la fecha de fin del rango”
		return this.to;
	}
	public long sizeInDays() {
		// “retorna la cantidad de días entre la fecha 'from' y la fecha 'to'”
		return ChronoUnit.DAYS.between(from, to);
	}
	public boolean includesDate(LocalDate other) {
	// “recibe un objeto LocalDate y retorna true si la fecha está entre el from y el to del receptor y false en caso contrario. 
	//	Hice los limites inclusivos”.
		if (this.sizeInDays()<0)
			return !other.isBefore(to) && !other.isAfter(from);
		return !other.isBefore(from) && !other.isAfter(to);
	}

	@Override
	public boolean overlaps(DateInterface rangoARevisar) {
		return !this.getFrom().isAfter(rangoARevisar.getTo()) && !this.getTo().isBefore(rangoARevisar.getFrom());	}
	
}

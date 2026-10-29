package ar.ejercicio18;

import java.time.LocalDate;

public interface DateInterface {
	
	public long sizeInDays();
	public LocalDate getTo();
	public LocalDate getFrom();
	public boolean includesDate(LocalDate other);
	public boolean overlaps(DateInterface rangoARevisar);
	public boolean isCurrentlyHappening();
	
}

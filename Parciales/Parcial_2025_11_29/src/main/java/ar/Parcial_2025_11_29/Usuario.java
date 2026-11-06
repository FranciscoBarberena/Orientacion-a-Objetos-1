package ar.Parcial_2025_11_29;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String email;
    private List<Suscripcion> subs;

    public Usuario(String nombre, String email, Suscripcion suscripcion) {
        this.nombre = nombre;
        this.email = email;
        this.subs = new ArrayList<>();
        this.agregarSuscripcion(suscripcion);
    }

    public boolean agregarSuscripcion(Suscripcion suscripcion) {
		return subs.add(suscripcion);	
    }

	public double montoAPagar(LocalDate fechaPago) {
        return subs.stream().mapToDouble(suscripcion -> suscripcion.montoAPagar(fechaPago)).sum();
    }
}

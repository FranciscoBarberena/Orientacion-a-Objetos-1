/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genealogia;

import java.time.LocalDate;

/**
 *
 * @author Alejandra
 */
public class Mamifero {

    private String identificador;
    private String especie;
    private LocalDate fechaNacimiento;
    private Mamifero madre;
    private Mamifero padre;

    public Mamifero(String identificador) {
        this.identificador = identificador;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Mamifero getMadre() {
        return madre;
    }

    public void setMadre(Mamifero madre) {
        this.madre = madre;
    }

    public Mamifero getPadre() {
        return padre;
    }

    public void setPadre(Mamifero padre) {
        this.padre = padre;
    }

    public Mamifero getAbueloMaterno() {
        if (this.getMadre() != null)
            return this.getMadre().getPadre();
        return null;
    }

    public Mamifero getAbuelaMaterna() {
        if (this.getMadre()!= null)
            return this.getMadre().getMadre();
        return null;
    }

    public Mamifero getAbueloPaterno() {
        if (this.getPadre()!= null)
            return this.getPadre().getPadre();
        return null;
    }

    public Mamifero getAbuelaPaterna() {
        if (this.getPadre()!= null)
            return this.getPadre().getMadre();
        return null;
    }

    public boolean tieneComoAncestroA(Mamifero unMamifero) {
        boolean encontro = this.getIdentificador().equals(unMamifero.getIdentificador());
        boolean tieneDeAncestro = false;
        if ((this.getPadre() != null) && (!encontro)) {
            encontro = this.getPadre().tieneComoAncestroA(unMamifero);
            if (encontro) {
                tieneDeAncestro = true;
            }
        }
        if ((this.getMadre() != null) && (!encontro)) {
            encontro = this.getMadre().tieneComoAncestroA(unMamifero);
            if (encontro) {
                tieneDeAncestro = true;
            }
        }
        return tieneDeAncestro;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.ejercicio08;

/**
 *
 * @author Alejandra
 */
public class Circulo implements Figura2D {
    private double radio;

    public Circulo() {
        
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double valor) {
        this.radio = valor;
    }
    
    
    public double getDiametro(){
        return radio*2;
    }
    
    public void setDiametro(double valor){
        this.setRadio(valor/2);
    }
    
    public double getPerimetro(){
        return Math.PI * this.getDiametro();
    }
    
    public double getArea(){
        return Math.PI * Math.pow(this.getRadio(),2);
    }
    
}

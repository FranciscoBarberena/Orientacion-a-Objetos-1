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
public class Cuadrado implements Figura2D{
    private double lado;

    public Cuadrado() {
        
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    public double getArea(){
        return Math.pow(lado, 2);
    }
    
    public double getPerimetro(){
        return this.getLado()*4;
    }
    
}

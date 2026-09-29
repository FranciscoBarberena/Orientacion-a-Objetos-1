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
public class Cuerpo3D {
    
    private Figura2D caraBasal;
    private double altura;

    public void setCaraBasal(Figura2D caraBasal) {
        this.caraBasal = caraBasal;
    }
    
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getSuperficieExterior(){
        return 2*this.caraBasal.getArea() + this.caraBasal.getPerimetro()*this.getAltura();
    }
    
    public double getVolumen(){
        return caraBasal.getArea() * this.getAltura();
    }
    
}

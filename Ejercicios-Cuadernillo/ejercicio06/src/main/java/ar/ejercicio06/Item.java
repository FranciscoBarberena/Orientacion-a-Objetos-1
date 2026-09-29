/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.ejercicio06;

/**
 *
 * @author Alejandra
 */
public class Item {
    private String detalle;
    private int cantidad;
    private double costoUnitario;
    
    
    
    public Item(String detalle, int cantidad, double costoUnitario) {
		this.detalle = detalle;
		this.cantidad = cantidad;
		this.costoUnitario = costoUnitario;
	}


    
    
	public double getCostoUnitario() {
		return costoUnitario;
	}




	public double costo(){
        return cantidad*costoUnitario;
    }
}

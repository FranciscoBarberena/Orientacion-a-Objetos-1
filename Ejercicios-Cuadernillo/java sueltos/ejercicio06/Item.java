/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presupuesto;

/**
 *
 * @author Alejandra
 */
public class Item {
    private String detalle;
    private int cantidad;
    private double costoUnitario;
    
    public double costo(){
        return cantidad*costoUnitario;
    }
}

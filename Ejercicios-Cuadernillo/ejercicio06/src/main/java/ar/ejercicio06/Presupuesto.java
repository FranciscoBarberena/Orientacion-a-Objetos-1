/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.ejercicio06;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alejandra
 */
public class Presupuesto {

    private LocalDate fecha;
    private String cliente;
    private List<Item> items;

    public Presupuesto(String cliente) {
        this.fecha = LocalDate.now();
        this.cliente = cliente;
        this.items = new ArrayList<>();
    }
    
    
    public void agregarItem(Item item){
        items.add(item);
    }
    
    public double calcularTotal(){
        double total = 0;
        for (Item item: items){
            total += item.costo();
        }
        return total;
    }


	public LocalDate getFecha() {
		return fecha;
	}


	public String getCliente() {
		return cliente;
	}
    
    


    
}

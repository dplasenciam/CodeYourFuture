/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises.entities;

/**
 *
 * @author Daniel Plasencia
 */
public class DiscountCalculator {
    
    public double calcularPrecioConDescuento(double precio, double descuento){
        
        return precio * (100 - descuento) * 0.01;
        
    }
    
}

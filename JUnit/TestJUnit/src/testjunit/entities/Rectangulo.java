/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjunit.entities;

/**
 *
 * @author Daniel Plasencia
 */
public class Rectangulo {
    
    // Atributos
    
    private double ancho;
    private double largo;
    private String color;
    private boolean active;
    
    // Constructores

    public Rectangulo() {
    }

    public Rectangulo(double ancho, double largo) {
        this.ancho = ancho;
        this.largo = largo;
        this.color = "rojo";
        this.active = true;
    }
    
    // Getters & Setters

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
    
}

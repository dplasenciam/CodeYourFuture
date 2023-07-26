/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Daniel Plasencia
 */
public class Libro {
    
    private String name;
    private String serial;

    public Libro() {
    }

    public Libro(String name, String serial) {
        this.name = name;
        this.serial = serial;
    }

    @Override
    public String toString() {
        return "Libro{" + "name=" + name + ", serial=" + serial + '}';
    }
    
    
    
}

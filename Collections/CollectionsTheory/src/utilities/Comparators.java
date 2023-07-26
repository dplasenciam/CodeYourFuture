/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import entities.Mascota;
import java.util.Comparator;

/**
 *
 * @author Daniel Plasencia
 */
public class Comparators {
    
    /**
     * Es una interfaz generica
     * Eso quiere decir que el metodo compare que estamos sobreescribiendo necesita que le digamos el tipo de variable
     */
    public static Comparator<Mascota> ordenarPorNombreDesc = new Comparator<Mascota> () {
        @Override
        public int compare(Mascota m1, Mascota m2) {
            // establece comparacion entre atributos o objetos y devuelve un valor
            return m2.getNombre().compareTo(m1.getNombre());
        }
    };
    
        public static Comparator<Mascota> ordenarPorEdadDesc = new Comparator<Mascota> () {
        @Override
        public int compare(Mascota m1, Mascota m2) {
            // establece comparacion entre atributos o objetos y devuelve un valor
            return m2.getEdad().compareTo(m1.getEdad());
        }
    };
    
}

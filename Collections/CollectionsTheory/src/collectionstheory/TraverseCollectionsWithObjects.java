/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionstheory;

import entities.Libro;
import java.util.ArrayList;

/**
 *
 * @author Daniel Plasencia
 */
public class TraverseCollectionsWithObjects {
    
    public static void main(String[] args){
        
        ArrayList<Libro> libros = new ArrayList();
        Libro libro1 = new Libro("Libro bueno", "abc154");
        libros.add(libro1);
        
        for (Libro ejemplar: libros){
            System.out.println(ejemplar);
        }
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionstheory;

import entities.Libro;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author Daniel Plasencia
 */
public class AddObjectsToCollections {
    
    public static void main(String[] args){
        
        ///// LISTS /////////////////////////
        
        ArrayList<Libro> libros = new ArrayList();
        Libro libro1 = new Libro();
        libros.add(libro1);
        
        //// SETS //////////////////////////
        
        HashSet<Libro> librosSet = new HashSet();
        Libro libro2 = new Libro();
        librosSet.add(libro2);
        
        //// MAPS /////////////////////////////
        
        HashMap<Integer, Libro> librosMaps = new HashMap();
        int dni = 123456;
        Libro libro3 = new Libro("LibroName","Serial123");
        librosMaps.put(dni, libro3);
        
    }
    
}

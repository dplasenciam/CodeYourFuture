/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionstheory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Daniel Plasencia
 */
public class IteratorTheory {
    
    public static void main(String[] args){
        
        ArrayList<String> lista = new ArrayList();
        lista.add("A");
        lista.add("B");
        
        // Creamos el IteratorTheory para recorrer la lista
        Iterator<String> iterator = lista.iterator(); // Devolvemos el iterador
        
        System.out.println("Elementos de la lista");
        
        // Armamos un bucle while, siempre que el hasNext() devuelva TRUE
        
        while (iterator.hasNext()){
            System.out.print( iterator.next() + " ");
        }
        
        System.out.println("\n\n");
        
        // ############ REMOVING ELEMENTS ###################
        
        // LISTS
        
        ArrayList<String> palabras = new ArrayList();
        palabras.add("Hola");
        palabras.add("Chaus");
        palabras.add("Bye");
        palabras.add("Hola");
        palabras.add("Holis");
        
        Iterator<String> it = palabras.iterator();
        
        while(it.hasNext()) {
            
            if (it.next().equals("Hola")){ // Borramos si está la palabra "Hola"
                it.remove();
            }
            
        }
        
        for (String p : palabras){
            System.out.println(p);
        }
        
        System.out.println("");
           
        
        // SETS
        
        HashSet<Integer> numerosSet = new HashSet();
        
        numerosSet.add(1);
        numerosSet.add(3);
        numerosSet.add(5);
        numerosSet.add(7);
        numerosSet.add(9);
        
        Iterator<Integer> it2 = numerosSet.iterator();
        
        while(it2.hasNext()){
            
            if (it2.next() == 3){
                it2.remove();
            }
            
        }
        
        for (Integer num : numerosSet){
            System.out.println(num);
        }
        
    }
    
}
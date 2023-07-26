/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionstheory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author Daniel Plasencia
 */
public class RemoveElement {
    
    public static void main(String[] args){
        
        // LISTS
            
            // Eliminar por índice
        
            ArrayList<Integer> numerosA = new ArrayList();
            int x = 10;
            numerosA.add(x); // Este numero se agrega en índice 0
            x = 20;
            numerosA.add(x); // Este numero se agrega en índice 1
            x = 30;
            numerosA.add(x); // Este numero se agrega en índice 2
            numerosA.remove(1); // Eliminamos el numero que esté en el índice 1
            
            for (Integer i: numerosA){
                System.out.println("Numero A: " + i);
            }
            
            // Eliminar por Elemento
            
            ArrayList<Integer> numerosB = new ArrayList();
            int y = 30;
            numerosB.add(y); // Este numero se agrega en índice 0 -> 30
            y=20;
            numerosB.add(y); // Este numero se agrega en índice 1 -> 20
            y=20;
            numerosB.add(y); // Este numero se agrega en índice 2 -> 20
            
            Integer z=20; // DEBE SER Integer NO int porque busca Objetos e INT es el tipo de dato de indice cuando lo buscas
            numerosB.remove(z); // Eliminamos la primera coincidencia del objeto Integer z=20, el cual está
            // en el 2do indice (i=1) (primer índice que encuentra)
            
            for (Integer i: numerosB){
                System.out.println("Numero B: " + i); // debe imprimir 30 y 20 pues borro el 20 del medio
            }
            
        // SETS
        
            HashSet<Integer> numeros = new HashSet();
            int num = 50;
            numeros.add(num);
            num=60;
            numeros.add(num);
            num=70;
            numeros.add(num);
            Integer remo = 60; // int remo = 50 
            numeros.remove(remo); // numeros.remove(50)
   
            for (Integer i: numeros){
                System.out.println("Numero: " +  i);
            }
            
        
        // MAPS
        
            HashMap<Integer, String> estudiantes = new HashMap();
            estudiantes.put(1, "Juan");
            estudiantes.put(2, "Pedro");
            estudiantes.put(3, "Maria");
            
            estudiantes.remove(2); // Borramos la llave 2
            
            for (String nombres: estudiantes.values()) {
                System.out.println("Nombre: " + nombres);
            }
    }
}

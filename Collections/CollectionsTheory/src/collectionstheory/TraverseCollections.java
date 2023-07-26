/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionstheory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 *
 * @author Daniel Plasencia
 */
public class TraverseCollections {
    
    public static void main(String[] args){
        
        // LISTS
        ArrayList<String> lista = new ArrayList();
        lista.add("primero");
        lista.add("segundo");
        lista.add("tercero");
        // show all the elements using a variable
        System.out.println("--- Mostrando Lista con for ---");
        for (String cadena: lista){
            System.out.println(cadena);
        }
        
        System.out.println("--- Mostrando Lista con for i ---");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        
        System.out.println("--- Mostrando Lista con funcion ---");
        lista.forEach((e) -> System.out.println(e));
        
        // SETS
        
        HashSet<Integer> numerosSet = new HashSet();
        numerosSet.add(10);
        numerosSet.add(20);
        numerosSet.add(30);
        
        System.out.println("--- Mostrando Set con for ---");
        for (Integer numero: numerosSet){
            System.out.println(numero);
        }
        
        System.out.println("--- Mostrando Set con forEach ---");
        numerosSet.forEach((e) -> System.out.println(e));
        
        // MAPS
        
        HashMap<Integer,String> alumnos = new HashMap();
        
        alumnos.put(1234, "Daniel");
        alumnos.put(5678, "Adrian");
        alumnos.put(3456, "Juan");
         
        ////////// CON MAP.ENTRY ////////////////
        
        // Recorrer las 2 partes del mapa
        // entry.getKey trae la llave y entry.getValue trae los valores del mapa
        
        for(Map.Entry<Integer,String> entry: alumnos.entrySet()){
            System.out.println("documento="+entry.getKey() + ", nombre="+ entry.getValue());
        }
        
        ///////// SIN MAP.ENTRY /////////////////
        
        // Mostrar SOLO las llaves
        
        for(Integer dni: alumnos.keySet()){
            System.out.println("documento: "+dni);
        }
        
        // Mostrar SOLO los valores
        for(String nombre: alumnos.values()){
            System.out.println("Nombre: "+nombre);
        }
    }
}

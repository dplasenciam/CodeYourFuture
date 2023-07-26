/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionstheory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Daniel Plasencia
 */
public class SortCollections {
    
    public static void main(String[] args){
        
        // LIST ///////////////////////////////////////////////
        
        ArrayList<Integer> numeros = new ArrayList();
        
        numeros.add(10);
        numeros.add(4);
        numeros.add(2);
        numeros.add(13);
        
        for (Integer num: numeros){
            System.out.println("Numero: " + num);
        }
        
        System.out.println("");
        
        Collections.sort(numeros);
        
        for (Integer num: numeros){
            System.out.println("Numero: " + num);
        }
        
        System.out.println("");
        
        // SETS /////////////////////////////////////////////////////
        
        HashSet<Integer> numerosSet = new HashSet();
        numerosSet.add(34);
        numerosSet.add(23);
        numerosSet.add(30);
        numerosSet.add(38);
        
        for (Integer num: numerosSet){
            System.out.println("NumerosSet: " + num);
        }
        
        System.out.println("");
        
        // Se convierte el SET a LIST
        ArrayList<Integer> numerosLista = new ArrayList(numerosSet);
        
        Collections.sort(numerosLista);
        
         for (Integer num: numerosLista){
            System.out.println("NumerosLista: " + num);
        }
         
         System.out.println("");
        
        // MAPS ///////////////////////////////////////////////////////
        
        
        HashMap<Integer, String> alumnos = new HashMap();
        
        alumnos.put(7, "Daniel");
        alumnos.put(4, "Adrian");
        alumnos.put(6, "Plasencia");
        alumnos.put(1, "Margarito");
        
        for(Map.Entry<Integer, String> entry: alumnos.entrySet()){
            
            System.out.println("key: " + entry.getKey() +  " value: " + entry.getValue());
            
        }
        
        System.out.println("");
        
        TreeMap<Integer, String> alumnosTree = new TreeMap(alumnos);
        
        for(Map.Entry<Integer, String> entry: alumnosTree.entrySet()){
            
            System.out.println("keyTree: " + entry.getKey() +  " valueTree: " + entry.getValue());
            
        }        
    }
}

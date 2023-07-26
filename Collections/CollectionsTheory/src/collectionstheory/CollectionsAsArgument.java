/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionstheory;

import services.CollectionsAsArgumentService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 *
 * @author Daniel Plasencia
 */
public class CollectionsAsArgument {
    
    public static void main(String[] args){
        
        CollectionsAsArgumentService service = new CollectionsAsArgumentService();
        
        ////// LISTA ////////////////////////////////
        
        ArrayList<Integer> notas = new ArrayList();
        
        service.llenarLista(notas);
        
        for (Integer num: notas){
            System.out.println("List: " + num);
        }
        
        System.out.println("");
        
        /////////// HASHSET ////////////////////////////
        
        HashSet<String> palabras = new HashSet();
        
        service.llenarHashSet(palabras);
        
        for (String palabra : palabras){
            System.out.println("Set: " +  palabra);
        }
        
        System.out.println("");
        
        /////// MAPS /////////////////////
        
        HashMap<Integer, String> alumnos = new HashMap();
        
        service.llenarMapa(alumnos);
        
        for(Map.Entry<Integer, String> entry: alumnos.entrySet()){
            System.out.println("documento: " + entry.getKey() + ", nombre: " +  entry.getValue());
        }
        
    }
    

}

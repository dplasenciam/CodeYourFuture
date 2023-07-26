/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionstheory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Daniel Plasencia
 */
public class Definition {
    
    public static void main(String[] args){
        
    /* LISTAS */
        
        // ARRAYLIST de numeros
        ArrayList<Integer> numerosA = new ArrayList();
        
        // LINKEDLIST de numeros
        LinkedList<Integer> numerosB = new LinkedList();
        
        
    /* CONJUNTOS SETS */
        
        // HashSet de cadenas
        HashSet<String> nombres = new HashSet();
        
        // TreeSet de numeros
        TreeSet<Integer> numeros = new TreeSet();
        
        //LinkedHashSet de cadenas
        LinkedHashSet<String> frases = new LinkedHashSet();
    
    /* MAPS */
    
        // HashMap de personas
        
        // HashMap<Llave,Valor> identificador = new HashMap();
        HashMap<Integer,String> personasA = new HashMap();
        
        
        // TreeMap de personas
        TreeMap<Integer,String> personasB = new TreeMap();
        
        
        // LinkedHashMap
        LinkedHashMap<Integer,String> personasC = new LinkedHashMap();
        
    }
    
}

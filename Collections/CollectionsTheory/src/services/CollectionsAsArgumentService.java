/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author Daniel Plasencia
 */
public class CollectionsAsArgumentService {
    
    public void llenarLista(ArrayList<Integer> numeros){
        numeros.add(20);
        numeros.add(40);
    }
    
    public void llenarHashSet(HashSet<String> palabras){
        palabras.add("Hola");
        palabras.add("Chau");
    }
    
    public void llenarMapa(HashMap<Integer, String> alumnos){
        alumnos.put(1, "Pepe");
        alumnos.put(2, "Tito");
    }
}

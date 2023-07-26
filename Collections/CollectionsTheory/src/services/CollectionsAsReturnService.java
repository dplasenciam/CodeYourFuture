/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

/**
 *
 * @author Daniel Plasencia
 */
public class CollectionsAsReturnService {
    
    public ArrayList<Integer> crearLista(){
        
        ArrayList<Integer> numeros = new ArrayList();
        return numeros;
        
    }
    
    public HashSet<String> crearHashSet(){
        
        return new HashSet();
        
    }
    
    public HashMap<Integer, String> crearMapa(){
        
        return new HashMap();
        
    }
}
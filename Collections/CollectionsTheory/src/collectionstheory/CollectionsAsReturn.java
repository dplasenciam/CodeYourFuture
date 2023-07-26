/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionstheory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
import services.CollectionsAsReturnService;

/**
 *
 * @author Daniel Plasencia
 */
public class CollectionsAsReturn {
    
    public static void main(String[] args){
        
        CollectionsAsReturnService rs = new CollectionsAsReturnService();
        
        ArrayList<Integer> lista;
        HashSet<String> conjunto;
        HashMap<Integer, String> mapa;
        
        
        /// LIST /////////////
        
        lista = rs.crearLista();
        lista.add(20);
        lista.add(30);
        for(Integer num: lista){
            System.out.println("Lista: " +  num);
        }
        System.out.println("");
        
        ///// SET ///////////
        
        conjunto = rs.crearHashSet();
        conjunto.add("Hola");
        conjunto.add("Adios");
        for (String texto: conjunto){
            System.out.println("Set: " +  texto);
        }
        System.out.println("");
        
        ///// MAP ///////////////
        
        mapa = rs.crearMapa();
        mapa.put(1, "Daniel");
        mapa.put(2, "Adrian");
        for(Map.Entry<Integer, String> entry: mapa.entrySet()){
            System.out.println("documento: " + entry.getKey() + ", nombre: " + entry.getValue());
        }
    }
}

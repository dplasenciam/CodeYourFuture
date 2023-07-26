/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionstheory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Daniel Plasencia
 */
public class AddCollectionToCollections {

    public static void main(String[] args){

        
        List<String> nombresList = new ArrayList();
        nombresList.add("Pepe");
        nombresList.add("Papa");
        
        List<String> nombresList2 = new ArrayList();
        
        nombresList2.add("Hola");
        nombresList2.add("Chau");
        
        nombresList2.addAll(1, nombresList);
        
        for(String aux: nombresList2){
            System.out.println("Nombre: " + aux);
        }
        
        //nombresList2.addAll(nombresList);

    }
    
}

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
public class ArrayToList {
 
    public static void main(String[] args){
        
        String[] nombres = {"Pepe","Pepa"};
        List<String> nombresList = new ArrayList(Arrays.asList(nombres));
        
        for (String n : nombresList){
            System.out.println("Nombre: " + n);
        }
        
    }
    
}

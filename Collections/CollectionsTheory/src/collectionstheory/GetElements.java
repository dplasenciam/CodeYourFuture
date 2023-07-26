/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionstheory;

import java.util.ArrayList;

/**
 *
 * @author Daniel Plasencia
 */
public class GetElements {
    
    public static void main(String[] args){
        
        ArrayList<String> lista = new ArrayList();
        
        lista.add("Primero");
        lista.add("Segundo");
        lista.add("Tecero");
        
        System.out.println("El segundo elemento es " + lista.get(1));
        
    }
    
}

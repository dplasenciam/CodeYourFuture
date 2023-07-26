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
public class RemoveElementWhileTraversing {
    
    public static void main(String[] args){
        
        ArrayList<String> nombres = new ArrayList();
        nombres.add("Lola");
        nombres.add("Rodman");
        nombres.add("Chiqui");
        
        nombres.forEach((e) -> System.out.println(e));
        
        // Sale error con for
        /*
        for (String aux: nombres){
            if (aux.equals("Lola")){
                nombres.remove(aux);
            }
        }
        */
        
        for (int i = 0; i < nombres.size(); i++) {
            String m = nombres.get(i);
            if(m.equals("Lola")){
                nombres.remove(m);
            }
        }
        
        System.out.println("--- Se eliminó Lola ---");
        nombres.forEach((e) -> System.out.println(e));
    }
    
}

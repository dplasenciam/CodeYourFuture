/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlstructures.repetitivestructures;

import java.util.Scanner;

/**
 *
 * @author Daniel Plasencia
 */
public class While {
    
    public static void main(String[] args){
        
        /*
        
        while (<condicion>) {
            <sentencias>
        }
        
        */
        
        Scanner read = new Scanner(System.in);
        
        String ans = "S";
        
        while ( ans.equalsIgnoreCase("s") ) {
            
            System.out.println("Desea continuar?");
            ans = read.nextLine();
        }
        
    }
    
}

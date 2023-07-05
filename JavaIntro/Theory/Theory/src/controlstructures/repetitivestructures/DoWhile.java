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
public class DoWhile {
    
    public static void main(String[] args){
        
        /*
        
        do {
            <sentencias>
        } while (<condicion>);
        
        */
        
        Scanner read = new Scanner(System.in);
        
        String ans;
        
        do {
            
            System.out.println("Desea continuar?");
            ans = read.nextLine();
            
        } while ( ans.equalsIgnoreCase("S") );
        
        
    }
    
}

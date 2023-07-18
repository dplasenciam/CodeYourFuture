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
public class For {
    
    public static void main(String[] args){
        
        Scanner read = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Imprimo el valor de i: "+i);
        }
        
        System.out.println("################\n");
        
        System.out.println("Decreciendo");
        for (int i = 10; i > 0; i--) {
            System.out.println("Imprimo el valor de i: "+i);
        }
        
    }
    
}

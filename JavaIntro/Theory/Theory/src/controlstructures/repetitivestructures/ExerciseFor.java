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
public class ExerciseFor {
    
    public static void main(String[] args){
        
        Scanner read = new Scanner(System.in);
        int numero;
        
        for (int i = 0; i < 4; i++) {
            
            while(true){
                System.out.println("Ingrese un numero");
                numero = read.nextInt();
                
                if (numero>=1 && numero<=20){
                    break;
                } else {
                    System.out.println("Usted no ingresó un número correcto (1-20)");
                }
            
            }
            
            System.out.print(numero + " ");
            for (int j = 0; j < numero; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
            
        }
        
    }
    
}

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
public class ExerciseDoWhile {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        int contador = 1;
        int num;
        int suma = 0;
        
        do {
            
            System.out.println("Ingrese el numero #"+contador);
            num = read.nextInt();
            
            
            if (num>0) {
                suma = suma + num;
            }
            
            if(contador == 20){
                break;
            }
            
            if (num==0){
                System.out.println("Se capturó un 0. Fin del programa");
                break;
            }
            
            contador++;
            
            
        } while (true);
        
        System.out.println("Se ingresaron "+contador+" numeros");
        System.out.println("La suma es "+suma);
        
    }
    
    
}

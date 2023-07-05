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
public class ExerciseWhile {
    
    public static void main (String[] args){
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese una nota");
        int nota = read.nextInt();
        
        while (nota<0 || nota>10){
            System.out.println("Ud ingresó mal. Debe ser entre 0 y 10\nIngrese de nuevo");
            nota = read.nextInt();
        }
        
        
    }
    
}

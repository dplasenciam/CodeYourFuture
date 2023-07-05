/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlstructures.conditionalstructures;

import java.util.Scanner;

/**
 *
 * @author Daniel Plasencia
 */
public class Exercise {
    
    public static void main(String[] args){
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese el num1: ");
        int num1 = read.nextInt();
        
        System.out.println("Ingrese el num2: ");
        int num2 = read.nextInt();
        
        if (num1>25 && num2>25){
            System.out.println("Ambos numeros son mayor que 25");
        } else if (num1>25) {
            System.out.println("El num1 es mayor que 25");
        } else if (num2>25) {
            System.out.println("El num2 es mayor que 25");
        } else {
            System.out.println("Ninguno es mayor que 25");
        }
        
    }
    
}

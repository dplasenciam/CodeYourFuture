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
public class Switch {
    
    public static void main(String[] args){
        
        Scanner read = new Scanner(System.in);
        
        /// SWITCH
        
        /*
        
        switch (<variable>) {
            case <valor1>:
                <sentencias1>
                break;
            case <valor2>:
                <sentencias2>
                break;
            default:
                <sentencias3>
        }
        
        */
        
        System.out.println("Ingrese una opcion");
        int opcion = read.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("Esta linea de código se ejecuta si opcion = 1");
                //break;
            case 2:
                System.out.println("Esta linea de código se ejecuta si opcion = 2");
                //break;
            default:
                System.out.println("No era ni 1 ni 2");
        }
        
    }
    
}

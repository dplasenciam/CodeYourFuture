/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsexercises.exercise1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Daniel Plasencia
 */
public class main {
    
    public static void main(String[] args){
        
        ArrayList<String> razaPerros = new ArrayList();
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        int opcion;
        String raza;
        
        while(true){
            
            System.out.println("Ingrese una raza de perro:");
            raza = read.next();
            
            razaPerros.add(raza);
            
            System.out.println("Se registró exitosamente la raza de perro\n");
            
            while(true){
                System.out.println("#### MENU OPCIONES ####\n1. ¿Quiere guardar otro perro?\n2. Salir\n");
                opcion = read.nextInt();
                //read.nextLine();
                
                if(opcion==1 || opcion==2){
                    break;
                } else {
                    System.out.println("Ingrese una opción correcta\n");
                }
                
            }
            
            if(opcion==2){
                System.out.println("Se muestra la lista de raza de perros");
                for (String elemento: razaPerros){
                    System.out.println("Raza: "+elemento);
                }
                System.out.println("\n");
                break;
            }
            
            
            
            
        }
        
    }
    
}

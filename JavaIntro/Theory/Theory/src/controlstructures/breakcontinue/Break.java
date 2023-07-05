/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlstructures.breakcontinue;

/**
 *
 * @author Daniel Plasencia
 */
public class Break {
    
    public static void main(String[] args){
        
        // BREAK NO ROMPE IF ELSE
        
        System.out.println("####### BREAK NO ROMPE IF ########");
        
        if (true){
            System.out.println("1");
            System.out.println("2");
            //break;
            System.out.println("3");
            System.out.println("4");
        } else{
            System.out.println("5");
            //break;
            System.out.println("6");
        }
        
        System.out.println("##################");
        
        // BREAK SI ROMPE SWITCH
        
        System.out.println("####### BREAK SI ROMPE SWITCH ########");
        
        int opcion = 3;
        System.out.println("Ingrese la opcion "+opcion);
        
        switch(opcion){
            case 1:
                System.out.println("la opcion es 1");
                break;
            case 2:
                System.out.println("la opcion es 2");
                break;
            case 3:
                System.out.println("la opcion es 3");
                break;
            default:
                System.out.println("la opcion es 4");
        }
        
        System.out.println("##################");
        
    }
    
}


package controlstructures.conditionalstructures;

import java.util.Scanner;

public class IfElse {
    
    public static void main(String[] args){
        
        Scanner read = new Scanner(System.in);
        
        /// IF ELSE
        
        /*
        
        if (<condicion1>) {
        
            <sentencia A>
        
        } else if (<condicion2>) {
        
            <sentencia B>
        
        } else {
        
            <sentencia C>
        
        }
        
        */
        
        
        
        int num = 10;
        
        if (num == 10) {
            System.out.println("PRIMERA VUELTA: IF");
        }
        
        if (num == 11) {
            System.out.println("SEGUNDA VUELTA: IF");
        } else {
            System.out.println("SEGUNDA VUELTA: ELSE");
        }
        
        if (num == 11) {
            System.out.println("TERCERA VUELTA: IF");
        } else if (num == 12) {
            System.out.println("TERCERA VUELTA: ELSE IF");
        } else {
            System.out.println("TERCERA VUELTA: ELSE");
        }
               
    }
    
}

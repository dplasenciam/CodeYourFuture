
package instructions;

// Importando Scanner
import java.util.Scanner;


public class Instruction {
   
    public static void main(String[] args){
        
        Scanner read = new Scanner(System.in);
        
        int num = 10;
        
        // La variable tiene el valor de 10
        System.out.println("La variable tiene el valor de " +  num);
        
        // Hola Mundo
        System.out.print("Hola");
        System.out.println(" Mundo");
        
        
        ///// LECTURA DE DATOS
        
        System.out.println("Ingresa tu nombre");
        String nombre = read.nextLine();
        
        System.out.println("Ingresa tu edad");
        int edad = read.nextInt();
        
        System.out.println("El nombre es " + nombre + " y su edad es " + edad);
        
    }
    
}

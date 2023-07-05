
package elements;

public class Elements {
    
    public static void main(String[] args) {
        
        // Los identificadores son Camel Case
        // VARIABLES
        String nombre;
        int numero;
        double numeroDecimal;
        
        // ASIGNACIÓN DE VARIABLES
        int numero1 = 10;
        int numero3;
        numero3 = 10;
        
        int numero4;
        //System.out.println("El numero 4 es " + numero4);
        // Lo anterior no se va a ejecutar pues no se ha inicializado
        
        // OPERADORES
        
        int num1 = 5;
        int num2 = 2;
        int suma = num1 + num2;
        double division = num1/num2;
        boolean bandera = num2 < num1;
        
        System.out.println("El num1 es " + num1); // 5
        System.out.println("El num2 es " + num2); // 2
        System.out.println("La suma es " + suma); // 7
        System.out.println("La division es " + division); // 2.0
        System.out.println("La bandera es " + bandera); // TRUE
        
        
        num1++;
        System.out.println("El num1 se ha vuelto " + num1); // 6
        
    }
    
}

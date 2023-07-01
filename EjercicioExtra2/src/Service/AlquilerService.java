/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

/**
 *
 * @author Daniel Plasencia
 */

import java.util.Scanner;
import Entity.*;

public class AlquilerService {
    
    Scanner leer = new Scanner(System.in);
    
    public Alquiler crearAlquiler(Pelicula[] arregloPelicula, int contador){
        
        Alquiler a1 = new Alquiler();
        
        System.out.println("Ingrese el nombre de la pelicula");
        p1.setTitulo(leer.next());
        
        System.out.println("Ingrese el año de publicacion de la pelicula");
        p1.setAnio(leer.nextInt());
        
        System.out.println("Ingrese el genero de la pelicula");
        p1.setGenero(leer.next());
        
        System.out.println("Ingrese la duracion de la pelicula en minutos");
        p1.setDuracion(leer.nextDouble());
        
        return p1;
        
    }
    
    
}

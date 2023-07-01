/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra2;

import Entity.Alquiler;
import Entity.Pelicula;
import Service.PeliculaService;
import java.util.Scanner;

/**
 *
 * @author Daniel Plasencia
 */
public class EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        PeliculaService ps = new PeliculaService();
        Pelicula p;
        
        
        Pelicula[] arregloPeliculas = new Pelicula[10];
        int peliculaContador = 0;
        Alquiler[] arregloAlquiler = new Alquiler[10];
        
        
        while(true){
            
            System.out.println("####################\nBIENVENIDO AL MENU");
            System.out.println("1. Cargar pelicula");
            System.out.println("2. Listar peliculas");
            System.out.println("3. Crear alquiler");
            System.out.println("4. Listar alquiler");
            System.out.println("5. Buscar pelicula por titulo");
            System.out.println("6. Buscar pelicula por genero");
            System.out.println("7. Buscar alquileres por fecha");
            System.out.println("8. Salir");
            System.out.println("####################\n");
            
            System.out.println("Ingrese la opcion");
            int opcion = leer.nextInt();
            
            if (opcion == 8){
                break;
            }
            
            if (opcion<1 || opcion>8){
                System.out.println("Ingrese un valor valido\n");
            }
            
            
            
            switch(opcion){
                case 1:
                    p = ps.crearPelicula();
                    arregloPeliculas[peliculaContador] = p;
                    peliculaContador++;
                    break;
                case 2:
                    ps.listarPelicula(arregloPeliculas,peliculaContador);
                    break;
                case 3:
                    ///
                    break;
                case 4:
                    ///
                    break;
                case 5:
                    System.out.print("Ingrese el titulo a buscar: ");
                    ps.buscarPeliculaTitulo(leer.next(), arregloPeliculas, peliculaContador);
                    break;
                case 6:
                    System.out.print("Ingrese el genero a buscar: ");
                    ps.buscarPeliculaGenero(leer.next(), arregloPeliculas, peliculaContador);
                    break;
                case 7:
                    //
                    break;
                default:
                    System.out.println("Algo salio mal");
            }
            
        }
        
    }
    
}

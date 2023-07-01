/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.Scanner;
import Entity.*;
import java.util.Arrays;
import Utilities.Utility;

/**
 *
 * @author Daniel Plasencia
 */
public class PeliculaService {
    
    Scanner leer = new Scanner(System.in);
    
    public Pelicula crearPelicula(){
        
        Pelicula p1 = new Pelicula();
        
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
    
    public void listarPelicula(Pelicula[] arregloPelicula, int contador){
        
        for(int i=0;i<contador;i++){
            System.out.println(arregloPelicula[i].getTitulo());
        }
        

        
    }
    
    public void buscarPeliculaTitulo(String titulo, Pelicula[] arregloPelicula, int contador){
        
        //int posicion = Arrays.binarySearch(arregloPelicula, titulo);
        //return posicion >= 0;
        int flag1 = 0;
        
        for (int i=0; i<contador;i++){
            
            if (arregloPelicula[i].getTitulo().equals(titulo)){
                System.out.println("Pelicula encontrada:");
                Utility.mostrarPelicula(arregloPelicula[i]);
                System.out.println("\n");
                flag1++;
            }
            
        }
        
        if(flag1 == 0){
            System.out.println("No se encontró ninguna pelicula :c\n");
        }
        
                          
    }
    
    public void buscarPeliculaGenero(String genero, Pelicula[] arregloPelicula, int contador){
        
        //int posicion = Arrays.binarySearch(arregloPelicula, titulo);
        //return posicion >= 0;
        int flag1 = 0;
        
        for (int i=0; i<contador;i++){
            
            if (arregloPelicula[i].getGenero().equals(genero)){
                System.out.println("Pelicula encontrada:");
                Utility.mostrarPelicula(arregloPelicula[i]);
                System.out.println("\n");
                flag1++;
            }
            
        }
        
        if(flag1 == 0){
            System.out.println("No se encontró ninguna pelicula :c\n");
        }
        
                          
    }
    

    
}

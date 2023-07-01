/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import Entity.Pelicula;

/**
 *
 * @author Daniel Plasencia
 */
public class Utility {
    
        public static void mostrarPelicula(Pelicula pelicula){
        System.out.println("Titulo: " + pelicula.getTitulo());
        System.out.println("Genero: " + pelicula.getGenero());
        System.out.println("Año: " + pelicula.getAnio());
        System.out.println("Duracion: " + pelicula.getDuracion());
    }
    
}

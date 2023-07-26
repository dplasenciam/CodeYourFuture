/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotaapp.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import mascotaapp.entities.Mascota;

/**
 *
 * @author Daniel Plasencia
 */
public class ServicioMascota {
    
    private Scanner read;
    private List<Mascota> mascotas;

    public ServicioMascota() {
        this.read = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }

    
    /**
     * 
     * @return la Mascota creada
     * Solo se encarga de crear la Mascota, no de agregar
     */
    
    public Mascota crearMascota(){
        
        System.out.println("Introducir nombre");
        String nombre = read.nextLine();
        
        System.out.println("Introducir apodo");
        String apodo = read.nextLine();
        
        System.out.println("Introducir tipo");
        String tipo = read.nextLine();
        
        return new Mascota(nombre, apodo, tipo);
        
    }
    
    
    /**
     * 
     * @param m = es la Mascota que se va a agregar a la lista
     */
    public void agregarMascota(Mascota m){
        mascotas.add(m);
    }
    
    /**
     * Crea mascotas todos Pochos
     * @param cantidad equivale a la cantidad de mascotas a crear y añadir a la lista
     */
    public void fabricaPochos(int cantidad){
        
        for (int i = 0; i < cantidad; i++) {
            mascotas.add(new Mascota("Pocho","Chato","perro"));
        }
        
    }
    
    /**
     * Crea mascotas pidiendo datos por teclado
     */
    public void fabricaMascotas(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            Mascota mascotaCreada = crearMascota();
            agregarMascota(mascotaCreada);
        }
    }
    
    /**
     * Muestra todas las Mascotas y el tamaño de la lista
     */
    public void mostrarMascotas(){
        
        System.out.println("Las mascotas actuales de la lista mascotas son: ");
        for (Mascota masc : mascotas){
            System.out.println(masc);
        }
        System.out.println("Cantidad = " + mascotas.size() );
        
    }
    
    
    /**
     * 
     * @param index = posición de la mascota a actualizar
     * Actualiza con valor fijo
     * Se usa el if:else en vez de trycatch
     * TODO: Usar try:catch
     */
    public void actualizarMascota(int index){ ////////////////////
        
        if (index>=0 && index <= (mascotas.size()-1)){
            System.out.println("");
            System.out.println("--- Actualizar ---");
            Mascota m = mascotas.get(index);
            m.setApodo("Roberto"); // como estos objetos son pasados por referencia, no necesito volver a agregarlo a la collection
        } else{
            System.out.println("El indice es erroneo\nFallo al actualizar");
        }
    }
    
    
    /**
     * 
     * @param index = posición de la Mascota a chancar
     * Pide datos para crear nueva mascota
     * Se usa el if:else en vez de trycatch
     * TODO: Usar try:catch
     * 
     */
    public void actualizarMascotav2(int index){ ////////////////
        
        if (index>=0 && index <= (mascotas.size()-1)){
            System.out.println("");
            System.out.println("--- Actualizar ---");
            Mascota m = crearMascota();
            mascotas.set(index, m); //  CHANCA EN BASE AL INDICE
        } else{
            System.out.println("El indice es erroneo\nFallo al actualizar");
        }
        
        
    }
    
    
    /**
     * 
     * @param index = Posicion de la  Mascota a eliminar
     */
    public void eliminarMascota(int index){ ///////////////
        
        if (index>=0 && index <= (mascotas.size()-1)){
            System.out.println("");
            System.out.println("--- Eliminando ---");
            mascotas.remove(index);
            // tambien puedo enviarle la referencia de memoria del objeto a eliminar
        } else{
            System.out.println("El indice es erroneo\nFallo al eliminar");
        }
        
        
    }
    
    /**
     * 
     * @param nombre = nombre a buscar para eliminar
     */
    public void eliminarMascotaPorNombre(String nombre){
        
        for (int i = 0; i < mascotas.size(); i++) {
            Mascota m = mascotas.get(i);
            if(m.getNombre().equals(nombre)){
                mascotas.remove(i);
            }
        }
    }
    
    /**
     * 
     * @param nombreViejo = nombre a buscar para cambiar
     * @param nombreNuevo = nombre por el cual cambiar
     */
    public void actualizarMascotaPorNombre(String nombreViejo, String nombreNuevo){
        
        for (int i = 0; i < mascotas.size(); i++) {
            Mascota m = mascotas.get(i);
            if(m.getNombre().equals(nombreViejo)){
                m.setNombre(nombreNuevo);
            }
        }
    }
    
}

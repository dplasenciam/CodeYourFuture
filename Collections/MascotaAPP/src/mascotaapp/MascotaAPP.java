/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotaapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import mascotaapp.services.ServicioMascota;

/**
 *
 * @author Daniel Plasencia
 */
public class MascotaAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServicioMascota servMasc = new ServicioMascota();
        
        System.out.println("---- Se creará 4 mascotas ----\n");
        servMasc.fabricaMascotas(4);
        System.out.println("---- Se mostrarán las mascotas ----\n");
        servMasc.mostrarMascotas();
        System.out.println("---- Se eliminará todos los Pochos ----\n");
        servMasc.eliminarMascotaPorNombre("Pocho");
        System.out.println("---- Se mostrarán las mascotas ----\n");
        servMasc.mostrarMascotas();
        System.out.println("---- Se cambiará el nombre de las Laika por Laikita ----\n");
        servMasc.actualizarMascotaPorNombre("Laika", "Laikita");
        System.out.println("---- Se mostrarán las mascotas ----\n");
        servMasc.mostrarMascotas();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionstheory;

import entities.Mascota;
import entities.Mascota2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;
import utilities.Comparators;

/**
 *
 * @author Daniel Plasencia
 */
public class ComparatorTheoryClass {
    
    public static void main(String[] args){
        
        System.out.println("### LISTS ###");
        
        ArrayList<Mascota> mascotas = new ArrayList();
        
        mascotas.add(new Mascota("Laika","Negrita","Perro"));
        mascotas.add(new Mascota("Pocho","Chato","Perro"));
        mascotas.add(new Mascota("Hamtaro","Gordo","Hamster"));
        
        System.out.println("--- Muestro las mascotas ---");
        mascotas.forEach((e)->System.out.println(e));
        
        mascotas.sort(Mascota2.compararNombre);
        
        System.out.println("--- Después de ordenar las mascotas ---");
        mascotas.forEach((e)->System.out.println(e));
        
        
        
        System.out.println("### SETS ###");
        
        HashSet<Mascota> mascotasSet = new HashSet();
        mascotasSet.add(new Mascota("Moka","Cafe","Perro"));
        mascotasSet.add(new Mascota("Peka","Tiki","Perro"));
        mascotasSet.add(new Mascota("Aba","Moni","Perro"));
        System.out.println("--- Previo al ordenamiento ---");
        mascotasSet.forEach((e)->System.out.println(e));
        
        ArrayList<Mascota> mascotasSetToList = new ArrayList(mascotasSet);
        
        Collections.sort(mascotasSetToList, Comparators.ordenarPorNombreDesc);
        System.out.println("--- Posterior al ordenamiento ---");
        mascotasSetToList.forEach((e)->System.out.println(e));
        
        
        
        System.out.println("### TREESET ###");
        
        TreeSet<Mascota> mascotaTreeSet = new TreeSet(Comparators.ordenarPorNombreDesc);
        mascotaTreeSet.add(new Mascota("Azul","Cafe","Perro"));
        mascotaTreeSet.add(new Mascota("Maca","Tiki","Perro"));
        mascotaTreeSet.add(new Mascota("Paca","Moni","Perro"));
        System.out.println("--- Los elementos del treeset ya se ordenan solos ---");
        mascotaTreeSet.forEach((e)->System.out.println(e));
        
        
        System.out.println("### MAPS ###");
        
        HashMap<Integer, Mascota> mapMascotas = new HashMap();
        mapMascotas.put(1, new Mascota("Aranda","holi","Perro"));
        mapMascotas.put(2, new Mascota("Nini","Noki","Perro"));
        mapMascotas.put(3, new Mascota("Queso","jiji","Gato"));
        
        System.out.println("--- Previo orden ---");
        for(Map.Entry<Integer, Mascota> entry: mapMascotas.entrySet()){
            System.out.println("ID: " +  entry.getKey() + " Name: " + entry.getValue().getNombre());
        }
        
        ArrayList<Mascota> mapMascotasToArray = new ArrayList(mapMascotas.values());
        Collections.sort(mapMascotasToArray, Comparators.ordenarPorNombreDesc);
        System.out.println("--- Post orden ---");
        mapMascotasToArray.forEach((e)->System.out.println(e));
        
    }
    
}

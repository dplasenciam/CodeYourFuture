/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import java.util.ArrayList;
import entity.Cliente;
import java.util.Scanner;
/**
 *
 * @author Daniel Plasencia
 */

 

public class ServicioCliente {
    
    private ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
    private int contador=0;
    Scanner leer = new Scanner(System.in);
    
    public Cliente crearCliente(){
        
        String nombre;
        int edad;
        double altura;
        double peso;
        String objetivo;
        
        System.out.println("Ingrese el nombre");
        nombre = leer.nextLine();
        System.out.println("Ingrese edad");
        edad = leer.nextInt();
        System.out.println("Ingrese altura");
        altura = leer.nextDouble();
        System.out.println("Ingrese peso");
        peso = leer.nextDouble();
        System.out.println("Ingrese objetivo");
        objetivo = leer.nextLine();
        
        return new Cliente(0,nombre,edad,altura,peso,objetivo);
        
    }
    
    public void registrarCliente(Cliente c){
        
        listaClientes.add(c);
        
    }
    
    public ArrayList<Cliente> obtenerClientes(){
        
        return listaClientes;
        
    }
    
    public void actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo){
        
        for (int i = 0; i < listaClientes.size(); i++) {
            
            if (listaClientes.get(i).getId() == id) {
                listaClientes.get(i).setNombre(nombre);
                listaClientes.get(i).setEdad(edad);
                listaClientes.get(i).setAltura(altura);
                listaClientes.get(i).setPeso(peso);
                listaClientes.get(i).setObjetivo(objetivo);
                break;
            }
            
        }
        
    }
    
    public void eliminarRutina(int id){
        
        for (int i = 0; i < listaClientes.size(); i++) {
            if (listaClientes.get(i).getId() == id) {
                listaClientes.remove(i);
                break;
            }         
        }   
        
    }
    
}

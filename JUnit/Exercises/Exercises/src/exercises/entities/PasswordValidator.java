/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises.entities;

/**
 *
 * @author Daniel Plasencia
 */
public class PasswordValidator {
    
    public boolean validarLongitud(String password){
        return password.length() >= 10;
    }
    
    
    public boolean validarPorLoMenosUnaMayuscula(String password){
        
        int contadorMayuscula = 0;
        String letra;
        
        for (int i = 0; i < password.length(); i++) {
           letra = password.substring(i, i+1);
           if (letra.equals(letra.toUpperCase())){
               contadorMayuscula++;
               break;
           }
        }
        
        return contadorMayuscula==1;
        
    }
    
}

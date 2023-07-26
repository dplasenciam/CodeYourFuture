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
public class PalindromeChecker {
    
    public boolean validatePalindromo(String palabra){
        
        int tamanio = palabra.length();
        boolean palindromo = true;
        int recorrido = tamanio/2;
        
        for (int i = 0; i < recorrido; i++) {
            if(!palabra.substring(i, i+1).equals(palabra.substring(tamanio-1-i,tamanio-i))){
                palindromo = false;
                break;
            }
        }
        
        return palindromo;
    }
    
}

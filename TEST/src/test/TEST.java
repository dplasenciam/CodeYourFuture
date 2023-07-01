/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Daniel Plasencia
 */
public class TEST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int tamanio = 4;
        
        String[][] matriz = new String[tamanio][tamanio];
        
        for (int i=0;i<tamanio;i++){
            for (int j=0;j<tamanio;j++){
                
                if (i==0 || i==tamanio-1){
                    matriz[i][j] = "X";
                } else if(j==0 || j==tamanio-1){
                    matriz[i][j] = "X";
                } else {
                    matriz[i][j] = "_";
                }
                
                System.out.print(matriz[i][j]);
            }
            System.out.println("\n");
        }
        
        
        
    }
    
}

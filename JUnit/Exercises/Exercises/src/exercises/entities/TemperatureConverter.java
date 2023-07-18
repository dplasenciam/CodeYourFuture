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
public class TemperatureConverter {
    
    public double celciusToFahrenheit(double c){
        
        return c*1.8 + 32;
        
    }
    
    public double celciusToKelvin(double c){
        return c+273.15;
    }
    
    public double fahrenheitToCelcius(double f){
        return (f-32)/1.8;
    }
    
    public double fahrenheitToKelvin(double f){
        //double paso = ((double)(5/9)*(f-32));
        return ((((5*1d)/9))*(f-32)) + 273.15;
    }
    
    public double kelvinToCelcius(double k){
        return k-273.15;
    }
    
    public double kelvinToFahrenheit( double k){
        return 1.8*(k-273.15) +32;
    }
    
}

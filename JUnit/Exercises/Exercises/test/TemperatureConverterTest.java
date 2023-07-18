/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import exercises.entities.TemperatureConverter;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel Plasencia
 */
public class TemperatureConverterTest {
    
    public TemperatureConverterTest() {
    }
    
    static TemperatureConverter tc;
    double temperatura;
    
    @BeforeClass
    public static void setUpClass() {
        tc = new TemperatureConverter();
    }
    
    @AfterClass
    public static void tearDownClass() {
        tc = null;
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testCelciusToFahrenheit(){
        temperatura = tc.celciusToFahrenheit(100);
        System.out.println("### PROBANDO CONVERTIR 100 CELCIUS A FAHRENHEIT");
        assertEquals(212,temperatura,0);
        System.out.println("En F es "+temperatura);
    }
    
    
    @Test
    public void testCelciusToKelvin(){
        System.out.println("### PROBANDO CONVERTIR 100 CELCIUS A KELVIN");
        temperatura = tc.celciusToKelvin(100);
        assertEquals(373.15,temperatura,0);
        System.out.println("En K es "+temperatura);
    }
    
    @Test
    public void testFahrenheitToCelcius(){
        System.out.println("### PROBANDO CONVERTIR 212 FAHRENHEIT A CELCIUS");
        temperatura = tc.fahrenheitToCelcius(212);
        assertEquals(100,temperatura,0);
        System.out.println("En C es "+temperatura);
    }

    @Test
    public void testFahrenheitToKelvin(){
        System.out.println("### PROBANDO CONVERTIR 212 FAHRENHEIT A KELVIN");
        temperatura = tc.fahrenheitToKelvin(212);
        assertEquals(373.15,temperatura,0);
        System.out.println("En K es "+temperatura);
    }

    @Test
    public void testKelvinToCelcius(){
        System.out.println("### PROBANDO CONVERTIR 373.15 KELVIN A CELCIUS");
        temperatura = tc.kelvinToCelcius(373.15);
        assertEquals(100,temperatura,0);
        System.out.println("En C es "+temperatura);
    }

    @Test
    public void testKelvinToFahrenheit(){
        System.out.println("### PROBANDO CONVERTIR 373.15 KELVIN A FAHRENHEIT");
        temperatura = tc.kelvinToFahrenheit(373.15);
        assertEquals(212,temperatura,0);
        System.out.println("En F es "+temperatura);
    }
    
    
}

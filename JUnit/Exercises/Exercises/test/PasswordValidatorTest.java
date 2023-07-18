/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import exercises.entities.PasswordValidator;
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
public class PasswordValidatorTest {
    
    public PasswordValidatorTest() {
    }
    
    static PasswordValidator pv;
    
    @BeforeClass
    public static void setUpClass() {
        pv = new PasswordValidator();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void validarTamanioCorrecto(){
        
        System.out.println("## VALIDANDO TAMAÑO CORRECTO###");
        
        String texto;
        texto = "holaholahola";
        assertTrue(pv.validarLongitud(texto));
        System.out.println("Tamaño de "+texto.length());
        
        texto = "holaholaho";
        assertTrue(pv.validarLongitud(texto));
        System.out.println("Tamaño de "+texto.length());
        
        texto = " holaholah";
        assertTrue(pv.validarLongitud(texto));
        System.out.println("Tamaño de "+texto.length());

        texto = "holaholah ";
        assertTrue(pv.validarLongitud(texto));
        System.out.println("Tamaño de "+texto.length());
    }
    
    @Test
    public void validarTamanioIncorrecto(){
        
        System.out.println("## VALIDANDO TAMAÑO INCORRECTO###");
        String texto;
        texto = "holashola";
        assertFalse(pv.validarLongitud(texto));
        System.out.println("Tamaño de "+texto.length());
        
    }
    
    @Test
    public void validarUnaMayusculaCorrecto(){
        
        System.out.println("#### VALIDANDO QUE DETECTE CUANDO HAYA MAYUSCULAS #####");
        String texto;
        
        texto = "HolaMundo";
        assertTrue(pv.validarPorLoMenosUnaMayuscula(texto));
        System.out.println("El texto sí pasó y era " + texto);
        
        texto = "Holabola";
        assertTrue(pv.validarPorLoMenosUnaMayuscula(texto));
        System.out.println("El texto sí pasó y era " + texto);
        
        texto = "holabolA";
        assertTrue(pv.validarPorLoMenosUnaMayuscula(texto));
        System.out.println("El texto sí pasó y era " + texto);
        
        texto = "holaBila";
        assertTrue(pv.validarPorLoMenosUnaMayuscula(texto));
        System.out.println("El texto sí pasó y era " + texto);
        
    }
    
    @Test
    public void validarUnaMayusculaIncorrecto(){
        
        String texto;
        
        System.out.println("#### VALIDANDO QUE DETECTE CUANDO NO HAYA MAYUSCULAS #####");
        
        texto = "holamundo";
        assertFalse(pv.validarPorLoMenosUnaMayuscula(texto));
        System.out.println("El texto no pasó y era " + texto);
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import exercises.entities.PalindromeChecker;
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
public class PalindromeCheckerTest {
    
    public PalindromeCheckerTest() {
    }
    
    static PalindromeChecker pc;
    
    @BeforeClass
    public static void setUpClass() {
        pc = new PalindromeChecker();
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
    public void validarPalindromoTrue(){
        String palabra;
        palabra = "abccba";
        assertTrue(pc.validatePalindromo(palabra));
        
        palabra = "aBccBa";
        assertTrue(pc.validatePalindromo(palabra));
        
        palabra = "abcdcba";
        assertTrue(pc.validatePalindromo(palabra));
    }
    
        public void validarPalindromoFalse(){
        String palabra;
        palabra = "abcCba";
        assertFalse(pc.validatePalindromo(palabra));
        
        palabra = "aBccba";
        assertFalse(pc.validatePalindromo(palabra));
        
        palabra = "abcdDcba";
        assertFalse(pc.validatePalindromo(palabra));
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}

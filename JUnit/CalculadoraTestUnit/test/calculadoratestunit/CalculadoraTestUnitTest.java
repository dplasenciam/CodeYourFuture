/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoratestunit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import calculadoratestunit.Calculator;

/**
 *
 * @author Daniel Plasencia
 */
public class CalculadoraTestUnitTest {
    
    public CalculadoraTestUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
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

    /**
     * Test of main method, of class CalculadoraTestUnit.
     */
   
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CalculadoraTestUnit.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    @Test
    public void testAdd(){
        System.out.println("#### PRUEBA DE SUMA ####");
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        System.out.println(result);
        assertEquals(5, result);
    }
    
    @Test
    public void testSubstract(){
        System.out.println("#### PRUEBA DE RESTA ####");
        Calculator calculator = new Calculator();
        int result = calculator.substract(5, 3);
        System.out.println(result);
        assertEquals(2, result);
    }
    
    @Test
    public void testMultiply(){
        System.out.println("#### PRUEBA DE MULTIPLICACION ####");
        Calculator calculator = new Calculator();
        int result = calculator.multiply(2, 3);
        System.out.println(result);
        assertEquals(6, result);
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import exercises.entities.DiscountCalculator;
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
public class DiscountCalculatorTest {
    
    public DiscountCalculatorTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void validateDiscounts(){
        
        DiscountCalculator dc = new DiscountCalculator();
        double precioFinal;
        System.out.println("Precio inicial de 100 soles");
        
        System.out.println("### DESCUENTO DEL 10% ###");
        precioFinal = dc.calcularPrecioConDescuento(100, 10);
        assertEquals(90, precioFinal, 0);
        System.out.println("El precio se redujo a "+precioFinal);
        
        System.out.println("### DESCUENTO DEL 20% ###");
        precioFinal = dc.calcularPrecioConDescuento(100, 20);
        assertEquals(80, precioFinal, 0);
        System.out.println("El precio se redujo a "+precioFinal);
        
        System.out.println("### DESCUENTO DEL 50% ###");
        precioFinal = dc.calcularPrecioConDescuento(100, 50);
        assertEquals(50, precioFinal, 0);
        System.out.println("El precio se redujo a "+precioFinal);
        
        System.out.println("### SIN DESCUENTO ###");
        precioFinal = dc.calcularPrecioConDescuento(100, 0);
        assertEquals(100, precioFinal, 0);
        System.out.println("El precio se mantuvo en "+precioFinal);
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdc_assesment;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hampton1
 */
public class DrinkTest {
    
    public DrinkTest() {
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
     * Test of getCupSize method, of class Drink.
     */
    @Test
    public void testGetCupSize() {
        System.out.println("getCupSize");
        Drink instance = new DrinkImpl();
        Drink.CupSize expResult = null;
        Drink.CupSize result = instance.getCupSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    public class DrinkImpl extends Drink {

        public DrinkImpl() {
            super(0.0, "", "", null);
        }

        public CupSize getCupSize() {
            return null;
        }
    }
    
}

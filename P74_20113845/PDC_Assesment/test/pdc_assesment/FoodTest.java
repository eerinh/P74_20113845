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
public class FoodTest {

    public FoodTest() {
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
     * Test of getGrams method, of class Food.
     */
    @Test
    public void testGetGramsAllFilles() {
        System.out.println("getGrams");
        Food instance = new foods();
        double expResult = 0.0;
        double result = instance.getGrams();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testGetGramsAllEmpty() {
        System.out.println("getGramAllEmpty");
        Food instance = new foods1();
        double expResult = 0.0;
        double result = instance.getGrams();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testGetGramsOnlyTemp() {
        System.out.println("getGramsOnlyTemp");
        Food instance = new foods2();
        double expResult = 0.0;
        double result = instance.getGrams();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    public class foods1 extends Food {

        public foods1() {
            super(0.0, "", "", null);
        }

        @Override
        public double getGrams() {
            return 0.0;
        }
    }

    public class foods extends Food {

        public foods() {
            super(0.0, "sdsd", "sdsd", Temperature.COLD);
        }

        @Override
        public double getGrams() {
            return 0.0;
        }
    }

    public class foods2 extends Food {

        public foods2() {
            super(0.0, "", "", Temperature.COLD);
        }

        @Override
        public double getGrams() {
            return 0.0;
        }

    }
}

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
public class CustomerTest {
    
    public CustomerTest() {
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
     * Test of getGuests method, of class Customer.
     */
    @Test
    public void testGetGuests() {
        System.out.println("getGuests");
        Customer instance = new Customer();
        int expResult = 0;
        int result = instance.getGuests();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setName method, of class Customer.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Customer instance = new Customer();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setGuests method, of class Customer.
     */
    @Test
    public void testSetGuests() {
        System.out.println("setGuests");
        int guests = 0;
        Customer instance = new Customer();
        instance.setGuests(guests);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}

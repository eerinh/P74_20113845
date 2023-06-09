/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdc_assesment;

import java.sql.Connection;
import java.sql.ResultSet;
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
public class DBManagerTest {

    public DBManager db;

    public DBManagerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        this.db = new DBManager();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void addCustomerTest() {
        System.out.println("load Customer");
        Customer customer = new Customer();
        customer.setName("sdsd");
        customer.setGuests(0);

        boolean expResult = false;
        boolean result = this.db.addCustomer(customer);
        assertEquals(expResult, result);
    }

    @Test
    public void addCustomerTestNoNameNoGuests() {
        System.out.println("load Customer");
        Customer customer = new Customer();
        customer.setName("");
        customer.setGuests(0);

        boolean expResult = false;
        boolean result = this.db.addCustomer(customer);
        assertEquals(expResult, result);
    }

    public void addCustomerTestNoNameNegativeGuests() {
        System.out.println("load Customer");
        Customer customer = new Customer();
        customer.setName(" ");
        customer.setGuests(-2);

        boolean expResult = false;
        boolean result = this.db.addCustomer(customer);
        assertEquals(expResult, result);
    }

    public void addCustomerTestNameNoGuests() {
        System.out.println("load Customer");
        Customer customer = new Customer();
        customer.setName("sdsd");
        customer.setGuests(0);

        boolean expResult = false;
        boolean result = this.db.addCustomer(customer);
        assertEquals(expResult, result);
    }

    public void addCustomerTestNameNegativeGuests() {
        System.out.println("load Customer");
        Customer customer = new Customer();
        customer.setName("sdsd");
        customer.setGuests(-9);

        boolean expResult = false;
        boolean result = this.db.addCustomer(customer);
        assertEquals(expResult, result);
    }

    public void addCustomerTestNameHasGuests() {
        System.out.println("load Customer");
        Customer customer = new Customer();
        customer.setName("sdsd");
        customer.setGuests(55);

        boolean expResult = false;
        boolean result = this.db.addCustomer(customer);
        assertEquals(expResult, result);
    }

}

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
public class ControllerTest {
    
    private Controller c;
    
    public ControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    //creating new controller 
    public void setUp() {
        this.c = new Controller();
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of displayOrder method, of class Controller.
     */
    @Test
    public void testDisplayOrder() {
        System.out.println("display Order");
        boolean Chicken = false;
        boolean Pie = false;
        boolean MediumHotChocolate = false;
        boolean SmallHotChocolate = false;
        boolean LargeCoffee = false;
        boolean Cake = false;
        boolean expResult = false;
        boolean result = this.c.displayOrder(Chicken, Pie, MediumHotChocolate, SmallHotChocolate, LargeCoffee, Cake);
        assertEquals(expResult, result);
    }
    
    //testing is all items are true
    @Test
      public void testDisplayOrderAllTrue() {
        System.out.println("display Order");
        boolean Chicken = true;
        boolean Pie = true;
        boolean MediumHotChocolate = true;
        boolean SmallHotChocolate = true;
        boolean LargeCoffee = true;
        boolean Cake = true;
        boolean expResult = true;
        boolean result = this.c.displayOrder(Chicken, Pie, MediumHotChocolate, SmallHotChocolate, LargeCoffee, Cake);
        assertEquals(expResult, result);
    }
      
          //testing if one is false 

      @Test
        public void testDisplayOrderOneFalse() {
        System.out.println("display Order");
        boolean Chicken = false;
        boolean Pie = true;
        boolean MediumHotChocolate = true;
        boolean SmallHotChocolate = true;
        boolean LargeCoffee = true;
        boolean Cake = true;
        boolean expResult = true;
        boolean result = this.c.displayOrder(Chicken, Pie, MediumHotChocolate, SmallHotChocolate, LargeCoffee, Cake);
        assertEquals(expResult, result);
    }
}

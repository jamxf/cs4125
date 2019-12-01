/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unstoppable.orders;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jamesfoley
 */
public class ShippingTest {
    
    public ShippingTest() {
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
     * Test of visitor, of package Orders.
     */
    @Test
    public void testAccept() {
        System.out.println("accept");
        Visitor tv = new taxVisitor();
        Shipping s1 = new Shipping(30.00);
        Build b1 = new Build(1400.00);

        Double expResult = 31.25;
        Double expResult2 = 1575.0;
        Double result = s1.accept(tv);
        Double result2 = b1.accept(tv);

        assertEquals(expResult, result);
        assertEquals(expResult2, result2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Darrin
 */
public class EventControlTest {

    public EventControlTest() {
    }

    /**
     * Test 1
     */
    @Test
    public void test1GetSubTotal() {
        System.out.println("getOnHand");
        System.out.println("Test Case 1");
        double onHand = 9;
        double deductQuantity = 2;
        EventControl instance = new EventControl();
        double expResult = 7;
        double result = instance.getOnHand(onHand, deductQuantity);
        assertEquals(expResult, result, 0.0);

    }

     /**
     * Test 2
     */
    @Test
    public void test2GetSubTotal() {
        System.out.println("getOnHand");
        System.out.println("Test Case 2");
        double onHand = -5;
        double deductQuantity = 4;
        EventControl instance = new EventControl();
        double expResult = -1;
        double result = instance.getOnHand(onHand, deductQuantity);
        assertEquals(expResult, result, 0.0);

    }
    
    
    
     /**
     * Test 3
     */
    @Test
    public void test3GetSubTotal() {
        System.out.println("getOnHand");
        System.out.println("Test Case 3");
        double onHand = 3;
        double deductQuantity = -4;
        EventControl instance = new EventControl();
        double expResult = -1;
        double result = instance.getOnHand(onHand, deductQuantity);
        assertEquals(expResult, result, 0.0);

    }
    
   
 /**
     * Test 4
     */
    @Test
    public void test4GetSubTotal() {
        System.out.println("getOnHand");
        System.out.println("Test Case 4");
        double onHand = 0;
        double deductQuantity = 3;
        EventControl instance = new EventControl();
        double expResult = -1;
        double result = instance.getOnHand(onHand, deductQuantity);
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test 5
     */
    @Test
    public void test5GetSubTotal() {
        System.out.println("getOnHand");
        System.out.println("Test Case 5");
        double onHand = 0;
        double deductQuantity = 0;
        EventControl instance = new EventControl();
        double expResult = -1;
        double result = instance.getOnHand(onHand, deductQuantity);
        assertEquals(expResult, result, 0.0);

    }
    
/**
     * Test 6
     */
    @Test
    public void test6GetSubTotal() {
        System.out.println("getOnHand");
        System.out.println("Test Case 6");
        double onHand = 301;
        double deductQuantity = 301;
        EventControl instance = new EventControl();
        double expResult = -1;
        double result = instance.getOnHand(onHand, deductQuantity);
        assertEquals(expResult, result, 0.0);

    }
    
}
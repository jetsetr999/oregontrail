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
 * @author parhe
 * This line is added JUST to allow me to push this
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    /**
     * Test 1
     */
    @Test
    public void test1GetSubTotal() {
        System.out.println("getSubTotal");
        System.out.println("Test Case 1");
        double pricePerUnit = 2;
        double itemQuantity = 9;
        InventoryControl instance = new InventoryControl();
        double expResult = 18;
        double result = instance.getSubTotal(pricePerUnit, itemQuantity);
        assertEquals(expResult, result, 0.0);
        
    }
    
    /**
     * Test 2
     */
    @Test
    public void test2GetSubTotal() {
        System.out.println("getSubTotal");
        System.out.println("Test Case 2");
        double pricePerUnit = -5;
        double itemQuantity = 4;
        InventoryControl instance = new InventoryControl();
        double expResult = -1;
        double result = instance.getSubTotal(pricePerUnit, itemQuantity);
        assertEquals(expResult, result, 0.0);
        
    }
    
    
        /**
     * Test 3
     */
    @Test
    public void test3GetSubTotal() {
        System.out.println("getSubTotal");
        System.out.println("Test Case 3");
        double pricePerUnit = 3;
        double itemQuantity = -4;
        InventoryControl instance = new InventoryControl();
        double expResult = -1;
        double result = instance.getSubTotal(pricePerUnit, itemQuantity);
        assertEquals(expResult, result, 0.0);
        
    }
    
    
        /**
     * Test 4
     */
    @Test
    public void test4GetSubTotal() {
        System.out.println("getSubTotal");
        System.out.println("Test Case 4");
        double pricePerUnit = 3;
        double itemQuantity = 0;
        InventoryControl instance = new InventoryControl();
        double expResult = -1;
        double result = instance.getSubTotal(pricePerUnit, itemQuantity);
        assertEquals(expResult, result, 0.0);
        
    }
    
    
        /**
     * Test 5
     */
    @Test
    public void test5GetSubTotal() {
        System.out.println("getSubTotal");
        System.out.println("Test Case 5");
        double pricePerUnit = 1;
        double itemQuantity = 1;
        InventoryControl instance = new InventoryControl();
        double expResult = 1;
        double result = instance.getSubTotal(pricePerUnit, itemQuantity);
        assertEquals(expResult, result, 0.0);
        
    }
    
    
        /**
     * Test 6
     */
    @Test
    public void test6GetSubTotal() {
        System.out.println("getSubTotal");
        System.out.println("Test Case 6");
        double pricePerUnit = 300;
        double itemQuantity = 300;
        InventoryControl instance = new InventoryControl();
        double expResult = 90000;
        double result = instance.getSubTotal(pricePerUnit, itemQuantity);
        assertEquals(expResult, result, 0.0);
        
    } 
}   



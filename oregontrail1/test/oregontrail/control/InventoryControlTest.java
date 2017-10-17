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
}   

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kyle Jones
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }
    /**
     * Test of getSubTotal method, of class InventoryControl.
     */
    @Test
    public void testGetSubTotal() {
        System.out.println("getSubTotal");
        double weight = 0.0;
        long amount = 0L;
        double pricePerUnit = 0.0;
        double onHandItem = 0.0;
        double itemQuantity = 0.0;
        InventoryControl instance = new InventoryControl();
        double expResult = 0.0;
        double result = instance.getSubTotal(weight, amount, pricePerUnit, onHandItem, itemQuantity);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

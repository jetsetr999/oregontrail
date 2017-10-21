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
 * @author Kyle Jones
 */
public class RiverCrossingControlTest {
    
    public RiverCrossingControlTest() {
    }

    /**
     * Test of canWeFloat method, of class RiverCrossingControl.
     */
    @Test
    public void testCanWeFloat1() {
        System.out.println("canWeFloat");
        RiverCrossingControl instance = new RiverCrossingControl(101);
        boolean expResult = true;
        boolean result = instance.canWeFloat();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCanWeFloat2() {
        System.out.println("canWeFloat");
        RiverCrossingControl instance = new RiverCrossingControl(102);
        boolean expResult = false;
        boolean result = instance.canWeFloat();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCanWeFloat3() {
        System.out.println("canWeFloat");
        RiverCrossingControl instance = new RiverCrossingControl(103);
        boolean expResult = true;
        boolean result = instance.canWeFloat();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCanWeFloat4() {
        System.out.println("canWeFloat");
        RiverCrossingControl instance = new RiverCrossingControl(104);
        boolean expResult = true;
        boolean result = instance.canWeFloat();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCanWeFloat5() {
        System.out.println("canWeFloat");
        RiverCrossingControl instance = new RiverCrossingControl(105);
        boolean expResult = true;
        boolean result = instance.canWeFloat();
        assertEquals(expResult, result);
    }
    
        @Test
    public void testCanWeFloat6() {
        System.out.println("canWeFloat");
        RiverCrossingControl instance = new RiverCrossingControl(106);
        boolean expResult = false;
        boolean result = instance.canWeFloat();
        assertEquals(expResult, result);
    }
    
    
    
    
    
    
    
}

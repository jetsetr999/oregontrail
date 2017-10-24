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
public class RiverCrossingControlTest {
    
    public RiverCrossingControlTest() {
    }

    /**
     * Test 1 
     */
    @Test
    public void test1CalcSupplyDrop() {
        System.out.println("calcSupplyDrop");
        double amntSuppliesDropped = 1;
        double currentSupplies = 1;
        double depth = 1;
        double multiplyer = 1;
        double speed = 1;
        double weight = 1;
        double amount = 1;
        RiverCrossingControl instance = new RiverCrossingControl();
        double expResult = 0;
        double result = instance.calcSupplyDrop(amntSuppliesDropped, currentSupplies, depth, multiplyer, speed, weight, amount);
        assertEquals(expResult, result, 0.0);
    }
    
    
        /**
     * Test 2 
     */
    @Test
    public void test2CalcSupplyDrop() {
        System.out.println("calcSupplyDrop");
        double amntSuppliesDropped = 10;
        double currentSupplies = 5;
        double depth = 2;
        double multiplyer = 3;
        double speed = 2;
        double weight = 3;
        double amount = 2;
        RiverCrossingControl instance = new RiverCrossingControl();
        double expResult = 0;
        double result = instance.calcSupplyDrop(amntSuppliesDropped, currentSupplies, depth, multiplyer, speed, weight, amount);
        assertEquals(expResult, result, 0.0);
    }
    
    
        /**
     * Test 3 
     */
    @Test
    public void test3CalcSupplyDrop() {
        System.out.println("calcSupplyDrop");
        double amntSuppliesDropped = 10;
        double currentSupplies = 10;
        double depth = 10;
        double multiplyer = 10;
        double speed = 10;
        double weight = 10;
        double amount = 10;
        RiverCrossingControl instance = new RiverCrossingControl();
        double expResult = -1;
        double result = instance.calcSupplyDrop(amntSuppliesDropped, currentSupplies, depth, multiplyer, speed, weight, amount);
        assertEquals(expResult, result, 0.0);
    }
    
        /**
     * Test 4 
     */
    @Test
    public void test4CalcSupplyDrop() {
        System.out.println("calcSupplyDrop");
        double amntSuppliesDropped = 10;
        double currentSupplies = 10;
        double depth = 1;
        double multiplyer = 1;
        double speed = 10;
        double weight = 10;
        double amount = 1;
        RiverCrossingControl instance = new RiverCrossingControl();
        double expResult = -1;
        double result = instance.calcSupplyDrop(amntSuppliesDropped, currentSupplies, depth, multiplyer, speed, weight, amount);
        assertEquals(expResult, result, 0.0);
    }
    
        /**
     * Test 5 
     */
    @Test
    public void test5CalcSupplyDrop() {
        System.out.println("calcSupplyDrop");
        double amntSuppliesDropped = 1;
        double currentSupplies = 1;
        double depth = 1;
        double multiplyer = 1;
        double speed = 1;
        double weight = 1;
        double amount = 1;
        RiverCrossingControl instance = new RiverCrossingControl();
        double expResult = 0;
        double result = instance.calcSupplyDrop(amntSuppliesDropped, currentSupplies, depth, multiplyer, speed, weight, amount);
        assertEquals(expResult, result, 0.0);
    }
    
        /**
     * Test 6 
     */
    @Test
    public void test6CalcSupplyDrop() {
        System.out.println("calcSupplyDrop");
        double amntSuppliesDropped = 1;
        double currentSupplies = 1;
        double depth = 1;
        double multiplyer = 1;
        double speed = 1;
        double weight = 1;
        double amount = 1;
        RiverCrossingControl instance = new RiverCrossingControl();
        double expResult = 0;
        double result = instance.calcSupplyDrop(amntSuppliesDropped, currentSupplies, depth, multiplyer, speed, weight, amount);
        assertEquals(expResult, result, 0.0);
    }
}

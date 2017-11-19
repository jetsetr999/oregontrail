/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import oregontrail.control.*;
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
        System.out.println("Test Case 1");
        double health = 256;
        double rations = 45;
        double rest = 55;
        double joy = 16;
        EventControl instance = new EventControl();
        double expResult = 372;
        double result = instance.teamStatus(health, rations, rest, joy);
        assertEquals(expResult, result, 0.0);

    }

     /**
     * Test 2
     */
    @Test
    public void test2GetSubTotal() {
        System.out.println("Test Case 2");
        double health = -5;
        double rations = 66;
        double rest = 155;
        double joy = 16;
        EventControl instance = new EventControl();
        double expResult = -1;
        double result = instance.teamStatus(health, rations, rest, joy);
        assertEquals(expResult, result, 0.0);

    }/**
     * Test 3
     */
    @Test
    public void test3GetSubTotal() {
        System.out.println("Test Case 3");
        double health = 333;
        double rations = -4;
        double rest = 57;
        double joy = 122;
        EventControl instance = new EventControl();
        double expResult = -1;
        double result = instance.teamStatus(health, rations, rest, joy);
        assertEquals(expResult, result, 0.0);

    }/**
     * Test 4
     */
    @Test
    public void test4GetSubTotal() {
        System.out.println("Test Case 4");
        double health = 299;
        double rations = 125;
        double rest = -12;
        double joy = 48;
        EventControl instance = new EventControl();
        double expResult = -1;
        double result = instance.teamStatus(health, rations, rest, joy);
        assertEquals(expResult, result, 0.0);

    }/**
     * Test 5
     */
    @Test
    public void test5GetSubTotal() {
        System.out.println("Test Case 5");
        double health = 296;
        double rations = 78;
        double rest = 96;
        double joy = -1;
        EventControl instance = new EventControl();
        double expResult = -1;
        double result = instance.teamStatus(health, rations, rest, joy);
        assertEquals(expResult, result, 0.0);

    }/**
     * Test 6
     */
    @Test
    public void test6GetSubTotal() {
        System.out.println("Test Case 6");
        double health = 1;
        double rations = 0;
        double rest = 0;
        double joy = 0;
        EventControl instance = new EventControl();
        double expResult = 1;
        double result = instance.teamStatus(health, rations, rest, joy);
        assertEquals(expResult, result, 0.0);

    }/**
     * Test 7
     */
    @Test
    public void test7GetSubTotal() {
        System.out.println("Test Case 7");
        double health = 300;
        double rations = 300;
        double rest = 300;
        double joy = 300;
        EventControl instance = new EventControl();
        double expResult = 1200;
        double result = instance.teamStatus(health, rations, rest, joy);
        assertEquals(expResult, result, 0.0);

    }

    private void assertEquals(double expResult, double result, double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
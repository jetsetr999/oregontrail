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
public class SceneControlTest {
    
    public SceneControlTest() {
    }

    /**
     * Test 1
     */
    @Test
    public void test1SceneSelection() {
        System.out.println("Test case 1");
        double distance = 2000;
        double time = 8;
        double health = 200;
        SceneControl instance = new SceneControl();
        double expResult = 500;
        double result = instance.sceneSelection(distance, time, health);
        assertEquals(expResult, result, 0.0);
    }
    
        /**
     * Test 2
     */
    @Test
    public void test2SceneSelection() {
        System.out.println("Test case 2");
        double distance = -1;
        double time = 8;
        double health = 200;
        SceneControl instance = new SceneControl();
        double expResult = -1;
        double result = instance.sceneSelection(distance, time, health);
        assertEquals(expResult, result, 0.0);
    }
    
        /**
     * Test 3
     */
    @Test
    public void test3SceneSelection() {
        System.out.println("Test case 3");
        double distance = 2000;
        double time = -1;
        double health = 200;
        SceneControl instance = new SceneControl();
        double expResult = -1;
        double result = instance.sceneSelection(distance, time, health);
        assertEquals(expResult, result, 0.0);
    }
    
        /**
     * Test 4
     */
    @Test
    public void test4SceneSelection() {
        System.out.println("Test case 4");
        double distance = 2000;
        double time = 8;
        double health = -1;
        SceneControl instance = new SceneControl();
        double expResult = -1;
        double result = instance.sceneSelection(distance, time, health);
        assertEquals(expResult, result, 0.0);
    }
    
        /**
     * Test 5
     */
    @Test
    public void test5SceneSelection() {
        System.out.println("Test case 5");
        double distance = 0;
        double time = 8;
        double health = 200;
        SceneControl instance = new SceneControl();
        double expResult = 2500;
        double result = instance.sceneSelection(distance, time, health);
        assertEquals(expResult, result, 0.0);
    }
    
        /**
     * Test 6
     */
    @Test
    public void test6SceneSelection() {
        System.out.println("Test case 6");
        double distance = 2500;
        double time = 8;
        double health = 200;
        SceneControl instance = new SceneControl();
        double expResult = 0;
        double result = instance.sceneSelection(distance, time, health);
        assertEquals(expResult, result, 0.0);
    }
    
}

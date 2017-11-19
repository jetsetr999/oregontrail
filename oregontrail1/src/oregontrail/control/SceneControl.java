/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;
/**
 *
 * @author Kyle Jones
 */
public class SceneControl {
    
    public double sceneSelection( double distance, double time, double health)
    {
        
        if( distance > 2500 || distance < 0 || time > 24 || time < 0 || health > 300 || health < 0 )
        {
            System.out.println("\nDistance must be greater than 0 and less than 2500 "
                    + "and time must be valid (between 0 and 24"
                    + "and health cannot be above full health and below 0 (death)");
            return -1;
        }
                
        double sceneSelection;
        sceneSelection = 2500 - distance;
        
        return sceneSelection;
        
    }
}

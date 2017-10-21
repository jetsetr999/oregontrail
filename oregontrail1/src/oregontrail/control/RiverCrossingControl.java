/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;
import java.util.Random;
/**
 * Responsibility - evaluate chance of floating across river given
 * random environmental variables.
 * @author Kyle Jones
 */
public class RiverCrossingControl 
{
    Random myRandom;

    public RiverCrossingControl(long seed) {
        myRandom = new Random(seed);
    }
    private double getWidth()
    {
        double width = myRandom.nextDouble() * 980 + 20;
        return width;
    }
    private double getDepth()
    {
        double depth = myRandom.nextDouble() * 19 + 1;
        return depth;
    }
    private double getRiverSpeed()
    {
        double riverSpeed = myRandom.nextDouble() * 5;
        return riverSpeed;
    }
    
    private double getChanceOfFailure()
    {
        double chance = myRandom.nextDouble() + .01;
        return chance;
    }
    
    private boolean didWeFloat( double width, double depth
                              , double riverSpeed, double chance)
    {
        if(width < 20 || depth < 1 || riverSpeed < 0 || width > 1000 || depth > 20 || riverSpeed > 5)
        { 
            return false;
        }

        double chanceOfFloat = (((width * 0.1) 
                             + (depth * 0.5)) 
                             * (riverSpeed * 0.1)) / 75;
        
        if (chanceOfFloat >= chance)
        {
            return false;
        }
        return true;
    }
    
    public boolean canWeFloat()
    {
        double width = getWidth();
        double depth = getDepth();
        double riverSpeed = getRiverSpeed();
        double chance = getChanceOfFailure();
        boolean weFloat = didWeFloat(width, depth, riverSpeed, chance);
        return weFloat;
    }
}

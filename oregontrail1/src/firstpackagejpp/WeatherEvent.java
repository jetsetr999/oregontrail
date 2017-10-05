/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpackagejpp;

import java.io.Serializable;

/**
 *
 * @author Kyle Jones
 */
public class WeatherEvent extends Event implements Serializable
{
    private int extraDelay;

    public int getExtraDelay() {
        return extraDelay;
    }

    public void setExtraDelay(int extraDelay) {
        this.extraDelay = extraDelay;
    }
  
}

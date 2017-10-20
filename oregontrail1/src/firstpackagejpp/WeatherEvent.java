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

    public WeatherEvent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getExtraDelay() {
        return extraDelay;
    }

    public void setExtraDelay(int extraDelay) {
        this.extraDelay = extraDelay;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.extraDelay;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final WeatherEvent other = (WeatherEvent) obj;
        if (this.extraDelay != other.extraDelay) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "WeatherEvent{" + "extraDelay=" + extraDelay + '}';
    }

    public WeatherEvent(String name, String type, int delay, String effect, String counter, double chanceOfOccurring) {
        super(name, type, delay, effect, counter, chanceOfOccurring);
    }
  
    
    
}

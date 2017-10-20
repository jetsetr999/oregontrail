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
public class HealthEvent extends Event implements Serializable
{
    private int decreaseHealth;

    public HealthEvent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getDecreaseHealth() {
        return decreaseHealth;
    }

    public void setDecreaseHealth(int decreaseHealth) {
        this.decreaseHealth = decreaseHealth;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.decreaseHealth;
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
        final HealthEvent other = (HealthEvent) obj;
        if (this.decreaseHealth != other.decreaseHealth) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HealthEvent{" + "decreaseHealth=" + decreaseHealth + '}';
    
    
    }

    public HealthEvent(int decreaseHealth, String name, String type, int delay, String effect, String counter, double chanceOfOccurring) {
        super(name, type, delay, effect, counter, chanceOfOccurring);
        this.decreaseHealth = decreaseHealth;
    }
    
  
   
    
}

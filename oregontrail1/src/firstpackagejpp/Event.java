/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpackagejpp;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Kyle Jones
 */
public class Event implements Serializable
{
    
    private String name;
    private String type;
    private int delay;
    private String effect;
    private String counter;
    private double chanceOfOccurring;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }
    
    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getCounter() {
        return counter;
    }

    public void setCounter(String counter) {
        this.counter = counter;
    }

    public double getChanceOfOccurring() {
        return chanceOfOccurring;
    }

    public void setChanceOfOccurring(double chanceOfOccurring) {
        this.chanceOfOccurring = chanceOfOccurring;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.type);
        hash = 89 * hash + this.delay;
        hash = 89 * hash + Objects.hashCode(this.effect);
        hash = 89 * hash + Objects.hashCode(this.counter);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.chanceOfOccurring) ^ (Double.doubleToLongBits(this.chanceOfOccurring) >>> 32));
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
        final Event other = (Event) obj;
        if (this.delay != other.delay) {
            return false;
        }
        if (Double.doubleToLongBits(this.chanceOfOccurring) != Double.doubleToLongBits(other.chanceOfOccurring)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.effect, other.effect)) {
            return false;
        }
        if (!Objects.equals(this.counter, other.counter)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Event{" + "name=" + name + ", type=" + type + ", delay=" + delay + ", effect=" + effect + ", counter=" + counter + ", chanceOfOccurring=" + chanceOfOccurring + '}';
    }
    
    
    
    
}

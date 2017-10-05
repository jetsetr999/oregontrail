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
      
}

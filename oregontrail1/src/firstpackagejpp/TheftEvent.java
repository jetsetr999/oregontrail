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
public class TheftEvent extends Event implements Serializable
{
    private int decreaseAmount;

    public int getDecreaseAmount() {
        return decreaseAmount;
    }

    public void setDecreaseAmount(int decreaseAmount) {
        this.decreaseAmount = decreaseAmount;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.decreaseAmount;
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
        final TheftEvent other = (TheftEvent) obj;
        if (this.decreaseAmount != other.decreaseAmount) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TheftEvent{" + "decreaseAmount=" + decreaseAmount + '}';
    }
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpackagejpp;

/**
 *
 * @author Darrin
 */
public class TrailStopScene {
    
   private int increaseAmount;

    public int getIncreaseAmount() {
        return increaseAmount;
    }

    public void setIncreaseAmount(int increaseAmount) {
        this.increaseAmount = increaseAmount;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.increaseAmount;
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
        final TrailStopScene other = (TrailStopScene) obj;
        if (this.increaseAmount != other.increaseAmount) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TrailStopScene{" + "increaseAmount=" + increaseAmount + '}';
    }
   
    
    
}

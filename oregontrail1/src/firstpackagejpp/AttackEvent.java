/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpackagejpp;

/**
 *
 * @author Kyle Jones
 */
public class AttackEvent extends Event
{
    private int decreaseAmount;
    private int decreaseHealth;

    public int getDecreaseAmount() {
        return decreaseAmount;
    }

    public void setDecreaseAmount(int decreaseAmount) {
        this.decreaseAmount = decreaseAmount;
    }

    public int getDecreaseHealth() {
        return decreaseHealth;
    }

    public void setDecreaseHealth(int decreaseHealth) {
        this.decreaseHealth = decreaseHealth;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.decreaseAmount;
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
        final AttackEvent other = (AttackEvent) obj;
        if (this.decreaseAmount != other.decreaseAmount) {
            return false;
        }
        if (this.decreaseHealth != other.decreaseHealth) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AttackEvent{" + "decreaseAmount=" + decreaseAmount + ", decreaseHealth=" + decreaseHealth + '}';
    }
    
    
    
    
}

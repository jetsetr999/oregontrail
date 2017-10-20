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
public class FortScene {

    private int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.amount;
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
        final FortScene other = (FortScene) obj;
        return this.amount == other.amount;
    }

    @Override
    public String toString() {
        return "FortScene{" + "amount=" + amount + '}';
    }

}

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
public class InventoryItem implements Serializable
{
    private String name;
    private int quantityInStock;
    private int requiredAmount;
    private int weightPerUnit;
    private double pricePerUnit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public int getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(int requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    public int getWeightPerUnit() {
        return weightPerUnit;
    }

    public void setWeightPerUnit(int weightPerUnit) {
        this.weightPerUnit = weightPerUnit;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.name);
        hash = 23 * hash + this.quantityInStock;
        hash = 23 * hash + this.requiredAmount;
        hash = 23 * hash + this.weightPerUnit;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.pricePerUnit) ^ (Double.doubleToLongBits(this.pricePerUnit) >>> 32));
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
        final InventoryItem other = (InventoryItem) obj;
        if (this.quantityInStock != other.quantityInStock) {
            return false;
        }
        if (this.requiredAmount != other.requiredAmount) {
            return false;
        }
        if (this.weightPerUnit != other.weightPerUnit) {
            return false;
        }
        if (Double.doubleToLongBits(this.pricePerUnit) != Double.doubleToLongBits(other.pricePerUnit)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "name=" + name + ", quantityInStock=" + quantityInStock + ", requiredAmount=" + requiredAmount + ", weightPerUnit=" + weightPerUnit + ", pricePerUnit=" + pricePerUnit + '}';
    }
    
    
    
    
}

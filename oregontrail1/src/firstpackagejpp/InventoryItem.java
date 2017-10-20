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
    private double quantityInStock;
    private double requiredAmount;
    private double weightPerUnit;
    private double pricePerUnit;
    private double onHandItem;
    private double itemQuantity;

    public InventoryItem(String name, int quantityInStock, int requiredAmount, int weightPerUnit, double pricePerUnit, double onHandItem, double itemQuantity) {
        this.name = name;
        this.quantityInStock = quantityInStock;
        this.requiredAmount = requiredAmount;
        this.weightPerUnit = weightPerUnit;
        this.pricePerUnit = pricePerUnit;
        this.onHandItem = onHandItem;
        this.itemQuantity = itemQuantity;
    }

    public InventoryItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getOnHandItem() {
        return onHandItem;
    }

    public void setOnHandItem(double onHandItem) {
        this.onHandItem = onHandItem;
    }

    public double getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(double itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public double getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(int requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    public double getWeightPerUnit() {
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
        hash = (int) (23 * hash + this.quantityInStock);
        hash = (int) (23 * hash + this.requiredAmount);
        hash = (int) (23 * hash + this.weightPerUnit);
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

    public InventoryItem(String name, double quantityInStock, double requiredAmount, double weightPerUnit, double pricePerUnit, double onHandItem, double itemQuantity) {
        this.name = name;
        this.quantityInStock = quantityInStock;
        this.requiredAmount = requiredAmount;
        this.weightPerUnit = weightPerUnit;
        this.pricePerUnit = pricePerUnit;
        this.onHandItem = onHandItem;
        this.itemQuantity = itemQuantity;
    }
    
    
    
    
}

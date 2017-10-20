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
public class RiverCrossingScene {
    
    private int depth;

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getCrossingTime() {
        return crossingTime;
    }

    public void setCrossingTime(int crossingTime) {
        this.crossingTime = crossingTime;
    }

    public int getDropSupplies() {
        return dropSupplies;
    }

    public void setDropSupplies(int dropSupplies) {
        this.dropSupplies = dropSupplies;
    }
    private int width;
    private int crossingTime;
    private int dropSupplies;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.depth;
        hash = 53 * hash + this.width;
        hash = 53 * hash + this.crossingTime;
        hash = 53 * hash + this.dropSupplies;
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
        final RiverCrossingScene other = (RiverCrossingScene) obj;
        if (this.depth != other.depth) {
            return false;
        }
        if (this.width != other.width) {
            return false;
        }
        if (this.crossingTime != other.crossingTime) {
            return false;
        }
        if (this.dropSupplies != other.dropSupplies) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RioverCrossingScene{" + "depth=" + depth + ", width=" + width + ", crossingTime=" + crossingTime + ", dropSupplies=" + dropSupplies + '}';
    }
    
    
    
    
}

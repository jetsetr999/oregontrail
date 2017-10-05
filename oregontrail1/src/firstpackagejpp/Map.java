/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpackagejpp;
import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Kyle Jones
 */
public class Map implements Serializable
{
    private Point description;
    private int rowCount;
    private int columnCount;
    
    public Point getDescription() {
        return description;
    }

    public void setDescription(Point description) {
        this.description = description;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.description);
        hash = 89 * hash + this.rowCount;
        hash = 89 * hash + this.columnCount;
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
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "description=" + description + ", rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }
    
    
    
    
    
}

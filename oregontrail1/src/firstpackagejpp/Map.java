/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpackagejpp;
import java.awt.Point;
import java.io.Serializable;

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
    
    
    
}

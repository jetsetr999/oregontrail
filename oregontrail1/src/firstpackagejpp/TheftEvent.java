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
    
    
}

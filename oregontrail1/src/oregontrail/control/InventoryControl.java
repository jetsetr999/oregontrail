/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;
/**
 *
 * @author Kyle Jones
 */
public class InventoryControl
{
    public double getSubTotal(double weight, double amount
                             , double pricePerUnit, double onHandItem 
                             , double itemQuantity)
                             
    {
        
        if (amount < 0 || weight < 0 || weight > 300 || amount > 300)
        {
            System.out.println("\nthe weight and amount must be greater than 0 "
            + "and the weight and amount must be less than or equal to 300.");
            return -1;
        }
        double calcWeight = amount * itemQuantity;
        double addToInventory = onHandItem + itemQuantity;
        double removeFromInventory = onHandItem - itemQuantity;
        double subTotal = itemQuantity * pricePerUnit;
        return subTotal;
    }
     
}
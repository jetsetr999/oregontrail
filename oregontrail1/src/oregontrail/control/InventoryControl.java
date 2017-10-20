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
    public double getSubTotal(double pricePerUnit , double itemQuantity)
                             
    {
        
        if (pricePerUnit < 0 || itemQuantity <= 0 || itemQuantity > 300 || pricePerUnit > 300)
        {
            System.out.println("\nthe weight and amount must be greater than 0 "
            + "and the weight and amount must be less than or equal to 300.");
            return -1;
        }
        double subTotal = itemQuantity * pricePerUnit;
        return subTotal;
    }
     
}
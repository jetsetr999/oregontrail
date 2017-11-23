/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;

import firstpackagejpp.InventoryItem;
import oregontrail.exceptions.InventoryControlException; 

/**
 *
 * @author Kyle Jones
 * This is being added JUST so I can push this version
 */
public class InventoryControl 
{
    public double getSubTotal(double pricePerUnit , double itemQuantity) throws InventoryControlException
                             
    {
        
        if (pricePerUnit < 0 || itemQuantity <= 0 || itemQuantity > 300 || pricePerUnit > 300)
        {
            /*System.out.println("\nthe weight and amount must be greater than 0 "
            + "and the weight and amount must be less than or equal to 300.");*/
            throw new InventoryControlException(" the weight and amount must be greater than 0"
                                              + "and the weight and amount must be less than or equal to 300."); 
                                             
        }
        double subTotal = itemQuantity * pricePerUnit;
        return subTotal;
    }
    public static void getItem(String item) {
        
    }

    public static String getItem() {
         System.out.println("\n getItem stub");
        return null;
         
    }
     
}
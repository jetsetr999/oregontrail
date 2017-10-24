/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;

/**
 *
 * @author Darrin Porter
 */
public class EventControl {
    
    public double getOnHand( double onHand, double deductAmount)
    {
        if(onHand < 1 || deductAmount < 1 || onHand > 300 || deductAmount > 300)
        {
            System.out.println("\nThe amoount on hand must be greater than 0 "
                    + " and less than 300" + "\nor the deduction amount must "
                    + "be greater than 0 or less than 300.");
            return -1;
        }
             onHand = onHand - deductAmount;
        return onHand;
    }    

/*    Random rPercent;
    
    public EventControl(double failureChance) 
    {
        rPercent = new Random(failureChance);*/
    

}

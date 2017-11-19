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
    
    public double teamStatus( double health, double rations, double rest, double joy)
    {
        
        if( health > 300 || health < 1 || rations > 300 || rations < 0 || rest > 300 || rest < 0 || joy > 300 || joy < 0 )
        {
            System.out.println("\nThe amoount on hand must be greater than 0 "
                    + " and less than 300" + "\nor the deduction amount must "
                    + "be greater than 0 or less than 300.");
            return -1;
        }
                
        double teamStatus;
        teamStatus = health + rations + rest + joy;
        
        return teamStatus;
        
    }    

/*    Random rPercent;
    
    public EventControl(double failureChance) 
    {
        rPercent = new Random(failureChance);*/

    double getOnHand(double health, double rations, double rest, double joy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //double teamStatus(double health, double rations, double rest, double joy) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
    

}

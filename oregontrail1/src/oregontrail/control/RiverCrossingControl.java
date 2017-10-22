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
public class RiverCrossingControl {

    private double depth;
    private double weight;
    private double speed;
    private double multiplyer;
    
    public double calcSupplyDrop(double amntSuppliesDropped, double currentSupplies, double depth, double multiplyer, double speed, double weight, double amount) {
        
        if (amount < 0 || weight < 0 || speed < 0 || weight > 300 || amount > 300 || speed > 5) {
            
            System.out.println("\nThe weight and amount must be greater than 0 and the weight and amount must be less than or equal to 300! Speed can only be 0 through 5!"); 
            return -1;
        }
        
        if (depth >= 1 || depth <= 10 || weight >= 1 || weight <= 10 || speed == 0 || speed == 1) {
            multiplyer = .005;
        } 
        else if (depth >= 11 || depth <= 100 ||weight >= 11 || weight <= 100 || speed == 2 || speed == 3)  {
            multiplyer = .008;
        }
        else if (depth >= 101 || depth <= 299 || weight >= 101 || weight <= 299 || speed == 4 || speed == 5)
            multiplyer = .01;
        return 0;
        }
        double amntSuppliesDropped = depth * multiplyer + speed * multiplyer + weight * multiplyer;

    }
    


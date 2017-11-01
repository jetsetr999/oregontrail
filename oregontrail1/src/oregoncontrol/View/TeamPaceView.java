/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregoncontrol.View;

import java.util.Scanner;
import oregontrail.control.GameControl;
import oregontrail1.OregonTrail1;

/**
 *
 * @author parhe
 */
public class TeamPaceView {
    
    private String promptCommand;
    
    public TeamPaceView() {
        
                System.out.println(
                    "\n---------------------------------"
                  + "\n| Team Pace Menu                |"
                  + "\n---------------------------------"
                  + "\n Current Team Pace =             "
                  + "\n---------------------------------"
                  + "\n| Select Team Pace:             |" 
                  + "\nS - Slow                         "
                  + "\nA - Average                      "
                  + "\nF - Fast                         "
                  + "\nR - Return to game menu          "
                  + "\n---------------------------------"
                );
    }

    public void displayTeamPaceMenuView() {
        
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("R"))
                return;
            
            done = this.doAction(menuOption);
        } while (!done);
    
    }

    private String getMenuOption() {
        
        Scanner keyboard = new Scanner(System.in);
	String value = "G";
	boolean valid = false;
	
	while (!valid) {
            System.out.println("\n" + this.promptCommand);
		
            value = keyboard.nextLine();
            value = value.trim();
		
            if (value.length() < 1) {
		System.out.println("\nInvalid value: value can not be blank");
		continue;
		}
		
		break;
	}
	
	return value;
    }

    private boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "S":
                this.setPaceToSlow();
                break;
            case "A":
                this.setPaceToAverage();
                break;
            case "F":
                this.setPaceToFast();
                break;
            case "R":
                this.returnToGameMenuView();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
            return false;
    }

    private void setPaceToSlow() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setPaceToAverage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setPaceToFast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void returnToGameMenuView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
    
}

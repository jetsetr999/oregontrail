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
public final class TeamPaceView {
    
    private String promptCommand;
    
    public TeamPaceView() {
        
        this.promptCommand = "\nPlease Make Selection: ";
        
        this.displayTeamPaceBanner();
    }
    
    
    public void displayTeamPaceBanner() {
        
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
        System.out.println("\n*** Set Pace Slow function called ***");
    }

    private void setPaceToAverage() {
        System.out.println("\n*** Set Pace Average function called ***");
    }

    private void setPaceToFast() {
        System.out.println("\n*** Set Pace Fast function called ***");
    }

    private void returnToGameMenuView() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();
    }    
    
}

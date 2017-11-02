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
public class GameMenuView {
    
    private String menu;
    private final String promptCommand;
    
    public GameMenuView() {
        
    this.promptCommand = "\nPlease Make Selection: ";
        
    this.displayGameMenuBanner();
        
    }

    public void displayGameMenuBanner() {
        
                System.out.println(
                      "\n******************************************************"
                    + "\n |Current State Information:                         |"
                    + "\n Today is (place current date and time here)          "                                             
                    + "\n Distance traveled is (place distance traveled)       "
                    + "\n Remaining distance is (place remaining distance)     "
                    + "\n (display surrounding towns, rivers, mountains, exc)  "
                    + "\n (display events/scenes)                              "
                    + "\n |Options:                                           |"
                    + "\nT - View Team Status                                  "
                    + "\nS - View Team Supplies                                "
                    + "\nP - Set Team Pace                                     "
                    + "\nA - Scene Menu (based upon active scene)              "
                    + "\nM - View The Map                                      "
                    + "\nH - Help Menu                                         "
                    + "\nR - Return To Main Menu                               "
                    + "\n******************************************************"
                );
    }
    
    public void displayGameMenuView() {
        
        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(menuOption);
        } while (!done);
    
    }
    
    private String getMenuOption() {
        
        Scanner keyboard = new Scanner(System.in);
	String value = "N";
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
            case "T":
                this.viewTeamStatus();
                break;
            case "S":
                this.viewTeamSupplies();
                break;
            case "P":
                this.setTeamPace();
                break;
            case "A":
                this.sceneMenu();
                break;
            case "M":
                this.viewMap();
                break;
            case "H":
                this.helpMenu();
                break;
            case "R":
                this.returnToMainMenu();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
            return false;
    }

    private void viewTeamStatus() {
        
        TeamStatusView teamStatusView = new TeamStatusView();
        
        teamStatusView.displayTeamStatusView();
    }

    private void viewTeamSupplies() {
        System.out.println("\n*** Team Status Called");
    }

    private void setTeamPace() {
        TeamPaceView teamPaceView = new TeamPaceView();
        
        teamPaceView.displayTeamPaceMenuView();
    }

    private void sceneMenu() {
        System.out.println("\n*** Scene Menu Called");
    }

    private void viewMap() {
        System.out.println("\n*** View Map Called");
    }

    private void helpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        
        helpMenuView.displayHelpMenuView();
    }

    private void returnToMainMenu() {
        System.out.println("\n*** Return To Main Menu Called");
    }


    
    
    
}

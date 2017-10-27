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
public class HelpMenuView {
    
    private String menu;
    private String promptCommand;

    public HelpMenuView() {
        this.menu = "\n"
                  + "\n---------------------------------"
                  + "\n| Help Menu                     |"
                  + "\n---------------------------------"
                  + "\nG - What is the goal of the game?"
                  + "\nM - How to move"
                  + "\nT - Tips"  
                  + "\nR - Return to previous menu" 
                  + "\n---------------------------------";
                            
                
    }

    public void displayHelpMenuView() {
        
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
            case "G":
                this.displayGameObjective();
                break;
            case "H":
                this.displayControls();
                break;
            case "T":
                this.displayTips();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
            return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(OregonTrail1.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void displayGameObjective() {
        System.out.println("\n*** displayGameObjective stub function called ***");
    }

    private void displayControls() {
        System.out.println("\n*** displayControls stub function called ***");
    }

    private void displayTips() {
        System.out.println("\n*** displayTips stub function called ***");
    }
                   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregoncontrol.View;

import java.util.Scanner;

/**
 *
 * @author parhe
 */
public class MainMenuView {
    
    private final String promptCommand;
    private String menu;

    public MainMenuView() {
        this.menu = "\n"
                  + "\n------------------------------"
                  + "\n| Main Menu                  |"
                  + "\n------------------------------"
                  + "\nN - Start new game"
                  + "\nG - Get and start saved game"
                  + "\nH - Get help on how to play the game"  
                  + "\nS - Save game"
                  + "\nQ - Quit"                
                  + "\n------------------------------";
                            
                
    }

    public void displayMainMenuView() {
        
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

    private boolean doAction(String menuOption) {
        System.out.println("\n*** doAction() function called ***");
        return true;
    }
}

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
public final class MainMenuView {

    private String menu;
    private final String promptCommand;
    
    public MainMenuView() {
        
        this.promptCommand = "\nPlease Make Selection: ";
        
        this.displayMainMenuBanner();
        
    }

    /*
     * We are leaving the commands for the Main Menu commands 
     * the same as the instructions for ease of use.
     */
    public void displayMainMenuBanner() {
               
            System.out.println(
                  "\n"
                + "\n------------------------------"
                + "\n| Main Menu                  |"
                + "\n------------------------------"
                + "\nN - Start new game"
                + "\nG - Get and start saved game"
                + "\nH - Get help on how to play the game"
                + "\nS - Save game"
                + "\nM - Map View"
                + "\nQ - Quit"
                + "\n------------------------------"
            );

    }

    public void displayMainMenuView() {

        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) {
                return;
            }

            done = this.doAction(menuOption);
        } while (!done);

    }

    // 
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

        choice = choice.toUpperCase(); // lowercase will work for uppercase

        switch (choice) {
            case "N":
                this.startNewGame(); // Start New Game
                break;
            case "G":
                this.startExistingGame(); // Load Game
                break;
            case "H":
                this.displayHelpMenu(); // Help Menu
                break;
            case "M":
                this.displayMapMenu(); // map menu
                break;
            case "S":
                this.saveGame(); // Save Game
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;
    }

    // calls the new game
    private void startNewGame() {
        GameControl.createNewGame(OregonTrail1.getPlayer());

        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();
    }

    // existing game
    private void startExistingGame() {
        System.out.println("\n*** start existing game ***");

        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();
    }

    // calls the help menu
    private void displayHelpMenu() {
        
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayHelpMenuView();

    }

    // stub function
    private void saveGame() {
        System.out.println("\n*** save game ***");
        
    }

    // calls the map menu
    private void displayMapMenu() {

        MapMenuView mapMenuView = new MapMenuView();
        mapMenuView.displayMapMenuView();

    }
}

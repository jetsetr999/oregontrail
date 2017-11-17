/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregoncontrol.View;

import java.util.Scanner;
import oregontrail.control.GameControl;
import oregontrail.control.MapControl;
import oregontrail1.OregonTrail1;

/**
 *
 * @author parhe
 */

public class MainMenuView extends View {
    
    public MainMenuView() {
         
          super("\n"
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

    @Override
    public boolean doAction(String choice) {

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
                this.displayMapMenuView(); // map menu
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
        MapControl.createMap(GameControl.getMap());

        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

    // existing game
    private void startExistingGame() {
        System.out.println("\n*** start existing game ***");

        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

    // calls the help menu
    private void displayHelpMenu() {
        
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();

    }
    
    private void displayMapMenuView() {
        MapMenuView mapMenuView = new MapMenuView();
        mapMenuView.display();
        
        
    }

    // stub function
    private void saveGame() {
        System.out.println("\n*** save game ***");
        
    }
}

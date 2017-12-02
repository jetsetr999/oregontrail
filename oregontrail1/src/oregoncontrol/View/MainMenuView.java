/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregoncontrol.View;

import firstpackagejpp.InventoryItem;
import java.util.Scanner;
import oregontrail.control.ActorControl;
import oregontrail.control.GameControl;
import oregontrail.control.InventoryControl;
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
                ErrorView.display(this.getClass().getName(),
                                "\nInvalid value: value can not be blank");
                break;
        }
        return false;
    }

    // calls the new game
    private void startNewGame() {
        //new game 
        GameControl.createNewGame(OregonTrail1.getGame());
        //map
        //MapControl.createMap(OregonTrail1.getMap());
        //actors
        ActorControl.getActor(ActorControl.getActor());
        //inventory 
        InventoryControl.getItem(InventoryControl.getItem());
        //location 
        //scene 
        //question
        //InventoryItem.createItem(OregonTrail1.getItem());

        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }

    // existing game
    private void startExistingGame() {
        this.console.println("\n Enter the file path for file where the game"
                           + "\n is to be saved");
        String filePath = this.getInput();
        
        try {
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrowView.display("MainMenuView", ex.getMessage());
        }
        
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
        this.console.println("\n Enter the file path for file where the game"
                           + "\n is to be saved");
        String filePath = this.getInput();
        
        try {
            GameControl.saveGame(OregonTrail1.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrowView.display("MainMenuView", ex.getMessage());
        }

    }
}

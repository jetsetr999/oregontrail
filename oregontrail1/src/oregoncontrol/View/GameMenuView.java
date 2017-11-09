/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregoncontrol.View;

/**
 *
 * @author Darrin
 */
public class GameMenuView {

    void displayMenu() {
        System.out.println("\n"
                + "\n\t------------------------------"
                + "\n\t| Main Menu                  |"
                + "\n\t------------------------------"
                + "\n\tN - Start new game"
                + "\n\tG - Get and start saved game"
                + "\n\tH - Get help on how to play the game"
                + "\n\tS - Save game"
                + "\n\tM - Map View"
                + "\n\tQ - Quit"
                + "\n\t------------------------------");

    }

    void displayMapMenu() {
        System.out.println("\n"
                + "\n\t ---------------------------------"
                + "\n\t | Map Menu                     |"
                + "\n\t ---------------------------------"
                + "\n\t M - Full Map View"
                + "\n\t D - Distance to next town, fort, or checkpoint"
                + "\n\t E - Distance to final destination"
                + "\n\t T - Distance Traveled "
                + "\n\t P - Return to previous menu"
                + "\n\t ---------------------------------");

    }

    void displayHelpMenu() {
        System.out.println("\n"
                + "\n\t ---------------------------------"
                + "\n\t | Help Menu                     |"
                + "\n\t ---------------------------------"
                + "\n\t G - Game strategy"
                + "\n\t M - Learn How to move"
                + "\n\t A - Game assists or Helpful hints"
                + "\n\t D - Gsme definitions"
                + "\n\t P - Return to previous menu"
                + "\n\t ---------------------------------");

    }

}

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
public class MenuView {

    void displayMenu() {
        this.console.println("\n"
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
        this.console.println("\n"
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
        this.console.println("\n"
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

    void displayInventoryMenuView() {
        this.console.println("\n"
                + "\n\t ------------------------------"
                + "\n\t | Inventory Menu             |"
                + "\n\t ------------------------------"
                + "\n\t L - List of Items"
                + "\n\t F - Amount of Food"
                + "\n\t M - Buy from Store"
                + "\n\t T - Trade"
                + "\n\t Q - Quit"
                + "\n------------------------------");

    }

    void displayTeamPaceBanner() {
        this.console.println("\n"
                + "\n\t ---------------------------------"
                + "\n\t | Team Pace Menu                |"
                + "\n\t ---------------------------------"
                + "\n\t  Current Team Pace =             "
                + "\n\t ---------------------------------"
                + "\n\t | Select Team Pace:             |"
                + "\n\t S - Slow                         "
                + "\n\t A - Average                      "
                + "\n\t F - Fast                         "
                + "\n\t R - Return to game menu          "
                + "\n\t ---------------------------------");

    }

    void displayTeamStatusView() {
        this.console.println("\n"
                + "\n\t ------------------------------"
                + "\n\t | Team Status                |"
                + "\n\t ------------------------------"
                + "\n\t H - Health"
                + "\n\t R - Rations"
                + "\n\t S - Rest"
                + "\n\t J - Joy"
                + "\n\t Q - Quit"
                + "\n\t ------------------------------");

    }

    void displayGameMenuBanner() {
        this.console.println("\n"
                + "\n\t ***************************************************"
                + "\n\t |Current State Information:                       |"
                + "\n\t Today is (place current date and time here)        "
                + "\n\t Distance traveled is (place distance traveled)     "
                + "\n\t Remaining distance is (place remaining distance)   "
                + "\n\t (display surrounding towns, rivers, mountains, exc)"
                + "\n\t (display events/scenes)                            "
                + "\n\t |Options:                                         |"
                + "\n\t T - View Team Status                               "
                + "\n\t S - View Team Supplies                             "
                + "\n\t P - Set Team Pace                                  "
                + "\n\t A - Scene Menu (based upon active scene)           "
                + "\n\t M - View The Map                                   "
                + "\n\t H - Help Menu                                      "
                + "\n\t R - Return To Main Menu                            "
                + "\n\t ***************************************************"
        );

    }
}

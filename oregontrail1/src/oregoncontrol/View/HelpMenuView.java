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
                + "\n\t ---------------------------------"
                + "\n\t | Help Menu                     |"
                + "\n\t ---------------------------------"
                + "\n\t G - Game strategy"
                + "\n\t M - Learn How to move"
                + "\n\t A - Game assists or Helpful hints"
                + "\n\t D - Game definitions"
                + "\n\t P - Return to previous menu"
                + "\n\t ---------------------------------";

    }

    public void displayHelpMenuView() {

        boolean done = false;
        do {
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("P")) {
                return;
            }

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
                this.displayGameStrategy();
                break;
            case "M":
                this.displayMovement();
                break;
            case "A":
                this.displayAssists();
                break;
            case "D":
                this.displayDefinitions();
                break;
            case "P":
                this.returnToPreviousMenu();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;
    }

    private void displayGameStrategy() {
        System.out.println(
                  "\n--------------------------------"
                + "\n Write a game strategy          "
                + "\n                                "
                + "\n                                "
                + "\n                                "
                + "\n--------------------------------"
        );

    }

    private void displayMovement() {
        System.out.println("\n*** displayMovement stub function called ***");

        MovementView movementView = new MovementView();
        movementView.displayMovementView();
    }

    private void displayAssists() {
        System.out.println(
                  "\n--------------------------------"
                + "\n Display Assists/Helpful Hints  "
                + "\n                                "
                + "\n                                "
                + "\n                                "
                + "\n--------------------------------"
        );
                    

    }

    private void displayDefinitions() {
        System.out.println(
                  "\n--------------------------------"
                + "\n Game Definitions               "
                + "\n                                "
                + "\n                                "
                + "\n                                "
                + "\n--------------------------------"
        );

    }

    private void returnToPreviousMenu() {
        System.out.println("\n*** return function called");
    }

}

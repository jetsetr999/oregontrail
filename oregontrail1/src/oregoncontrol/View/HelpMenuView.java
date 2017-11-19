/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregoncontrol.View;

import java.util.Scanner;
import oregontrail.control.ActorControlTest;

/**
 *
 * @author parhe
 */
public class HelpMenuView extends View {

    public HelpMenuView() {
        super("\n"
                + "\n\t ---------------------------------"
                + "\n\t | Help Menu                     |"
                + "\n\t ---------------------------------"
                + "\n\t G - Game strategy"
                + "\n\t M - Learn How to move"
                + "\n\t A - Game assists or Helpful hints"
                + "\n\t D - Gsme definitions"
                + "\n\t T - Call the Actor Test"
                + "\n\t R - Return to previous menu"
                + "\n\t ---------------------------------");

    }

    @Override
    public boolean doAction(String choice) {

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
            case "T":
                this.ActorControlTest(); // Actor sort test
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

    private void displayGameStrategy() {
        System.out.println("\n*** displayGameStrategy stub function called ***");

    }

    private void displayMovement() {
        System.out.println("\n*** displayMovement stub function called ***");

    }

    private void displayAssists() {
        System.out.println("\n*** displayAssists stub function called ***");

    }

    private void displayDefinitions() {
        System.out.println("\n*** displayDefinitions stub function called ***");

    }

    private void returnToMainMenu() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }

    void displayHelpMenuView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void ActorControlTest() {
        System.out.println(" ActorControlTest Stub");

    }

    private static class actorControlTest {

        private static void display() {
            ActorControlTest actorTest = ActorControlTest();
            actorControlTest.display();
        }

        private static ActorControlTest ActorControlTest() {
            System.out.println(" ActorControlTest Stub");
            return null;
        }

    }
}
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
 * @author Darrin
 */
public class MapMenuView extends View {

    public MapMenuView() {
        super("\n"
                + "\n\t ---------------------------------"
                + "\n\t | Map Menu                     |"
                + "\n\t ---------------------------------"
                + "\n\t M - Full Map View"
                + "\n\t D - Distance to next town, fort, or checkpoint"
                + "\n\t E - Distance to final destination"
                + "\n\t T - Distance Traveled "
                + "\n\t R - Return to previous menu"
                + "\n\t ---------------------------------");

    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase();

        switch (choice) {
            case "M":
                this.displayMapView();
                break;
            case "D":
                this.displayDistanceNext();
                break;
            case "E":
                this.displayDistanceFinal();
                break;
            case "T":
                this.displayDistanceTraveled();
                break;
            case "R":
                this.returnToMainMenu();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                                "\nInvalid value: value can not be blank");
                break;
        }
        return false;
    }

    private void displayMapView() {
        this.console.println("\n*** displayMapView stub function called ***");

    }

    private void displayDistanceNext() {
        this.console.println("\n*** displayDistanceNext stub function called ***");

    }

    private void displayDistanceFinal() {
        this.console.println("\n*** displayDistanceFinal stub function called ***");

    }

    private void displayDistanceTraveled() {
        this.console.println("\n*** displayDistanceTraveled stub function called "
                + "***");
    }

    private void returnToMainMenu() {
        MainMenuView mainMenuView = new MainMenuView();
	mainMenuView.display();
    }

    
}

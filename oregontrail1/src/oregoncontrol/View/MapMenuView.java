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
public class MapMenuView {

    private String menu;
    private String promptCommand;

    public MapMenuView() {
        this.menu = "\n"
                + "\n\t ---------------------------------"
                + "\n\t | Map Menu                     |"
                + "\n\t ---------------------------------"
                + "\n\t M - Full Map View"
                + "\n\t D - Distance to next town, fort, or checkpoint"
                + "\n\t E - Distance to final destination"
                + "\n\t T - Distance Traveled "
                + "\n\t P - Return to previous menu"
                + "\n\t ---------------------------------";

    }

    public void displayMapMenuView() {

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
        String value = "M";
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
            case "M":
                this.displayFullMapView();
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
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;
    }

    private void displayFullMapView() {
        System.out.println("\n*** displayMapView stub function called ***");

        FullMapView fullMapView = new FullMapView();
        fullMapView.displayFullMapMenu();
    }

    private void displayDistanceNext() {
        System.out.println("\n*** Distance to next town is: ***");

        
    }

    private void displayDistanceFinal() {
        System.out.println("\n*** Distance to finish ***");

    }

    private void displayDistanceTraveled() {
        System.out.println("\n*** Distance Travel ***");

    }

}

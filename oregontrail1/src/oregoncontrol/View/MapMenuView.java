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

                GameMenuView gameMenu = new GameMenuView();
                gameMenu.displayMenu();

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
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(OregonTrail1.getPlayer());

        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void displayMapView() {
        System.out.println("\n*** displayMapView stub function called ***");

        GameMenuView mapMenu = new GameMenuView();
        mapMenu.displayMapMenu();
    }

    private void displayDistanceNext() {
        System.out.println("\n*** displayDistanceNext stub function called ***");

        GameMenuView mapMenu = new GameMenuView();
        mapMenu.displayMapMenu();
    }

    private void displayDistanceFinal() {
        System.out.println("\n*** displayDistanceFinal stub function called ***");

        GameMenuView mapMenu = new GameMenuView();
        mapMenu.displayMapMenu();
    }

    private void displayDistanceTraveled() {
        System.out.println("\n*** displayDistanceTraveled stub function called "
                + "***");

        GameMenuView mapMenu = new GameMenuView();
        mapMenu.displayMapMenu();
    }

}

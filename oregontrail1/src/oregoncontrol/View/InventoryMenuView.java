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
 * @author Kyle Jones
 */
public class InventoryMenuView 
{
 private String menu;
    private String promptCommand;

    /*
     * We are leaving the commands for the Main Menu commands 
     * the same as the instructions for ease of use.
     */
    public InventoryMenuView() {
        this.menu = "\n"
                + "\n------------------------------"
                + "\n| Inventory Menu             |"
                + "\n------------------------------"
                + "\nL - List of Items"
                + "\nF - Amount of Food"
                + "\nM - Buy from Store"
                + "\nT - Trade"
                + "\nQ - Quit"
                + "\n------------------------------";

    }

    public void displayInventoryMenuView() {

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

        String value = "N";
        boolean valid = false;

        while (!valid) {
            this.console.println("\n" + this.promptCommand);

            value = this.keyboard.readLine();
            value = value.trim();

            if (value.length() < 1) {
                ErrorView.display(this.getClass().getName(),
                                "\nInvalid value: value can not be blank");
                continue;
            }

            break;
        }

        return value;
    }

    private boolean doAction(String choice) {

        choice = choice.toUpperCase(); // lowercase will work for uppercase

        switch (choice) {
            case "L":
                this.listItems(); // Start New Game
                break;
            case "F":
                this.foodAmount(); // Load Game
                break;
            case "M":
                this.merchantStore(); // Help Menu
                break;
            case "T":
                this.trade(); // Help Menu
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                                "\nInvalid value: value can not be blank");
                break;
        }
        return false;
    }  

    private void listItems() 
    {
         this.console.println("\n*** listItems stub function called ***");
    }

    private void foodAmount() 
    {
        this.console.println("\n*** foodAmount stub function called ***");
    }

    private void merchantStore() 
    {
        this.console.println("\n*** merchantStore stub function called ***");
    }

    private void trade() 
    {
        this.console.println("\n*** trade stub function called ***");
    }
}

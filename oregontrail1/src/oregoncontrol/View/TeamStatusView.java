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
public class TeamStatusView 
{
    private String menu;
    private String promptCommand;

    public TeamStatusView() {
        this.menu = "\n"
                + "\n------------------------------"
                + "\n| Team Status                |"
                + "\n------------------------------"
                + "\nH - Health"
                + "\nR - Rations"
                + "\nS - Rest"
                + "\nJ - Joy"
                + "\nQ - Quit"
                + "\n------------------------------";

    }

    public void displayTeamStatusView() {

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

        Scanner keyboard = new Scanner(System.in);
        String value = "N";
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

        choice = choice.toUpperCase(); // lowercase will work for uppercase

        switch (choice) {
            case "H":
                this.health(); // Start New Game
                break;
            case "R":
                this.rations(); // Load Game
                break;
            case "S":
                this.sleep(); // Help Menu
                break;
            case "J":
                this.joy(); // Help Menu
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;
    }  

    private void health() 
    {
        System.out.println("\n*** health stub function called ***");
    }

    private void rations() 
    {
        System.out.println("\n*** rations stub function called ***");
    }

    private void sleep() 
    {
        System.out.println("\n*** sleep stub function called ***");
    }

    private void joy() 
    {
        System.out.println("\n*** joy stub function called ***");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregoncontrol.View;

import oregontrail.control.GameControl;
import oregontrail1.OregonTrail1;

/**
 *
 * @author parhe
 */
public class DailyTrailStopSceneView extends View {
    
        public DailyTrailStopSceneView() {
         
          super("\n"
                + "\n------------------------------"
                + "\n| Daily Trail Stop           |"
                + "\n------------------------------"
                + "\nT - Visit the town            "
                + "\nF - Visit the fort            "
                + "\nR - Cross the river           "
                + "\nS - Rest                      "
                + "\nH - Go hunting                "
                + "\nP - Look for edible plants    "
                + "\nM - Return to game            "
                + "\n------------------------------"
            );

    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); // lowercase will work for uppercase

        switch (choice) {
            case "T":
                this.visitTown(); // Start New Game
                break;
            case "F":
                this.visitFort(); // Load Game
                break;
            case "R":
                this.crossRiver(); // Help Menu
                break;
            case "S":
                this.restTime(); // map menu
                break;
            case "H":
                this.goHunting(); // Save Game
                break;
            case "P":
                this.lookForPlants(); // Save Game
                break;
            case "M":
                this.returntoGameMenuView(); // Save Game
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                                "\nInvalid value: value can not be blank");
                break;
        }
        return false;
    }

    private void visitTown() {
        this.console.println("\n*** visit town stub function called ***");
    }

    private void visitFort() {
        this.console.println("\n*** visit fort stub function called ***");
    }

    private void crossRiver() {
        this.console.println("\n*** cross river stub function called ***");
    }

    private void restTime() {
        this.console.println("\n*** rest for a day stub function called ***");
    }

    private void goHunting() {
        this.console.println("\n*** go hunting stub function called ***");
    }

    private void lookForPlants() {
        this.console.println("\n*** look for plants stub function called ***");
    }

    private void returntoGameMenuView() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }
}




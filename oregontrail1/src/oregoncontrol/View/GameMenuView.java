/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregoncontrol.View;

import java.util.Scanner;

/**
 *
 * @author Darrin
 */

public class GameMenuView extends View {
   
    
    public GameMenuView() {
          super("\n"
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
                + "\n\t N - Player Menu /new/edit/delete/reset/            "  
                + "\n\t M - View The Map                                   "
                + "\n\t H - Help Menu                                      "
                + "\n\t R - Return To Main Menu                            "
                + "\n\t ***************************************************"
        );
        
    }
    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "T":
                this.viewTeamStatus();
                break;
            case "S":
                this.viewTeamSupplies();
                break;
            case "P":
                this.setTeamPace();
                break;
            case "A":
                this.sceneMenu();
                break;
            case "N":
                this.playerMenu();
                break;
            case "M":
                this.viewMap();
                break;
            case "H":
                this.helpMenu();
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

    private void viewTeamStatus() {
        
        TeamStatusView teamStatusView = new TeamStatusView();
        
        teamStatusView.displayTeamStatusView();
    }

    private void viewTeamSupplies() {
        this.console.println("\n*** Team Status Called");
    }

    private void setTeamPace() {
        TeamPaceView teamPaceView = new TeamPaceView();
        
        teamPaceView.display();
    }

    private void sceneMenu() {
        this.console.println("\n*** Scene Menu Called");
    }

    private void viewMap() {
        MapMenuView mapMenuView = new MapMenuView();
        mapMenuView.display();
    }

    private void helpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        
        helpMenuView.display();
    }

    private void returnToMainMenu() {
        MainMenuView mainMenuView = new MainMenuView();
	mainMenuView.display();
    }

    void displayGameMenuView() {
       this.console.println("\n game menu view stub");
    }

    private void playerMenu() {
        PlayerMenuView playerMenuView = new PlayerMenuView();        
        playerMenuView.display();
    }

}


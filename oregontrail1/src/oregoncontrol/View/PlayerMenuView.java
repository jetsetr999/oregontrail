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
 * @author Darrin
 */
public class PlayerMenuView extends View{
    
    
        public PlayerMenuView() {
         
          super("\n"
                + "\n\t ******************************"
                + "\n\t | Player Options             |"
                + "\n\t ******************************"
                + "\n\t N - New Player                "
                + "\n\t E - Edit Player               "
                + "\n\t D - Delete Player             "
                + "\n\t A - Reset All Players         "
                + "\n\t R - Return to Game Menu   "
                + "\n\t ******************************"
            );

    }

    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); // lowercase will work for uppercase

        switch (choice) {
            case "N":
                this.newPlayer(); // New player
                break;
            case "E":
                this.editPlayer(); // Edit player
                break;
            case "D":
                this.deletePlayer(); // Delete Player
                break;
            case "A":
                this.resetAllPlayers(); // Reset all players
                break;
            case "R":
                this.returntoGameMenuView(); // Return to previous menu
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                break;
        }
        return false;
    }

    private void newPlayer() {
        System.out.println("\n*** new player stub function called ***");
    }

    private void editPlayer() {
        System.out.println("\n*** edit player stub function called ***");
    }

    private void deletePlayer() {
        System.out.println("\n*** delete player stub function called ***");
    }

    private void resetAllPlayers() {
        System.out.println("\n*** reset all players stub function called ***");
    }

    private void returntoGameMenuView() {
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();
    }
}
    

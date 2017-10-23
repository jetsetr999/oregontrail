/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregoncontrol.View;

/**
 *
 * @author Darrin
 */
public class StartProgramView {

    // Banner Darrin
    private String promptMessage;

    public StartProgramView() {

        this.promptMessage = "\nPlease enter your name: ";

        // display banner
        this.displayBanner();

        // player name - Brandon
        // control function to create player object - Kyle
        // welcome message - main menu Darrin
    }

    private void displayBanner() {
        {

            System.out.println(
                      "\n******************************************************"
                    + "\n                                                      "
                    + "\n This is a text based game of strategy and chance.    "
                    + "\n In this game you will help the pioneers reach the    "
                    + "\n Squaw valley before the first snowfall.  You and your"
                    + "\n family will need to strategize and decide how much   "
                    + "\n food and supplies are needed for the journey at hand."
                    + "\n Hunting supplies would be very helpful in assisting  "
                    + "\n with food needs.  There are many stops and           "
                    + "\n unnexpected events along the way.  Animals and a     "
                    + "\n wagon will be part of your needed supplies.          "
                    + "\n                                                      "
                    + "\n Good luck and enjoy the ride.                        "
                    + "\n                                                      "
                    + "\n******************************************************"
            );

        }
    }

}

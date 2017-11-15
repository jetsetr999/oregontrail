/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;

import firstpackagejpp.Player;
import oregontrail1.Game;
import oregontrail1.OregonTrail1;

/**
 *
 * @author Kyle Jones
 */
public class GameControl {

    public static int createNewGame(Player player) {

       // create a new game
        int returnValue = GameControl.createNewGame(OregonTrail1.getPlayer());
        if (returnValue < 0){
            System.out.println("Error - Failed to create new game");
        }
        
        if (player == null) {
            return -1;
        }

        Game game = new Game();
        
        
    
        //    MainMenuView mainMenuView = new MainMenuView();
        //  mainMenuView.display();

    public static Player createPlayer(String name) {

        if (name == null) {
            return null;
        }

        Player player = new Player();
        player.setName(name);

        OregonTrail1.setPlayer(player);

        return player;
    }

    game.setPlayer (player);

    OregonTrail1.currentGame (game);
   
}
/* public static int createNewGame(Player player) {  
if (player == null)  
 return -1 
game = create a new Game object 
Save a reference to the Player object in the game 
Save a reference to the game in the main class
actors = createActors() 
Save the list of actors in the Game object 
Assign an actor to the player 
items = createItems() 
Save the list of items in the game 
map = createMap(noOfRows, noOfColumns) 
IF map == null THEN    
RETURN -1 
ENDIF 
Assign the map to the game 
RETURN 1 // indicates success } */


}

    public static Actor[] createActors() {

    
}

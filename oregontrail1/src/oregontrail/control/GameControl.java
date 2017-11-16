/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;

import firstpackagejpp.InventoryItem;
import firstpackagejpp.Map;
import firstpackagejpp.Player;
import oregontrail1.Game;
import oregontrail1.OregonTrail1;

/**
 *
 * @author Kyle Jones
 */
public class GameControl {

    public static Player createPlayer(String name) {

        if (name == null) {
            return null;
        }

        Player player = new Player();
        player.setName(name);

        OregonTrail1.setPlayer(player);

        return player;
    
}
    
    public static int createNewGame(Player player) {
        if (player == null) {
            return -1;
        }

       Game game = new Game();       // create a new game object
       game.setPlayer(player);       // Save a reference to the player object in the game 
       OregonTrail1.setCurrentGame(game);        // save a reference to the game in the main class

       // Actors[] actors = ActorControl.createActors();        // create actors
       // game.setActors(game);        // save the list of actors in the game object

       
       InventoryItem[] items = GameControl.createItems();
       game.setInventory(items);
       
       int noOfColumns = 10;
       int noOfRows = 10;
       Map map = MapControl.createMap(noOfColumns, noOfRows);
       game.setMap(map);
       
       if (map == null) {
           return -1;
       }
       else {
           game.setMap(map);
           return 1;
       }
    }
    
    public static InventoryItem[] createItems() {
        System.out.println("\n*** create items stub function called ***");     
        return null;
    }
    
    public static Map createMap(int noOfRows, int noOfColumns) {
        System.out.println("\n*** create map stub function called ***");         
        return null;
    }

    
    
}

    

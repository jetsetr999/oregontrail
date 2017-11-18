/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;

import firstpackagejpp.InventoryItem;
import firstpackagejpp.Player;
import firstpackagejpp.WeatherEvent;
import java.io.Serializable;
import firstpackagejpp.Game;
import firstpackagejpp.Map;
import oregontrail1.OregonTrail1;

/**
 *
 * @author Kyle Jones
 */
public class GameControl implements Serializable {

    public static Player createPlayer(String playersName) {
        
        if (playersName == null) {
            return null;
        }
        Player player = new Player();
        player.setName(playersName);
        return player;
    }

    //game = create a new Game object 
    public static Game createNewGame(Game game) {
        return game;
    }

    //Save a reference to the Player object in the game 
    public static Game setPlayer(Game game) {
        return game;
    }

    //Save a reference to the game in the main class
    public static Game setGame(Game game) {
        return null;

    }

    public static WeatherEvent createWeatherChoice(String weatherChoice) {
        System.out.println("weather stub");
        return null;
    }

    private static Game Game() {
        System.out.println(" game stub ");
        return null;
    }

}/*
public static int createNewGame(Player player) {
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
RETURN 1 // indicates success
}*/

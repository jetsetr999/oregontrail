/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;

import firstpackagejpp.Player;
import firstpackagejpp.WeatherEvent;
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

    public static void createNewGame(Player player) {
        
        if (player == null)
            return -1;
        
        public static 
                    
  /*    game = create a new Game object
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
    RETURN 1 // indicates success*/
}
    }

    public static WeatherEvent createWeatherChoice(String weatherChoice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

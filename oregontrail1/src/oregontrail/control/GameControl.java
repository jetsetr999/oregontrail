/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;

import firstpackagejpp.Actor;
import firstpackagejpp.InventoryItem;
import firstpackagejpp.Player;
import firstpackagejpp.WeatherEvent;
import java.io.Serializable;
import firstpackagejpp.Game;
import firstpackagejpp.Map;
import java.util.ArrayList;
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

    // actors = createActors()
    public static Actor createActor(Actor hero) {
        return hero;
    }
    
    // Item array created
    public static InventoryItem[] createItems(){
        System.out.println(" Item Array stub in Game Control");
        return null;
        
    }
    public ArrayList<Actor> addActor() {

        // create ArrayList for Actors
        ArrayList<Actor> hero = new ArrayList<>();
        
        return hero;

    }
    // Save the list of actors in the Game object
    public void Actor(ArrayList<Actor> actorHero){
        // create list of actors
        for(int i=0; i< actorHero.size(); i++){
        
            Actor hero = actorHero.get(i);
            System.out.println("\n\t Actor: " + hero.getHero() +
                               "\n\t Quantity: "+ hero.getQantityOnHand());
        }
        
    }
      
}
/*




items = createItems()
Save the list of items in the game
map = createMap(noOfRows, noOfColumns)
IF map == null THEN
 RETURN -1
ENDIF
Assign the map to the game
RETURN 1 // indicates success
}*/

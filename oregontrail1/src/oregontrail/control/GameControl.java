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
    
    public static void saveGame(Game game, String filepath)
            throws GameControlException {
        
        try( FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game);
        } catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }
    
    public static void getSavedGame(String filepath)
            throws GameControlException {
        
        Game game = null; 
        
        try( FileInputStream fips = new FileInputStream(filepath)) {
            ObjectIntputStream output = new ObjectIntputStream(fips);
            
            game = (Game) input.readObject();
            
        } catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
        
        OregonTrail1.setCurrentGame(game);
    }

    public static WeatherEvent createWeatherChoice(String weatherChoice) {
        this.console.println("weather stub");
        return null;
    }

    private static Game Game() {
        this.console.println(" game stub ");
        return null;
    }

    // actors = createActors()
    public static Actor createActor(Actor hero) {
        return hero;
    }
    
    // Item array created
    public static InventoryItem[] createItems(){
        this.console.println(" Item Array stub in Game Control");
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
            this.console.println("\n\t Actor: " + hero.getHero() +
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

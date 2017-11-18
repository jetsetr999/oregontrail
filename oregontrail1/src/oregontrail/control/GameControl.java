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

        Player player = new Player();
        player.setName(playersName);
        return player;
    }
    //game = create a new Game object 
    public static Game createNewGame(Game game) {
        return game;
    }
    
    //Save a reference to the Player object in the game 
    public static Game setPlayer(Game game){
       return game;
    }
    
    //Save a reference to the game in the main class
   public static Game setGame(Game game){
        return null;
       
    }

    //actors = createActors()
   
   
    //Save the list of actors in the Game object 
    //Assign an actor to the player 
    //items = createItems() 
   // public static IventoryItem createItem(Item item) {
   //     return item;
   // }
   
    //Save the list of items in the game 
    //map = createMap(noOfRows, noOfColumns) 
    //IF map == null THEN    
    //RETURN -1 
    //ENDIF 
    //Assign the map to the game 
    //RETURN 1 // indicates success } */
        /*  
        
        // int returnValue = GameControl.createNewGame(OregonTrail1.getPlayer());
        //if (returnValue < 0) {
            System.out.println("Error - Failed to create new game");
            return 0;
        }*/
    public static WeatherEvent createWeatherChoice(String weatherChoice) {
        System.out.println("weather stub");
        return null;
    }
        /*if (player == null) {
            return -1;
        }
        Map map = new Map();
        Game game = new Game();
        return 0;
    }

    public static InventoryItem[] createItems() {
        InventoryItem[] InventoryItem = null;
        return InventoryItem;
    }*/

    private static Game Game() {
        System.out.println(" game stub ");
        return null;
    }

   

    }

//    MainMenuView mainMenuView = new MainMenuView();
//  mainMenuView.display();
/*public static Player createPlayer(String name) {

        if (name == null) {
            return null;
        }

        Player player = new Player();
        player.setName(name);

        OregonTrail1.setPlayer(player);

        return player;
<<<<<<< HEAD
    }

    game.setPlayer (player);

    OregonTrail1.currentGame (game);
   
}*/
 /* public static int createNewGame(Player player) {  
if (player == null)  
 return -1 

 /*  public static Actor[] createActors() {*/
 /*public static int createNewGame(Player player) {
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
    */



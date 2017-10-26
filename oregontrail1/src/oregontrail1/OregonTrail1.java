/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail1;
import firstpackagejpp.Actor;
import firstpackagejpp.AttackEvent;
import firstpackagejpp.Event;
import firstpackagejpp.HealthEvent;
import firstpackagejpp.Map;
import firstpackagejpp.Player;
import firstpackagejpp.InventoryItem;
import firstpackagejpp.RegularScene;
import firstpackagejpp.TheftEvent;
import firstpackagejpp.WeatherEvent;
import firstpackagejpp.FortScene;
import firstpackagejpp.TownScene;
import firstpackagejpp.RiverCrossingScene;
import firstpackagejpp.TrailStopScene;
import oregoncontrol.View.StartProgramView;
/**
 *
 * @author parhe
 */
public class OregonTrail1 {
    
    private static Game currentGame = null;
    private static Player player = null;

    public static void main(String[] args) 
    {
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
            
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        OregonTrail1.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        OregonTrail1.player = player;
    }
    
    
}

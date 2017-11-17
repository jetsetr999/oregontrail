/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail1;

import firstpackagejpp.Game;
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
import oregontrail1.OregonTrail1.game;

/**
 *
 * @author parhe
 */
public class OregonTrail1 {

    private static Game currentGame = null;
    private static Player player = null;
    private static Map map = null;

    public static void main(String[] args) {

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

    public static Map getMap() {
        return map;
    }
    public static InventoryItem getItem(InventoryItem item){
        return item;
    }

    public static Game getGame() {
        System.out.println(" get game stub ");
        return null;
    }
   public static class setPlayer {

        public setPlayer() {
        }
    }

    public static class game {

        public game() {
        }
    }

    public static class getGame {

        public getGame() {
        }
    }
    
}

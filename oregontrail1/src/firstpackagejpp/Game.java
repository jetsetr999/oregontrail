/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpackagejpp;

import firstpackagejpp.InventoryItem;
import firstpackagejpp.Map;
import firstpackagejpp.Player;

/**
 *
 * @author Darrin
 */
public class Game {

    private Player player;

    public void setCompanion1(String string) {
        this.console.println("\n*** set companion1 ***");
    }

    public void setInventory(InventoryItem[] items) {
        this.console.println("\n*** set inventory ***");
    }

    public void setMap(Map map) {
        this.console.println("\n*** set map ***");
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    public Game setGame(Game game){
        return game;
    }
}

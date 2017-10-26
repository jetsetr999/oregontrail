/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;

import firstpackagejpp.Player;
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
        System.out.println("\n*** createNewGame stub function called ***");
    }
}

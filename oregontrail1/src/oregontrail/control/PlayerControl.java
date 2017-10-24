/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;

import firstpackagejpp.Player;

/**
 *
 * @author Kyle Jones
 */
public class PlayerControl 
{
     public Player newPlayer(String name)
     {
         Player playerOne = new Player();
         playerOne.setName(name);
         return playerOne;
     }
     
        public PlayerControl() {
        }
}


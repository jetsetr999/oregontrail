/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail1;
import firstpackagejpp.Actor;
import firstpackagejpp.Player;
/**
 *
 * @author parhe
 */
public class Oregontrail1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flintstone");
        playerOne.setTime(7.00);
        
        String playerOneName = playerOne.getName();
        double playerOneTime = playerOne.getTime();
        
        System.out.println("Name = " + playerOneName + 
                           ", time = " + playerOneTime);
        
        Actor.Father.getName();
        Actor.Father.getDescription();
        
        System.out.println(Actor.Father.getName() + " " 
                         + Actor.Father.getDescription());
    }
    
}

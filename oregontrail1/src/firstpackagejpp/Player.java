/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpackagejpp;
import java.io.Serializable;
import java.util.ArrayList;
import oregontrail1.Game;
        
        
/**
 *
 * @author parhe
 */
public class Player implements Serializable {

    private String name;
    private double time;
    private ArrayList<Game> games = new ArrayList<>();
    
    public Player() {
      
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }

    public Player(String name, double time) {
        this.name = name;
        this.time = time;
    }


    
        
    
}

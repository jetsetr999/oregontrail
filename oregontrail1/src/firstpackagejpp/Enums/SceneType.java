/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpackagejpp.Enums;
import java.io.Serializable;

/**
 *
 * @author parhe
 */
public enum SceneType implements Serializable {
    
        Start("Scene1", "Start of game"),
        Independence("Scene2", "Independence"),
        Fort("Scene3", "Fort"),
        Hotel("Scene4", "Hotel"),
        Regular("Scene5", "Regular"),
        Resource("Scene6", "Resource"),
        RiverCrossing("Scene7", "River Crossing"),
        Town("Scene8", "Town"),
        TrailStop("Scene9", "Trail Stop"),
        Landmark("Scene10", "Land Mark"),
        Mountain("Scene11", "Mountain"),
        Shop("Scene12", "Shop"),
        Trail("Scene13", "Trail"),
        Wagon("Scene14", "Wagon"),
        Death("Scene15", "Death"),
        Supplies("Scene16", "Supplies"),
        Questions("Scene17", "Questions"),
        End("Scene18", "End of game"),;
        
        
    private String scene;
    private String description;
    //private double travelTime;

    SceneType(String scene, String description){
        this.scene = scene;
        this.description = description;
        //this.travelTime = TravelTime;
          
    }

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /*public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }*/
    }




    

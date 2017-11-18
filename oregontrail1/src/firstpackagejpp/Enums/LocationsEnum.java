/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpackagejpp.Enums;
import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author parhe
 */
public enum LocationsEnum implements Serializable {
   
    Independence("Independence", "Town", 0),
    ChimneyRock("Chimney", "Landmark", 200),
    FortLaramie("Laramie", "Fort", 700),
    River1("River 1", "River", 700),
    IndependenceRock("Independence Rock", "Landmark", 1000),
    SodaSprings("Independence", "Landmark", 1250),
    FortHall("Fort Hall", "Fort", 1500),
    River2("River 2", "River", 1700),
    FortBoise("Fort Boise", "Fort", 2000),
    FortWallaWalla("Fort Walla Walla", "Fort", 2250),
    OregonCity("Oregon City", "Town", 2500),;
    
        private final String locationName;
        private final String locationType;
	private final double locationDistance;
        
    LocationsEnum(String locationName, String locationType, int locationDistance) { 
        
        this.locationName = locationName;
        this.locationType = locationType;
	this.locationDistance = locationDistance;
    }
        
        public String getLocationName() {
            return this.locationName;
        }

        public String getLocationType() {
            return this.locationType;
        }

        public double getLocationDistance(){
            return this.locationDistance;
        }
        
 }


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpackagejpp.Enums;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author parhe
 */
public enum ItemEnum implements Serializable {
    
        Medicine("1", "medicine pack", 1),
        Food("1 lb", "flour, sugar, bacon, and coffee", 1),
        Ammunition("1 box", "20 bullets", 2),
        Matches("5", "boxes matches", .25),
        Clothing("12 sets", "clothing", 5),
        Oxen("1", "oxen to pull wagon", 50),
        WagonTongue("1", "Wagon tongue", 30),
        WagonAxel("1", "spare wagon axle", 20),
        WagonWheel("1", "spare wagon wheel", 15),;

        private final String itemQty;
        private final String itemName;
	private final double itemWeight;
        
    ItemEnum(String itemQty, String itemName, double itemWeight) { 
        
        this.itemQty = itemQty;
        this.itemName = itemName;
	this.itemWeight = itemWeight;
    }
        
        public String getQty() {
            return this.itemQty;
        }

        public String getItemName() {
            return this.itemName;
        }

        public double getWeight(){
            return this.itemWeight;
        }
        
 }


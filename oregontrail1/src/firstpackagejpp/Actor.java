/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpackagejpp;
import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author Kyle Jones
 */
public enum Actor implements Serializable
{
    Banker("Banker", "He is in charge of money distribution", new Point(1, 1)),
    StoreKeeper("Store Keeper", "He will help with supplies.", new Point(0, 1)),
    Carpenter("Carpenter", "He has a higher change of reparing the wagon.", new Point(1, 2)),
    Doctor("Doctor", "He has a higher chance of healing members of the party", new Point(2, 3)),
    Farmer("Farmer", "Higher chance of finding and gathering food.", new Point(1, 2)),;
    
    private final String person;
    private final String description;
    private final Point coordinates;
    
    Actor(String name, String description, Point coordinates)
    {
        this.person = name;
        this.description = description;
        this.coordinates = coordinates;
    }

    public String getName() {
        return person;
    }

    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + person + ", description=" + description 
                + ", coordinates=" + coordinates + '}';
    }
    
    
}

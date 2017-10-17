/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail1;
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
/**
 *
 * @author parhe
 */
public class OregonTrail1 {

    /**
     * @param args the command line arguments
     * 
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
        
        //test map
        Map mapOne = new Map();
        
        mapOne.setRowCount(25);
        mapOne.setColumnCount(50);
        
        int mapOneRow = mapOne.getRowCount();
        int mapOneColumn = mapOne.getColumnCount();
        
        System.out.println(mapOneRow + " " + mapOneColumn);
        
        // test class for inventory items.
        InventoryItem wheel = new InventoryItem();
        
        wheel.setName("Wheel");
        wheel.setQuantityInStock(5);
        wheel.setPricePerUnit(10);
        
        
        String wheelName = wheel.getName();
        int wheelQuantity = wheel.getQuantityInStock();
        double wheelPrice = wheel.getPricePerUnit();
        
        System.out.println("We have " + wheelQuantity + " "+ wheelName 
                          + "s for sale at $" + wheelPrice + " apiece.");
        
        RegularScene deathStar = new RegularScene();
        
        deathStar.setName("Vader's Pad");
        deathStar.setDescription("This massive space station could be confused with a small moon.");
        deathStar.setDuration(10);
        
        String deathStarName = deathStar.getName();
        String deathStarDescription = deathStar.getDescription();
        double deathStarDuration = deathStar.getDuration();
        
        System.out.println("Here at " + deathStarName + ", we hope you'll enjoy the fact that "
                          + deathStarDescription + "  Your torture will not last longer than "
                          + deathStarDuration + " days.  Probably.");
        
        Event tornado = new Event();
        
        tornado.setName("Sharknado");
        tornado.setType("Weather event");
        tornado.setEffect("all the wild animals have run away.  No more hunting.");
        tornado.setCounter("You sacrifice a dolphin to the disaster and nothing bad happens.");
        tornado.setChanceOfOccurring(.05);
        
        String tornadoName = tornado.getName();
        String tornadoType = tornado.getType();
        String tornadoEffect = tornado.getEffect();
        String tornadoCounter = tornado.getCounter();
        double tornadoChance = tornado.getChanceOfOccurring();
        
        System.out.println("A " + tornadoName + tornadoType + " has occurred!  " 
                          + tornadoEffect + " Luckily, " 
                          + tornadoCounter + "  The chance of this happening is " 
                          + tornadoChance + "%.");
        
        AttackEvent lemurs = new AttackEvent();
        
        lemurs.setName("Lemurs");
        lemurs.setType("attacked.  ");
        lemurs.setDelay(6);
        lemurs.setEffect("Someone was injured and food was stolen.");
        lemurs.setDecreaseAmount(30);
        lemurs.setDecreaseHealth(15);
        
        String lemursName = lemurs.getName();
        String lemursType = lemurs.getType();
        int lemursDelay = lemurs.getDelay();
        String lemursEffect = lemurs.getEffect();
        int lemursTheft = lemurs.getDecreaseAmount();
        int lemursDamage = lemurs.getDecreaseHealth();
        
        System.out.println(lemursName + " have " + lemursType
                          + lemursEffect + "  This will set you back " 
                          + lemursDelay + " days, and " + Actor.Father.getName() 
                          + "was injured for " + lemursDamage + " points of damage and " 
                          + lemursTheft + " pounds of food were stolen.");
        
        TheftEvent raccoon = new TheftEvent();
        
        raccoon.setName("Trash Pandas");
        raccoon.setDecreaseAmount(40);
        
        String raccoonName = raccoon.getName();
        int raccoonTheft = raccoon.getDecreaseAmount();
        
        System.out.println(raccoonName + " have stolen " + raccoonTheft 
                          + " pounds of food.");
        
        
        HealthEvent flu = new HealthEvent();
        
        flu.setName("Flu");
        flu.setDecreaseHealth(90);
        
        String fluName = flu.getName();
        int fluDamage = flu.getDecreaseHealth();
        
        System.out.println(fluName + " has struck your party.  " + fluDamage 
                          + " points of damage have occurred.");
        
        WeatherEvent rainingMen = new WeatherEvent();
        
        rainingMen.setName("Raining Men");
        rainingMen.setDelay(5);
        rainingMen.setExtraDelay(3);
        
        String rainingMenName = rainingMen.getName();
        int rainingMenDelay = rainingMen.getDelay();
        int rainingMenExtraDelay = rainingMen.getDelay() + rainingMen.getExtraDelay();
        
        System.out.println("It's " + rainingMenName + ".  Who let this happen?"
                          + "  Normally this would delay you " + rainingMenDelay
                          + ", but the absurdity of this will take " 
                          + rainingMenExtraDelay + " days to get over.");
        
        /*
        FortScene
        
        
        FortScene crystalSkull = new FortScene();
        
        crystalSkull.setName("Crystal Skull");
        crystalSkull.setAmount(3);
        
        String crystalSkullName = crystalSkull.getName();
        int crystalSkullAmount = crystalSkull.getAmount();
        
        System.out.println(" This fort comes equipped with " 
                            + crystalSkullName + ".  They are very powerful and"
                            + " handy in a pinch.  " + crystalSkullAmount
                            + " " + crystalSkullName + " have been added to"
                            + " your supplies.");
       
        /* 
        TownScene
        
        TownScene golfClubs = new TownScene();
        
        golfClubs.setName("Callaway Clubs");
        golfClubs.setAmount(14);
        
        String golfClubsName = golfClubs.getName();
        int golfClubsAmount = golfClubs.getAmount();
        
        System.out.println(golfClubsName + " are essential to a persons"
                            + " survival. This is non-negotiable " + golfClubsAmount
                            + " " + golfClubsName + " have been added to"
                            + " your supplies.");
        
        /*
        RiverCrossingScene
        */
        
        /*
        TrailStopScene
        */
        
        
        
        
    }
    
}

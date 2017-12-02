/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail1;

import firstpackagejpp.Game;
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
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import oregoncontrol.View.StartProgramView;
import oregontrail1.OregonTrail1.game;

/**
 *
 * @author parhe
 */
public class OregonTrail1 {

    private static Game currentGame = null;
    private static Player player = null;
    private static Map map = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;

    public static void main(String[] args) {
        
        try {
        
            OregonTrail1.inFile = 
                    newBufferedReader(new InputStreamReader(System.in));
        
            OregonTrail1.outFile = new PrintWriter(System.out, true);
            
          
            String filePath = "C:\\Users\\Documents\\tmp\\logfile.txt";
            OregonTrail1.logFile = new PrinterWriter(filePath);
        

            StartProgramView startProgramView = new StartProgramView();
            startProgramView.displayStartProgramView();
        
        } catch (Throwable e) {
            
            System.out.println("Exception:" + e.toString() +
                               "\nCause" + e.getCause() +
                               "\nMessage" + e.getMessage());
            
            e.printStackTrace();;
        }
        
        finally {
            
            if (OregonTrail1.inFile != null)
                OregonTrail1.inFile.close();
            if (OregonTrail1.outFile != null)
                OregonTrail1.outFile.close();
            if (OregonTrail1.logFile != null)
                OregonTrail1.logFile.close();
        } 

    } 

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        OregonTrail1.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        OregonTrail1.player = player;
    }

    public static Map getMap() {
        return map;
    }
    public static InventoryItem getItem(InventoryItem item){
        return item;
    }

    public static Game getGame() {
        System.out.println(" create game stub OregonTrail1 ");
        return null;
    }

    private static BufferedReader newBufferedReader(InputStreamReader inputStreamReader) {
        System.out.println(" new buffered stub ");
        return null;
    }

    public static java.io.BufferedReader getInFile() {
        System.out.println(" get in stub ");
        return null;
    }

    public static java.io.PrintWriter getOutFile() {
        System.out.println(" get out ");
        return null;
    }
   public static class setPlayer {

        public setPlayer() {
        }
    }

    public static class game {

        public game() {
        }
    }

    public static class getGame {

        public getGame() {
        }
    }

    private static class PrintWriter {

        public PrintWriter() {
        }

        private PrintWriter(PrintStream out, boolean b) {
            System.out.println(" print writer stub ");
        }

        private void close() {
            System.out.println(" close stub ");
        }
    }

    private static class BufferedReader {

        public BufferedReader() {
        }

        private void close() {
            System.out.println(" close stub ");
        }
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        OregonTrail1.logFile = logFile;
    }

    private static class PrinterWriter extends PrintWriter {

        public PrinterWriter(String filePath) {
        }
    }
    
    
    
}

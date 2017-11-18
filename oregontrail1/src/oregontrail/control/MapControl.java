/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.control;

import firstpackagejpp.Map;
import javafx.scene.Scene;
import firstpackagejpp.Enums;

/**
 *
 * @author Kyle Jones
 */
public class MapControl {

    /*static Map createMap(int noOfColumns, int noOfRows) {
        System.out.println("\n*** create map ***");
        return null;
    }

    /*private void displayCreateMap() {
        System.out.println("\n*** Create map stub function called ***");
    }
}*/
    public static Map createMap(int noOfRows, int noOfColumns){
       Map map = null;
      return map; 
    }

    public static void createMap(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static Scene[] createScenes() {
        
        Scene[] scene = new Scene[16];

        Scene1 start = new Scene();
        fort.setDescription("Starting Scene");
        fort.setLocation(0);
        scene[SceneType.start.ordinal()] = start;
        
        Scene2 independence = new Scene();
        fort.setDescription("Independence Missouri");
        fort.setLocation(1);
        scenes[SceneType.independence.ordinal()] = independence;

        return scene; 
    }
}

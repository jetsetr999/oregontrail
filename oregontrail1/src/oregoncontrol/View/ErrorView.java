/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregoncontrol.View;

/**
 *
 * @author parhe
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = OregonTrail1.getOutFile();
    private static final PrintWriter logFile = OregonTrail1.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                          "---------------------------------"
                        + "\n- ERROR - " + errorMessage
                        + "\n-------------------------------");  
        
        logFile.println(className + " - " + errorMessage);
                           
    }
    
}

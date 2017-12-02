/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregoncontrol.View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import oregoncontrol.View.InterfaceView;
import oregontrail1.OregonTrail1;

/**
 *
 * @author parhe
 */
public abstract class View implements InterfaceView {
    
    private String displayMessage;
    
    protected final BufferedReader keyboard = OregonTrail1.getInFile();
    protected final PrintWriter console = OregonTrail1.getOutFile();
    
    public View() {   
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
        
        boolean done = false;
        do {
            
            String value = this.getInput();
            if (value.toUpperCase().equals("Q"))
                return;
            
            done = this.doAction(value);
        } while (!done);

    }
    
        @Override
        public String getInput() {
        
	String value = null;
	boolean valid = false; 
        
	while (!valid) {
            this.console.println("\n" + this.displayMessage);
		
            try {
                value = this.keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
            value = value.trim();
		
            if (value.length() < 1) {
                ErrorView.display(this.getClass().getName(),
                                "\nInvalid value: value can not be blank");
		continue;
		}
		
		break;
	}
	
	return value;
    }
    
}

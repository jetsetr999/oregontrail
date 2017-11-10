/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregoncontrol.View;

import java.util.Scanner;
import oregoncontrol.View.InterfaceView;

/**
 *
 * @author parhe
 */
public abstract class View implements InterfaceView {
    
    protected String displayMessage;
    
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
        
        Scanner keyboard = new Scanner(System.in);
	String value = null;
	boolean valid = false; 
        
	while (!valid) {
            System.out.println("\n" + this.displayMessage);
		
            value = keyboard.nextLine();
            value = value.trim();
		
            if (value.length() < 1) {
		System.out.println("\nInvalid value: value can not be blank");
		continue;
		}
		
		break;
	}
	
	return value;
    }
    
}

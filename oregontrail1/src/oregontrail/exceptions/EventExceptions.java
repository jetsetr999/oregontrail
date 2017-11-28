/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oregontrail.exceptions;

/**
 *
 * @author Dad
 */
public class EventExceptions extends Exception{

    public EventExceptions() {
    }

    public EventExceptions(String message) {
        super(message);
    }

    public EventExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public EventExceptions(Throwable cause) {
        super(cause);
    }

    public EventExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}

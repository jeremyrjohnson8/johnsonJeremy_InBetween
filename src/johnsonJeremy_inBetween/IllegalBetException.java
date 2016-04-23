/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnsonJeremy_inBetween;

/**
 * Title: Illegal Bet Exception 
 * Description: The class for catching illegal bet errors. 
 * Author: Jeremy Johnson 
 */
public class IllegalBetException extends Exception {

    
    
    public IllegalBetException() {
    }

    /**
     * Default constructor for illegalbetexception object
     * @param msg 
     */
    public IllegalBetException(String msg) {
        super(msg);
    }
}

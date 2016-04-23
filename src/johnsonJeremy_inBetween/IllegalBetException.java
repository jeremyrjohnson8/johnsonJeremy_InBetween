
package johnsonJeremy_inBetween;

/**
 * Title: Illegal Bet Exception 
 * Description: The class for catching illegal bet errors. 
 * Author: Jeremy Johnson 
 */
public class IllegalBetException extends Exception {

    
    /**
     * IllegalBetException default constructor
     */
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

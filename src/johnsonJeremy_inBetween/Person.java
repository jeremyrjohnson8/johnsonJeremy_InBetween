
package johnsonJeremy_inBetween;

import java.util.Scanner;

/**
 * Title: Person 
 * Description: This is the class that puts together the Player object
 * @author jeremyjohnson
 */
public class Person {
    
    /**
     * Variables for Person Object
     */
    private int playerChips; 
    private String playerName;   
    private int bet;
    private boolean activePlayer = true; 
    private int count; 
    Scanner stdin = new Scanner(System.in); 
    
    /**
     * getPlayerChips    method for returning the playerChips variable
     * @return 
     */
    public int getPlayerChips() {
        return playerChips;
    }
    
    /**
     * setPlayerChips   Setter for playerChips variable
     * @param playerChips 
     */
    public void setPlayerChips(int playerChips) {
        this.playerChips = playerChips;
    }
    
    /**
     * getPlayerName    Method for returning the playerName variable
     * @return 
     */
    public String getPlayerName() {
        return playerName;
    }
    
    /**
     * setPlayerName    Setter method for playerName
     * @param playerName 
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    
    /**
     * getBet       Method for returning the variable field bet
     * @return 
     */
    public int getBet() {
        try {
            System.out.println("Place your bet");
            bet = stdin.nextInt();
            betCheck(bet, playerChips);
        } catch (IllegalBetException e){
            System.out.println(e.getMessage());   
        } catch (Exception e){
            
        }
        return bet;
    }
    
    /**
     * setBet   Setter method for bet
     * @param bet 
     */
    public void setBet(int bet) {
        this.bet = bet;
    }
    
    /**
     * isActivePlayer   Method for determining if a player is currently active
     *                  returns value of either true or false
     * @return 
     */
    public boolean isActivePlayer() {
        if(playerChips <= 0)
            activePlayer = false; 
        return activePlayer;
    }
    
    /**
     * setActive    Setter method for the activePlayer variable
     * @param activePlayer 
     */
    public void setActivePlayer(boolean activePlayer) {
        this.activePlayer = activePlayer;
    }
    
    /**
     * Person   default person object constructor 
     */
    public Person(){
        
    }
    
    /**
     * Person   Person constructor taking in parameters of chips and name, chips
     *          will serve as a buyin amount for a newly created player object
     * @param chips
     * @param name 
     */
    public Person(int chips, String name){
        this.playerChips = chips; 
        this.playerName = name; 
        count++;
    }
    
    /**
     * settlerUp    Method will return a players current chip pile after the 
     *              hand is over. In the house method, bet will be passed to 
     *              this method as either a positive or negative number, based 
     *              on the outcome of the hand. 
     * @return 
     */ 
    public int settleUp(int bet){
        playerChips = playerChips + bet; 
        return playerChips; 
    }
    /**
     * toString     Method that displays the various fields of Person object as 
     *              a string. 
     * @return 
     */
    @Override
    public String toString() {
        return "Person{" + "playerChips=" + playerChips + ", playerName=" + 
                playerName + ", bet=" + bet + ", activePlayer=" + activePlayer 
                + '}';
    }
    /**
     * activePlayer Returns a count of current active players. 
     * @param count
     * @return 
     */
    public int activePlayers(int count){
        return count; 
    }
    
    
    /**
     * comparesTo   Method compares chip piles of two players to determine a 
     *              leader board. 
     * @param playerChips
     * @param playerChips1
     * @return 
     */
    public boolean comparesTo(int playerChips, int playerChips1){
         
        if (playerChips > playerChips1){
            return true;
        }
        else 
            return false; 
    }
    
    /**
     * betCheck method throws the illegalBetException by checking the placed bet
     * against the current player pot.
     * @param bet
     * @param playerChips
     * @throws IllegalBetException 
     */
    public void betCheck(int bet, int playerChips) throws 
            IllegalBetException{
        if (bet > playerChips){
            IllegalBetException e = new IllegalBetException("Your bet has "
                    + "exceeded the amount of chips you currently hold");
            throw e;
        }
    } 
}
 


package johnsonJeremy_inBetween;

import java.util.Scanner;

/**
 * Title: Person 
 * Description: This is the class that puts together the Player object
 * @author jeremyjohnson
 */
public class Person {
    
  
    private int playerChips; 
    private String playerName;   
    private int bet;
    private boolean activePlayer = true; 
    private int count; 
    Scanner stdin = new Scanner(System.in); 
    
    // Get Method for int player chips
    public int getPlayerChips() {
        return playerChips;
    }
    
    // Setter for player chips
    public void setPlayerChips(int playerChips) {
        this.playerChips = playerChips;
    }
    
    // Get method fof Player Name
    public String getPlayerName() {
        return playerName;
    }
    
    // Setter for player name
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    
    // Get method for player bet
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
    
    // setter for player bet
    public void setBet(int bet) {
        this.bet = bet;
    }
    
    // getter for boolean to indicate whether player is active in game 
    public boolean isActivePlayer() {
        if(playerChips <= 0)
            activePlayer = false; 
        return activePlayer;
    }
    
    // setter for active player
    public void setActivePlayer(boolean activePlayer) {
        this.activePlayer = activePlayer;
    }
    
    // Default constructor
    public Person(){
        
    }
    
    // Constructor with buyin and Name
    public Person(int chips, String name){
        this.playerChips = chips; 
        this.playerName = name; 
        count++;
    }
    
    /**
     * Method will return a players current chip pile after the hand is over.
     * @return 
     */ 
    public int settleUp(int bet){
        playerChips = playerChips + bet; 
        return playerChips; 
    }
    /**
     * String method that displays the various fields of Person object as a 
     * string. 
     * @return 
     */
    @Override
    public String toString() {
        return "Person{" + "playerChips=" + playerChips + ", playerName=" + 
                playerName + ", bet=" + bet + ", activePlayer=" + activePlayer 
                + '}';
    }
    /**
     * REturns a count of current active players. 
     * @param count
     * @return 
     */
    public int activePlayers(int count){
        return count; 
    }
    
    
    /**
     * Method compares chip piles of two players to determine a leaderboard. 
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
 

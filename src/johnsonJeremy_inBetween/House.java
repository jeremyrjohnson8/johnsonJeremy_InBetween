
package johnsonJeremy_inBetween;
import java.util.Scanner; 
/**
 * Title: House Class 
 * Description: This will hold everything for the game - Driver class 
 * initializes this class to start and move the game 
 * Author: Jeremy Johnson 
 */
public class House {
    
    /**
     * REMEMBER: IF CARDS ARE EQUAL TO EACH OTHER, PLAYER LOSES DOUBLE THEIR BET
     * DON'T FORGET. THEY CAN ONLY BET HALF THE BANKROLL THEY HAVE, 
     */
    
    private int totalPot; 
    private Deck deck = new Deck();
    
    /**
     * Getter for the game deck
     * @return 
     */
    public Deck getDeck() {
        return deck;
    }
    
    /**
     * Setter for the game deck
     * @param deck 
     */
    public void setDeck(Deck deck) {
        this.deck = deck;
    }
    
    /**
     * Getter for TotalPot
     * @return 
     */
    public int getTotalPot() {
        
        return totalPot;
    }
    
    /**
     * Setter for TotalPot
     * @param totalPot 
     */
    public void setTotalPot(int totalPot) {
        this.totalPot = totalPot;
    }
    
    /**
     * PlayHand method runs all the sets for playing one hand. It will draw two
     * cards, get a player's bet, then draw a third card. 
     * @param player 
     */
  /**  
    public void playHand (Person player){
        int bet;
        Card card1 = deck.drawCard();
        Card card2 = deck.drawCard();
        System.out.println(card1.toString() + " " + card1.getCardValue() + " " 
                + card2.toString() + " " + card2.getCardValue());
        
        
        while (card1 == card2){
          //  card2 = deck.drawCard(); 
        }
        bet = player.getBet();
        /**
        Card card3 = deck.drawCard();
        System.out.println(card3.toString() + "  "  + card3.getCardValue());
        
        if (card3.getCardValue() < card2.getCardValue() && card3.getCardValue()
                > card1.getCardValue() || card3.getCardValue() > 
                card2.getCardValue() && card3.getCardValue() 
                < card1.getCardValue() ){
            player.settleUp(bet); 
        } else if (card3.getCardValue() == card2.getCardValue() || 
                card3.getCardValue() == card1.getCardValue()){
            bet = bet*-2; 
             player.settleUp(bet);
        } else
            bet = bet*-1; 
            player.settleUp(bet);
    }
    
    //Default constructor for House Object 
    public House() {
        
    }
}

}
* */
    }

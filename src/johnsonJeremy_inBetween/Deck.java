
package johnsonJeremy_inBetween;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author jeremyjohnson
 */
public class Deck {
    
    /**
     * Variables for Deck Class
     */
    private Card cards = new Card();
    private final int DECKLENGTH = 52; 
    LinkedList<Card> deck = new LinkedList();
    private final int indexer = 13; 
    

    /**
     * getCards Method used when the program needs to return a card
     * @return 
     */
    
    public Card getCards() {
        return cards;
    }
    /**
     * Setter   Method used for setting the card variable 
     * @param cards 
     */
    public void setCards(Card cards) {
        this.cards = cards;
    }
    
    /**
     * getDeck  Method used when program needs to return a deck object
     * @return 
     */
    public LinkedList<Card> getDeck() {
        return deck;
    }
    
    /**
     * Setter Method for 
     * @param deck 
     */
    public void setDeck(LinkedList<Card> deck) {
        this.deck = deck;
    }
    /**
     * toString Method for printing out the card values for every card in the 
     *          deck. 
     * @return 
     */
    @Override
    public String toString() {
        return "Deck{" + "deck=" + deck + '}';
    }

    /**
     * Deck()   Method is the default constructor for a deck. Builds all four 
     *          suits for 2-A (ace being high). At the end of the deck's 
     *          construction, it is passed to the shuffle deck method, to 
     *          shuffleDeck method to shuffle contents
     */
    public Deck() {

        for (int i =0 ; i < 13; i++){
            deck.add(new Card(i+2, "Spades"));  
        }
        
        for (int i =0 ; i < 13; i++){
            deck.add(new Card(i+2, "Hearts"));  
        } 
        
        for (int i =0 ; i < 13; i++){
           deck.add(new Card(i+2, "Diamonds")); 
        } 
        
        for (int i =0 ; i < 13; i++){
            deck.add(new Card(i+2, "Clubs"));         
        } 
        shuffleDeck(deck); 
    }
    /**
     * drawCard Method removes the top deck of the card. If the deck is empty 
     *          it constructs a new (shuffled) deck, and draws the top card
     * @return 
     */
    public Card drawCard(){
        if (deck.isEmpty() != true){
            Card card1 = deck.removeFirst();
            return card1; 
        } 
        else 
           refillDeck(deck);
           Card card1 = deck.removeFirst();
        return card1;
        
    }

    /**
     * shuffleDeck Method uses a built in method
     * @param deck 
     */
    static void shuffleDeck(LinkedList<Card> deck){ 
        Collections.shuffle(deck);
    }
    
    /**
     * refillDeck   Method for when the deck is empty, refills using the same 
     *              method as in the constructor
     * @param deck 
     */
    static void refillDeck(LinkedList<Card> deck){
        for (int i =0 ; i < 13; i++){
            deck.add(new Card(i+2, "Spades"));  
        }
        
        for (int i =0 ; i < 13; i++){
            deck.add(new Card(i+2, "Hearts"));  
        } 
        
        for (int i =0 ; i < 13; i++){
           deck.add(new Card(i+2, "Diamonds")); 
        } 
        
        for (int i =0 ; i < 13; i++){
            deck.add(new Card(i+2, "Clubs"));         
        } 
        shuffleDeck(deck);
    }
}   
    



/**
 * 
 * linkedList<Card> deck = new LinkedList<Card>();
 */
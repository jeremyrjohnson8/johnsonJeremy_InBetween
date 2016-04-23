
package johnsonJeremy_inBetween;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author jeremyjohnson
 */
public class Deck {
    // varaibles
    private Card cards = new Card();
    private final int DECKLENGTH = 52; 
    LinkedList<Card> deck = new LinkedList();
   // private Card deck[] = new Card[DECKLENGTH];
    private final int indexer = 13; 
    

    // getter for Cards
    public Card getCards() {
        return cards;
    }
    // setter for Cards variable 
    public void setCards(Card cards) {
        this.cards = cards;
    }
    
    // getter for the deck 
    public LinkedList<Card> getDeck() {
        
        return deck;
    }
    
    // setter for my Deck, using card array as parameter
    public void setDeck(LinkedList<Card> deck) {
        this.deck = deck;
    }

    @Override
    public String toString() {
        return "Deck{" + "deck=" + deck + '}';
    }
    
 
    
    // Default constructor for the deck class  
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
            deck.add(new Card(i+2, "Clubs"));         } 
        shuffleDeck(deck); 
    }
 
    public Card drawCard(){
        if (deck.isEmpty() != true){
            Card card1 = deck.removeFirst();
            return card1; 
        } 
        else shuffleDeck(deck); 
        Card card1 = deck.removeFirst();
        return card1;
        
    }

    // Uses collection import to shuffle and array of objects
    static void shuffleDeck(LinkedList<Card> deck){ 
        Collections.shuffle(deck);
    }

    
}   
    



/**
 * 
 * linkedList<Card> deck = new LinkedList<Card>();
 */
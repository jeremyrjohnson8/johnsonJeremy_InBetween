/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnsonJeremy_inBetween;
import java.util.*;
/**
 * Title : Card Class
 * Description : This class models a single card - no Jokers included
 * Author: Jeremy Johnson
 * Date 3/25/2016
 */
public class Card {
    
    /**
     * Variables for Class Card 
     * 
     */
    
    private int cardValue; 
    private String cardSuit; 
    private String faceValue; 

    // Getter for my cardValue - will generate random card value for single card
    // instances 
    public int getCardValue() {
            cardValue = 2 +(int)(Math.random()*13); 
        return cardValue;
    }

    // setter for card value
    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }
    /**

     * GetFaceValue 
     * @return 
     */
    public String getFaceValue() {
        switch (cardValue){
            case 2: faceValue = Character.toString ((char) 50);
                break;
            case 3: faceValue = Character.toString ((char) 51);
                break;
            case 4: faceValue = Character.toString ((char) 52);
                break;
            case 5: faceValue = Character.toString ((char) 53);
                break;
            case 6: faceValue = Character.toString ((char) 54);
                break;
            case 7: faceValue = Character.toString ((char) 55);
                break;
            case 8: faceValue = Character.toString ((char) 56);
                break;
            case 9: faceValue = Character.toString ((char) 57);
                break;
            case 10: faceValue = Character.toString ((char) 49) + 
                    Character.toString ((char) 48);
                break;
            case 11: faceValue = Character.toString ((char) 74);
                break;
            case 12: faceValue = Character.toString ((char) 81);
                break;
            case 13: faceValue = Character.toString ((char) 75);
                break;
            case 14: faceValue = Character.toString ((char) 65);
                break;
            default: faceValue = "Invalid Face Value"; 
        }
        
        return faceValue;
    }

    public void setFaceValue(String faceValue) {
        
        this.faceValue = faceValue;
    }
    
    // setter for card suit 
    public void setCardSuit(String cardSuit) {
        
        this.cardSuit = cardSuit;
    }
    
    // getter for card suit - uses random gen number to determine suit 
    public String getCardSuit() {
        int suitNumber; 
        
        suitNumber = (int)( Math.random()*4); 
        switch (suitNumber){
            case 0: cardSuit = "\u2663";
            break; 
            case 1: cardSuit = "\u2660";
            break;
            case 2: cardSuit = "\u2661";
            break;
            case 3: cardSuit = "\u2662"; 
            break; 
            default: cardSuit = "Invalid Suit"; 
            break;
        }
        return cardSuit;
    }

    public Card(int cardValue, String cardSuit) {
        this.cardValue = cardValue;
        this.cardSuit = cardSuit;
        faceValue = getFaceValue();
    }

    public Card() {
        cardValue = getCardValue();
        faceValue = getFaceValue();
        cardSuit = getCardSuit(); 
        
    }
    
    
    @Override
    public String toString() {
        return "Card{" + "cardValue=" + cardValue + ", cardSuit=" + cardSuit + ", faceValue=" + faceValue + '}';
    }
    
       // equals method for two cards 
    public static boolean equals(Card obj, Card other) {
        boolean equals = false; 
        
            if (obj.cardSuit.equals(other.getCardSuit()) 
                    && obj.getCardValue() == other.getCardValue())
                return true; 
            else 
                 equals = false;      
    
            return equals;
    }
}
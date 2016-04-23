/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnsonJeremy_inBetween;

import java.util.ArrayList;
import java.util.Scanner; 

/**
 *
 * @author jeremyjohnson
 */
public class DriverClass {
    
    public static void main(String[] args) {
        
       Card card = new Card();
  
       Deck deck = new Deck();
    
       /**
       // variables 
        int testCases = 0; 
        int inBetween = 0; 
        int notInBetween = 0;
        int matchesCard = 0; 
        

        // Loop for test cases 
        for (int i = 0; i < 4; i++){
        
            Card card1 = deck.drawCard(); 
            Card card2 = deck.drawCard();
            
            System.out.println(card2.getCardSuit());
            
            System.out.println(card1 + " " + card2); 
            if (!card1.equals(card2)){
                Card card3 = deck.drawCard();

                if (card3.getCardValue() > card2.getCardValue() && 
                    card3.getCardValue() > card1.getCardValue() 
                        || card3.getCardValue() <  card2.getCardValue() && 
                            card3.getCardValue() < card1.getCardValue()){
                            notInBetween++; 
                } else if (card3.getCardValue() > card2.getCardValue() && 
                    card3.getCardValue() < card1.getCardValue() 
                        || card3.getCardValue() < card2.getCardValue() && 
                            card3.getCardValue() > card1.getCardValue()){
                            inBetween++; 
                } else if (card3.getCardValue() == card2.getCardValue() || 
                        card3.getCardValue() == card1.getCardValue()){
                            matchesCard++; 
                } 
            } else if (card1.getCardValue() == card2.getCardValue()){
                matchesCard++; 
            } 
            testCases++;
        }
        
        System.out.println("--------------------------------");
        System.out.println();
        System.out.println("      Test Case Statistics      ");
        System.out.println();
        System.out.println("Test Cases Ran: " + testCases);
        System.out.println("Times Cards Matched: " + matchesCard);
        System.out.println("Times Card 3 Was Not In Between 1 & 2: " 
                + notInBetween);
        System.out.println("Times Card 3 Was In Between 1 & 2: " + inBetween);
        System.out.println();
        System.out.println("      End Test Statistics       ");
        System.out.println("--------------------------------");
        **/
       
         
        Person jeremy = new Person(50, "Jeremy");
        Person dillon = new Person (50, "Dillon"); 
        
        System.out.println(jeremy.toString()); 
        System.out.println(dillon.toString());
       
        //House round1 = new House();
        
        for (int i =0; i < 51; i++){
            System.out.println(deck.drawCard());
        }
        
        
            System.out.println(deck.toString());  
        }
    }


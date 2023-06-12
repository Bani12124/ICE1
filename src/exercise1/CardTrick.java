package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Praneet Kaur.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */

/*
 * Modifier: Praneet Kaur
 * Student Number: 991712841
 */

public class CardTrick {
    
    public static void main(String[] args){
        Card[] magicHand = new Card[7];
        Random random = new Random();
        
        for (int i=0; i<magicHand.length; i++){
            Card c = new Card();
            c.setValue(random.nextInt(13)+1);
            c.setSuit(Card. SUITS[random.nextInt(4)]);
            magicHand[i] = c;
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your card (1 to 13): ");
        int userValue = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your card suit (Hearts, Diamonds, Spades, Clubs): ");
        String userSuit = scanner.nextLine();
        Card userCard = new Card(userSuit, userValue);
        
        boolean found = false;
        for (Card card : magicHand){
            if (card.getValue() == userCard.getValue() && card.getSuit().equalsIgnoreCase(userCard.getSuit())){
                found = true;
                break;
            }
        }
        
        if (found){
            System.out.println("Congratulations...Your card is in the magic hand!!!");
        } else {
            System.out.println("Sorry.....Your card is not in the magic hand.");
        }
    }
    
}
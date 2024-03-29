 package exercise1;

import exercise1.Card;
import java.util.Random;
import java.util.Scanner;

/**
 * Date 07-06-2023
 * @author Parneet Kaur
 */
public class CardTrick {

    /**
     * This class +++ Insert class description here+++
     *
     * @author Parneet Kaur
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Create an array to hold 7 cards
        Card[] hand = new Card[7];

//        Using Random to generate random numbers
        Random random = new Random();

        for (int i = 0; i < hand.length; i++) {
            int value = random.nextInt(13) + 1;
            String suit = Card.SUITS[random.nextInt(4)];

            Card card = new Card(value, suit);
            hand[i] = card;
        }

        // print them out for debugging
        System.out.println("Here are the cards in the hand");
        for (Card card : hand) {
            System.out.printf("%d of %s\n", card.getValue(), card.getSuit());
        }

        // Now ask the user for a card
        System.out.println("pick a suit for your card");
        for (int i = 0; i < Card.SUITS.length; i++) {
            System.out.println((i + 1) + ": " + Card.SUITS[i]);
        }
        int suit = input.nextInt();

        System.out.println("Enter a value (1 to 13)");
        int value = input.nextInt();

        Card userGuess = new Card(value, Card.SUITS[suit - 1]);

        boolean match = false;
        for (Card card : hand) {
            if (card.getValue() == userGuess.getValue() && card.getSuit().equals(userGuess.getSuit())) {
                match = true;
                break;
            }
        }

        String response = match ? "Right guess" : "No match";
        System.out.println(response);
    }

}


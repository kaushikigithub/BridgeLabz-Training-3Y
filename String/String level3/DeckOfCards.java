import java.util.Random;

public class DeckOfCards {

    public static void main(String[] args) {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        String[] deck = new String[52];
        int index = 0;

        // Create deck
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }

        // Shuffle
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int r = i + rand.nextInt(deck.length - i);
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }

        // Distribute to 4 players (9 cards each)
        for (int player = 0; player < 4; player++) {
            System.out.println("Player " + (player + 1) + " cards:");
            for (int j = 0; j < 9; j++) {
                System.out.println("  " + deck[player * 9 + j]);
            }
            System.out.println();
        }
    }
}

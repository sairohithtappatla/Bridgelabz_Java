package dataStructure.javaStrings.level3;

import java.util.Scanner;

public class CardDeck {

    // Define card suits
    private static final String[] SUITS = {
            "Hearts",
            "Diamonds",
            "Clubs",
            "Spades"
    };

    // Define card ranks
    private static final String[] RANKS = {
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10",
            "Jack",
            "Queen",
            "King",
            "Ace"
    };

    // Method to initialize the complete deck
    public static String[] initializeDeck() {

        // Calculate total number of cards
        int numberOfCards =
                SUITS.length * RANKS.length;

        // Create the deck array
        String[] deck =
                new String[numberOfCards];

        // Store the current deck position
        int cardIndex = 0;

        // Iterate through every suit
        for (String suit : SUITS) {

            // Iterate through every rank
            for (String rank : RANKS) {

                // Create card in "rank of suit" format
                deck[cardIndex] =
                        rank + " of " + suit;

                // Move to next card position
                cardIndex++;
            }
        }

        // Return initialized deck
        return deck;
    }

    // Method to shuffle the deck
    public static String[] shuffleDeck(
            String[] deck) {

        // Iterate through every card
        for (int i = 0; i < deck.length; i++) {

            // Generate random card number from i to n
            int randomCardNumber =
                    i
                            + (int)
                            (Math.random()
                                    * (deck.length - i));

            // Store current card temporarily
            String temporaryCard =
                    deck[i];

            // Swap current card with random card
            deck[i] =
                    deck[randomCardNumber];

            // Complete the swap
            deck[randomCardNumber] =
                    temporaryCard;
        }

        // Return shuffled deck
        return deck;
    }

    // Method to distribute cards among players
    public static String[][] distributeCards(
            String[] deck,
            int numberOfCards,
            int numberOfPlayers) {

        // Check whether cards can be equally distributed
        if (numberOfCards % numberOfPlayers != 0) {

            // Return null when distribution is not possible
            return null;
        }

        // Calculate cards per player
        int cardsPerPlayer =
                numberOfCards / numberOfPlayers;

        // Create player-card 2D array
        String[][] players =
                new String[numberOfPlayers][cardsPerPlayer];

        // Store current deck position
        int cardIndex = 0;

        // Iterate through every player
        for (int player = 0;
             player < numberOfPlayers;
             player++) {

            // Distribute cards to current player
            for (int card = 0;
                 card < cardsPerPlayer;
                 card++) {

                // Assign the next card
                players[player][card] =
                        deck[cardIndex];

                // Move to next card
                cardIndex++;
            }
        }

        // Return distributed players
        return players;
    }

    // Method to print players and their cards
    public static void printPlayers(
            String[][] players) {

        // Display every player's cards
        for (int player = 0;
             player < players.length;
             player++) {

            // Display player number
            System.out.println(
                    "\nPlayer " + (player + 1) + ":"
            );

            // Display every card of the player
            for (String card : players[player]) {

                // Display card
                System.out.println(card);
            }
        }
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Calculate total cards in a standard deck
        int totalCards =
                SUITS.length * RANKS.length;

        // Display total cards
        System.out.println(
                "Total cards in deck: "
                        + totalCards
        );

        // Take number of cards to distribute
        System.out.print(
                "Enter number of cards to distribute: "
        );
        int numberOfCards =
                input.nextInt();

        // Take number of players
        System.out.print(
                "Enter number of players: "
        );
        int numberOfPlayers =
                input.nextInt();

        // Validate number of cards
        if (numberOfCards <= 0
                || numberOfCards > totalCards) {

            // Display validation message
            System.out.println(
                    "Number of cards must be between 1 and "
                            + totalCards + "."
            );

            // Close Scanner
            input.close();

            // Stop execution
            return;
        }

        // Validate number of players
        if (numberOfPlayers <= 0) {

            // Display validation message
            System.out.println(
                    "Number of players must be positive."
            );

            // Close Scanner
            input.close();

            // Stop execution
            return;
        }

        // Check whether cards can be equally distributed
        if (numberOfCards % numberOfPlayers != 0) {

            // Display distribution error
            System.out.println(
                    "Cards cannot be equally distributed "
                            + "among the players."
            );

            // Close Scanner
            input.close();

            // Stop execution
            return;
        }

        // Initialize the deck
        String[] deck =
                initializeDeck();

        // Shuffle the deck
        deck =
                shuffleDeck(deck);

        // Distribute the requested number of cards
        String[][] players =
                distributeCards(
                        deck,
                        numberOfCards,
                        numberOfPlayers
                );

        // Display player cards
        printPlayers(players);

        // Close Scanner
        input.close();
    }
}

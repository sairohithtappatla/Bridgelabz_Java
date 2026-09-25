package dataStructure.javaStrings.level2;

import java.util.Scanner;

public class RockPaperScissors {

    // Method to generate the computer's choice
    public static String getComputerChoice() {

        // Generate a random number from 0 to 2
        int randomChoice = (int) (Math.random() * 3);

        // Return Rock for 0
        if (randomChoice == 0) {
            return "Rock";
        }

        // Return Paper for 1
        if (randomChoice == 1) {
            return "Paper";
        }

        // Return Scissors for 2
        return "Scissors";
    }

    // Method to find the winner between user and computer
    public static String findWinner(
            String userChoice,
            String computerChoice) {

        // Check whether both choices are the same
        if (userChoice.equals(computerChoice)) {
            return "Draw";
        }

        // Check all winning combinations for the user
        if ((userChoice.equals("Rock")
                && computerChoice.equals("Scissors"))
                || (userChoice.equals("Paper")
                && computerChoice.equals("Rock"))
                || (userChoice.equals("Scissors")
                && computerChoice.equals("Paper"))) {

            // Return user win
            return "User";
        }

        // Computer wins in all remaining cases
        return "Computer";
    }

    // Method to calculate win statistics
    public static String[][] calculateStatistics(
            int userWins,
            int computerWins,
            int totalGames) {

        // Calculate user win percentage
        double userPercentage =
                (userWins * 100.0) / totalGames;

        // Calculate computer win percentage
        double computerPercentage =
                (computerWins * 100.0) / totalGames;

        // Create statistics table
        String[][] result = new String[2][3];

        // Store user statistics
        result[0][0] = "User";
        result[0][1] = String.valueOf(userWins);
        result[0][2] =
                String.format("%.2f", userPercentage);

        // Store computer statistics
        result[1][0] = "Computer";
        result[1][1] = String.valueOf(computerWins);
        result[1][2] =
                String.format("%.2f", computerPercentage);

        // Return statistics
        return result;
    }

    // Method to display game statistics
    public static void displayStatistics(
            String[][] statistics) {

        // Display table header
        System.out.println(
                "\nPlayer\tWins\tWin Percentage"
        );

        // Display each player's statistics
        for (String[] row : statistics) {

            // Display player, wins, and percentage
            System.out.println(
                    row[0]
                            + "\t"
                            + row[1]
                            + "\t"
                            + row[2]
                            + "%"
            );
        }
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take number of games
        System.out.print("Enter number of games: ");
        int numberOfGames = input.nextInt();

        // Validate number of games
        if (numberOfGames <= 0) {

            // Display validation message
            System.out.println(
                    "Number of games must be positive."
            );

            // Close Scanner
            input.close();

            // Stop execution
            return;
        }

        // Initialize user and computer win counters
        int userWins = 0;
        int computerWins = 0;

        // Play all requested games
        for (int game = 1; game <= numberOfGames; game++) {

            // Display available choices
            System.out.println(
                    "\nGame " + game
                            + " - Choose Rock, Paper, or Scissors"
            );

            // Take user choice
            String userChoice = input.next();

            // Normalize the user's choice
            userChoice =
                    userChoice.substring(0, 1).toUpperCase()
                            + userChoice.substring(1).toLowerCase();

            // Validate user choice
            if (!userChoice.equals("Rock")
                    && !userChoice.equals("Paper")
                    && !userChoice.equals("Scissors")) {

                // Display invalid choice
                System.out.println(
                        "Invalid choice. Game skipped."
                );

                // Move to next game
                continue;
            }

            // Generate computer choice
            String computerChoice = getComputerChoice();

            // Find the winner
            String winner =
                    findWinner(
                            userChoice,
                            computerChoice
                    );

            // Count user win
            if (winner.equals("User")) {
                userWins++;

            // Count computer win
            } else if (winner.equals("Computer")) {
                computerWins++;
            }

            // Display game result
            System.out.println(
                    "User: " + userChoice
                            + " | Computer: " + computerChoice
                            + " | Winner: " + winner
            );
        }

        // Calculate total completed games
        int completedGames =
                userWins + computerWins;

        // Calculate statistics only when games were completed
        if (completedGames > 0) {

            // Calculate statistics
            String[][] statistics =
                    calculateStatistics(
                            userWins,
                            computerWins,
                            completedGames
                    );

            // Display statistics
            displayStatistics(statistics);

        } else {

            // Display message when no valid game was completed
            System.out.println(
                    "No valid games were completed."
            );
        }

        // Close Scanner
        input.close();
    }
}

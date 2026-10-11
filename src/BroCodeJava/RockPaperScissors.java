package BroCodeJava;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    static void main(String[] args) {

        // ROCK PAPER SCISSORS GAME

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        // DECLARE VARIABLES

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";
        // GET CHOICE FROM THE USER

        do {
            System.out.print("Enter your move(rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors")){
                System.out.println("Invalid Choice!");
                continue;
            } // If the user pick anything invalid we will skip current iteration of the do loop

            // GET RANDOM CHOICE FOR THE COMPUTER

            computerChoice = choices[random.nextInt(3)]; // this method of the random object would return a random number between 0 and 3
            System.out.println("Computer choice: " + computerChoice);
            // CHECK WIN CONDITIONS

            if(playerChoice.equals(computerChoice)){ // Comparing two string, refference data type use equals method and we can't use == becuz than you are comparing memory addresses
                System.out.println("It's a Tie!");
            } else if ( (playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (playerChoice.equals("scissors") && computerChoice.equals("paper")) ) {
                System.out.println("You win!");
            }


            // ABOVE ELSE IF( there were 3 else if in total) 6:10:00 HARD TO READ we can condense them into single else if statement (optionally)
            else{
                System.out.println("You lose!");
            }

            // ASK TO PLAY AGAIN?

         //   System.out.print("Play Again ( yes / no ) : ");
          //  playAgain = scanner.nextLine().toLowerCase();

            while (true) {
                System.out.print("Play Again (yes/no): ");
                playAgain = scanner.nextLine().trim().toLowerCase(); // .trim() is used to remove extra whitespace from the beginning and end of a string.

                if (playAgain.equals("yes") || playAgain.equals("no")) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter yes or no.");
                }
            } // my logic here :)
        }while (playAgain.equals("yes"));

        // GOOD BYE MESSAGE!
        System.out.println("Thanks For Playing!");
       scanner.close();

    }
}

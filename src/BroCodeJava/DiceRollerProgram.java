package BroCodeJava;

import java.util.Random;
import java.util.Scanner;

//  04:51:26
public class DiceRollerProgram {
    static void main(String[] args) {
        // ASCII ART
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numOfDice;
        int total = 0;


        System.out.println("Enter the # of dice of roll: ");
        numOfDice = scanner.nextInt();

        if(numOfDice > 0){

            for (int i = 0; i < numOfDice; i++){
                int roll = random.nextInt(1,7);
                printDie(roll);
                System.out.println("You rolled: " + roll);
                total += roll;
            }
            System.out.println("Total: "+ total);
        }
        else{
            System.out.println("# of dice must be greater than 0");
        }

        // DECLARE VARIABLES
        //GET # OF DICE FROM THE USER
        // CHECK IF # OF DICE > 0
        // ROLL ALL THE DICE
        // GET THE TOTAL
        // DISPLAY ASCII OF DICE

        scanner.close();

    }
    static void printDie(int roll){
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;  // Multi line String
        // in run window type charmap
        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;
        String dice3 = """
                 -------
                |   ●   |
                |   ●   |
                |   ●   |
                 -------
                """;
        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;

        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;
        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

        switch(roll){
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.println("Invalid roll");
        }
    }
}

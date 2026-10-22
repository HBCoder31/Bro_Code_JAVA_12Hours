package BroCodeJava.Projects;

import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    static void main(String[] args) {

        //JAVA SLOT MACHINE

        // DECLARE VARIABLES
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        // DISPLAY WELCOME MESSAGE
        System.out.println("***************************");
        System.out.println("Welcome to JAVA SLOTS!");
        System.out.println("Symbols: 🤣 👌 🥲 😁 😍");
        System.out.println("***************************");

        // PLAY IF BALANCE > 0

        while (balance > 0){
            System.out.println("Current balance: $" +balance);
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();// There is still new line character 1\n in input buffer
            scanner.nextLine();// we used this to get rid of new line character
            if ( bet > balance){
                System.out.println("INSUFFICIENT FUNDS");
                continue;
            } else if (bet <= 0) {
                System.out.println("Bet must be greater than 0");
                continue;

            }
            else{
                balance -= bet;
            }

            System.out.println("Spinning....");
           row =  spinRow();
           printRow(row);
            getPayout(row, bet);
            payout = getPayout(row, bet);

            if(payout > 0){
                System.out.println("You won $" + payout);
                balance += payout;
            } else{
                System.out.println("Sorry you lost this round :(");
            }

            System.out.println("Do you want to play again? (Y/N) : ");
            playAgain = scanner.nextLine().toUpperCase();

            if(!playAgain.equals("Y")){
                break;
            }

        }
        System.out.println("!!! GAME OVER !!!");
        System.out.println("Your final balance is $" + balance);
        // ENTER BET AMOUNT
        //   VERIFY IF BET > BALANCE
        // VERIFY IF BET > 0
        // SUBTRACT BET FROM BALANCE
        // SPIN ROW
        // PRINT ROW

        // GET PAYOUT

        // ASK TO PLAY AGAIN
        // DISPLAY EXIT MESSAGE


        scanner.close();
    }
    static  String[] spinRow(){

        String[] symbols = { "🤣", "👌", "🥲", "😁",  "😍"};
        String[] row = new String[3];
        Random random = new Random();



        for (int i = 0; i < 3 ; i++){
            row[i] =  symbols[random.nextInt(symbols.length)];
        }

        return row;
    }
    static void printRow(String[] row){
        System.out.println("********************");
        System.out.println(" " + String.join(" | ", row)); // String.join() is used to combine multiple strings into one string with a separator between them.
    }
    static int getPayout(String[] row, int bet){
            if(row[0].equals(row[1]) && row[1].equals(row[2]) ){ // we can't use comparison operators '==' for strings cuz they're reference data types
                return switch(row[0]){
                    case "🤣" -> bet * 3;
                    case "👌" -> bet * 4;
                    case "🥲" -> bet * 5;
                    case "😁" -> bet * 10;
                    case "😍" -> bet * 20;
                    default -> 0;
                };
            }
        else if(row[0].equals(row[1])  ){
            return switch(row[0]){
                case "🤣" -> bet * 2;
                case "👌" -> bet * 3;
                case "🥲" -> bet * 4;
                case "😁" -> bet * 8;
                case "😍" -> bet * 15;
                default -> 0;
            };
        }
            else if(row[1].equals(row[2])  ){
                return switch(row[1]){
                    case "🤣" -> bet * 2;
                    case "👌" -> bet * 3;
                    case "🥲" -> bet * 4;
                    case "😁" -> bet * 8;
                    case "😍" -> bet * 15;
                    default -> 0;
                };
            }
        return 0;
    }
}

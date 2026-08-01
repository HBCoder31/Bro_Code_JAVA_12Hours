package BroCodeJava;

import java.util.Scanner;

public class whileLoops {
    static void main(String[] args) {

        // while loops = repeat some code forever
        //               while some condition remains true

       /* Scanner scanner = new Scanner(System.in);

        String name = "";

        while (name.isEmpty()){
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
            // The code will continue again and again until above condition be true
            // if Condition becomes true then program continues
            // BE CAREFUL OF INFINIT LOOPS
        }
// What if people skips prompts well we could use while loop
        System.out.println("Hello " + name);

        scanner.close();

        */

       // while(1 == 1 ){   // with our while loop if we have a condition that we can't change within the loop is called infinite loop
         //   System.out.println("HELP! I'M IN A LOOP!");
        // }

        Scanner scanner = new Scanner(System.in);

        /* String response= "";

        while(!response.equals("Q")){
            System.out.println("You are playing a game");
            System.out.print("Press Q to quit: ");
            response = scanner.next().toUpperCase();
        }

        System.out.println(" You have quit the game. ");


         */

       // int age = 0;

        /* System.out.println("Enter your age: ");
        age = scanner.nextInt();

        while (age < 0) {
            System.out.println("Your age can't be negative. ");
            System.out.println("Enter your age: ");
            age = scanner.nextInt();
        }

        // there is a variation of while loop known DO WHILE loop that is do some
        // code first and then checks the condition

        System.out.println("You are " + age + " years old. ");


         */

        int number = 0;

        do { // rather than checking condition from beginning we could check it at end
            System.out.println("Enter a number between 1 -10:  ");
            number = scanner.nextInt();

        } while(number < 1 || number > 10);

        System.out.println("You picked " + number);
        scanner.close();
    }
}

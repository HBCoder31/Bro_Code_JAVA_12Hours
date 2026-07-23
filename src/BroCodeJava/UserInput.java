package BroCodeJava;

import java.util.Scanner;

public class UserInput {
    static void main(String[] args) {

        //COMMON ISSUES

        Scanner scanner = new Scanner(System.in);

        /*

        System.out.print("Enter your name: ");
         String name  = scanner.nextLine(); // if i Use next instead of nextLine then only first word would be shown if I enter Harsh Bohra then only 'Harsh' will get print

        System.out.print("Enter you age: ");
        int age = scanner.nextInt();

        System.out.print("What is your CGPA: ");
        double cgpa = scanner.nextDouble();

        System.out.print("Are you a Student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();


        System.out.println("Hello " + name);
        System.out.println("Your are " + age + " years old");
        System.out.println("Your CGPA is: " + cgpa);

        if (isStudent){
            System.out.println("You are enrolled as a student");
        }
        else{
            System.out.println("You are NOT enrolled");
        }
        */
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("What is your favourite color: ");
        String color = scanner.nextLine();

        System.out.println("You are " + age + " years old." );
        System.out.println("You like the color: " + color);


        /* nextInt() reads only the integer and leaves the ENTER key (newline) in the input buffer.
 The following nextLine() reads that leftover newline instead of waiting for user input,
 so the 'color' string may appear empty.
           Fix: call scanner.nextLine() once after nextInt() to consume the leftover newline.

         */


        scanner.close();
    }
}

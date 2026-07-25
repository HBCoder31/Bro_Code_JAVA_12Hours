package BroCodeJava;

import java.util.Scanner;

public class ifStatements {
    static void main(String[] args) {

        // If statements = performs a block of code if its condition is true

        Scanner scanner = new Scanner(System.in);
        int age;
        String name;
        boolean isStudent;

        System.out.print("Enter your name : ");
        name = scanner.nextLine();

        System.out.print("Enter your age : ");
        age = scanner.nextInt();

        System.out.print("Are you an student (true/false): ");
        isStudent = scanner.nextBoolean();

        //GROUP 1
        if (name.isEmpty()){
            System.out.println("You didn't enter your name.");

        }else {
            System.out.println("Hello " + name + "! ");
        }

        //GROUP 2
        if (age >= 65) {
            System.out.println("You are an senior citizen");

        }
         else if (age >= 18){
            System.out.println("You are an adult.");

        }
         else if (age < 0) {
            System.out.println(" You haven't been born yet.");

        }
         else if (age == 0) {
            System.out.println("Congratulation you just born.");


        } else {
            System.out.println("You are a child.");
        }

         // GROUP 3

        if (isStudent){

            System.out.println("You are an student. ");

        } else {
            System.out.println("You are not a Student.");
        }
        scanner.close();
    }
}

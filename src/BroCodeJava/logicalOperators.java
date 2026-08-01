package BroCodeJava;

import java.util.Scanner;

public class logicalOperators {
    static void main(String[] args) {


        // && = AND use to check more than one condition both must be true
        // || = OR checks condition,  atleast one condition needed to be true to get printed
        // ! = NOT use to check if it is not true

/*
        double temp = 35;
        boolean isSunny = false;

        if (temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("The weather is GOOD 😁");
            System.out.println("It is SUNNY outside ☀️");
        }
        else if(temp <= 30 && temp >= 0 && !isSunny){
            System.out.println("The weather is GOOD 😁");
            System.out.println("It is CLOUDY outside  ☁️️");
        } else if (temp > 30 || temp < 0) {
            System.out.println("The weather is bad 😒");

        }

 */
        Scanner scanner = new Scanner(System.in);

        // username must be between 4 -12 characters
        // username must not contain spaces or underscores

        String username;

        System.out.println("Enter your new username: ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12){
            System.out.println("username must be between 4 -12 characters");
        } else if (username.contains(" ") || username.contains("_")) {
            System.out.println("username must not contain spaces or underscores");

        } else {
            System.out.println("Welcome " + username);
        }
        scanner.close();
    }
}

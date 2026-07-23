package BroCodeJava;

// ❎ variable = a reusable container for a value
//               a variable behaves as if it was the value it contains

// 🟥 Primitive = simple value stored directly in memory (stack)
// 🟦 Reference = memory address (stack) that points to the (heap)

// 🟥 Primitive vs 🟦 Reference
// ---------         ---------
// int               string
// double            array
// char              object
// boolean

public class variable {
    static void main(String[] args) {
        int age = 20;
        int year = 2025;
        int quantity = 1;

        double price = 29999.99;
        double cgpa = 8.4;
        double temperature = 44.5;

        char grade = 'A';
        char symbol = '@';
        char currency = '$';

        boolean isStudent = true; // isStudent is called cameCase naming convention
        boolean forSale = true;
        boolean isOnline = true;

        String name = "Harsh Bohra";
        String food = "Bhindi";
        String email = "fake123@gmail.com";
        String car = "hellcat";
        String color ="red";

        // Using boolean application
       /*
        if(isStudent){
            System.out.println("You are a student!");

        }
        else{
            System.out.println("You are NOT a student");
        }
          */

        System.out.println(name);
        System.out.println("Hello " + name); //This is called string concatenation

        System.out.println("Your choice is a " + color + " "+  year + " " + car );
        System.out.println("The price is: " + currency + price);

        if(forSale){
            System.out.println("The " + car + " is not for sale");
        }

        // HW 2 of BroCode
        int gta = 6;
        double pi = 3.14159;
        char gender = 'M';
        boolean isAdmin = true;

        if (isAdmin){
            System.out.println("Printing HW " + name + " " + "wanted to play GTA " + gta + " for " + pi + " hours because he is " + gender );
        }


    }
}

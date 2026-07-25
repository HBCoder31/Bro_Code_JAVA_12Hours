package BroCodeJava;

import java.util.Scanner;


public class Exercise2 {
    static void main(String[] args) {

        //SHOPPING CART PROGRAM

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item you would like to buy? : ");
        item = scanner.nextLine();

        System.out.print("What is the price for each? : ");
        price  = scanner.nextDouble();

        System.out.print("How many you would you like? : ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("Your Total is : " + currency + total);




        scanner.close();
    }
}

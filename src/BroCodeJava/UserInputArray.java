package BroCodeJava;

import java.util.Scanner;

public class UserInputArray {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] foods;
        int size;

        System.out.println("What number of food do you want? : ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];
/*
        foods[0] = "pizza";
        foods[1] = "taco";
        foods[2] = "burger";


 */
        for (int i = 0; i < foods.length; i++) {
            System.out.println("Enter a food: ");
            foods[i] = scanner.nextLine();
        }
            for (String food : foods) {
                System.out.println(food);

                scanner.close();
            }

    }
}

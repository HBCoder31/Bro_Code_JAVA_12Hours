package BroCodeJava;

import java.util.Scanner;

public class WeightConverter {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // WEIGHT CONVERSION PROGRAM

        // DECLARE VARIABLES

        double weight;
        double newWeight;
        int choice;

        // WELCOME MESSAGE

        System.out.println("------Welcome To Weight Converter Program------");
        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert LBS to KGS");
        System.out.println("2: Convert KGS to LBS");


        // PROMPT FOR USER CHOICE
        System.out.print("Choose an Option: ");
        choice = scanner.nextInt();

        // OPTION 1 CONVERT LBS TO KGS

        if(choice == 1){
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in KGS is %.2f kgs", newWeight);
        }

        // OPTION 2 CONVERT KGS TO LBS
        else  if(choice == 2) {
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in LBS is %.2f lbs", newWeight);
        }
        // ELSE PRINT NOT A VALID CHOICE

        else  {
            System.out.println("That was not a valid choice");
            
        }


        scanner.close();
    }
}

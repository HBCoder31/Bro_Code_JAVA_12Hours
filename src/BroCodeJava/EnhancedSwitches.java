package BroCodeJava;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EnhancedSwitches {
    static void main(String[] args) {

        // Enhanced switch = A replacement to many else if statements
        //   (JAVA 14 feature)
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine();

        //String day = "Saturday";

        switch(day){
            case "Monday", "Tuesday" ,"Wednesday", "Thursday", "Friday" -> System.out.print("It is a weekday 😒");

            case "Saturday", "Sunday" -> System.out.println("It is a weekend 😁");

            default -> System.out.println(day + " is not a day"); // If no above condition is true


        }
    }
}

package BroCodeJava;

import java.util.Scanner;

public class Exercise1 {
    static void main(String[] args) {


        // Calculate area of Rectangle

        double length = 0;
        double breadth = 0;
        double area = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length: ");
        length = scanner.nextDouble();

        System.out.print("Enter the breadth: ");
        breadth = scanner.nextDouble();

        area = length * breadth;

       //  System.out.print("The area is: " + area + " cm² ");
        System.out.printf("The area is: %.2f cm²%n", area);
        /*
        Windows Emoji/Symbol panel
        Press Win + . (Windows key + period)
         */

        // printf() is used when formatted output is needed.
// %.2f displays a floating-point value with 2 decimal places.
// The comma separates the format string from the value that will
// replace the format specifier. %n moves to the next line.


        scanner.close();
    }
}

package BroCodeJava;

import java.util.Scanner;

public class MathCLass {
    static void main(String[] args) {

        //System.out.println(Math.PI);
        //System.out.println(Math.E);
       /*
        double result;

        result = Math.pow(3, 2);
        result = Math.abs(-6);
        result = Math.sqrt(9);
        result = Math.round(3.14);
        result = Math.ceil(3.14); // To round up result = 4
        result = Math.floor(3.99); // To round down result = 3
        result = Math.max(10, 20);
        result = Math.min(10, 20);


        System.out.println(result); */

        //HYPOTENUSE c = Math.sqrt(a² + b²)

          Scanner scanner = new Scanner(System.in);
/*
        double a;
        double b;
        double c;

        System.out.print("Enter the length of side a: ");
        a = scanner.nextDouble();
        System.out.print("Enter the length of side b: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a , 2) + Math.pow(b, 2));

        System.out.println("The hypotenuse ( side c ) is: " + c + "cm");


          */

        // circumference = 2 * Math.PI * radius;
        // area = Math.PI * Math.pow( radius , 2);
        // volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.println("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;

        System.out.println();


        scanner.close();

    }
}

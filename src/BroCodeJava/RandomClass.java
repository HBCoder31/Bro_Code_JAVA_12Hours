package BroCodeJava;

import java.util.Random;
// Using RANDOM MODULE IN JAVA
public class RandomClass {
    static void main(String[] args) {

        Random random = new Random();

       /* int number1;
        int number2;
        int number3;
// Normally generate number between 0 and 2 billion  if not uses origin and bound

        number1 = random.nextInt(1, 7);
        number2 = random.nextInt(1, 20);
        number3 = random.nextInt(21, 40);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3); */
/*
        double number;

        number = random.nextDouble();
//Generates number between 0 and 1
        System.out.println(number); */

        boolean isHeads;

        isHeads = random.nextBoolean();

        //System.out.println(isHeads);

        if (isHeads){
            System.out.println("HEADS");
        } else {
            System.out.println("TAILS");
        }

    }
}

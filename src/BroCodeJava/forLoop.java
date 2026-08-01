package BroCodeJava;

import java.util.Scanner;

public class forLoop {
    static void main(String[] args) throws InterruptedException{

        // for loop = execute some code a CERTAIN amount of times

       // for (int i = 10; i > 0 ; i-=3  ){// i = loop control variable, condition, update
         //   System.out.println(i);

        //}

    /*    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter how many times you want to loop: ");
        int max = scanner.nextInt();

        for ( int i = 1; i <= max ; i++ ){
            System.out.println(i);
        }

     */

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many seconds to countdown from? : ");

        int start = scanner.nextInt();

        for (int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Happy New Year");

        scanner.close();
    }

}

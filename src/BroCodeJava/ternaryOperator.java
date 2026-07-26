package BroCodeJava;



public class ternaryOperator {
    static void main(String[] args) {

        // ternary Operator ' ? ' = Return 1 of 2 values if a condition is true
        // variable = (condition) ? ifTrue : ifFalse;

        // Simpler version of if - else statements

        //int score = 80;
/*
        if(score >= 60){
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

 */
        // Now doing this same with ternary operator

        //String passOrFail = (score >= 60) ? "PASS" : "FAIL";

        // Even or Odd

       // int number = 32;

       // String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";

        // MORE PRACTICAL EXAMPLE

        // int hours = 13;

        //String timeOfDay = (hours < 12) ? "A.M." : "P.M.";

        int income = 20000;

        double taxRate = (income >= 40000) ? 0.25 : 0.15;
        System.out.println(taxRate);

    }
}

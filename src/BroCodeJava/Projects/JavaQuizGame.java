package BroCodeJava.Projects;

import java.util.Scanner;

public class JavaQuizGame {
    static void main(String[] args) {
        // JAVA QUIZ GAME

        // QUESTIONS array[]

        String[] questions = {"What is the main function of a router?",
                "Which Part of the computer is considered the brain?",
                "What year was Facebook launched?",
                "Who is known as the father of Computer?",
                "What was the first programming language?"};
        // OPTIONS array[][]

        String[][] options = {{"1. Storing files", "2. Encrypting Data", "3. Directing Internet traffic ", "4. Managing password"},
                {"1. CPU", "2. Hard Drive", "3. RAM", "4. GPU"},
                {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
                {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"}};
        // DECLARE VARIABLES

        int[] answers = {3, 1, 2, 4, 3};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);


        // WELCOME MESSAGE
        System.out.println("*****************************");
        System.out.println("Welcome to JAVA QUIZ Game!");
        System.out.println("*****************************");
        // QUESTION (loop)

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            // OPTIONS

            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            // GET GUESS FROM USER
            if (guess == answers[i]) {
                System.out.println("*************");
                System.out.println("CORRECT!");
                System.out.println("*************");
                // CHECK OUR GUESS
                score++;
            } else {
                System.out.println("*************");
                System.out.println(" WRONG!");
                System.out.println("*************");
            }
        }

            // DISPLAY FINAL SCORE
        System.out.println("Your Final Score is: " + score + " out of " + questions.length);

            scanner.close();
        }


    }






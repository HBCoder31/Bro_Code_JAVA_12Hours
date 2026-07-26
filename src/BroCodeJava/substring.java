package BroCodeJava;

import java.util.Scanner;

public class substring {
    static void main(String[] args) {

        // Email SLICER PROGRAM
        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your Email: ");
        email = scanner.nextLine();

        if(email.contains("@")) {
            username = email.substring(0 , email.indexOf("@")); // To stop using these numbers we will use indexof method in place of number
            domain = email.substring(email.indexOf("@") + 1);

            System.out.println(username);
            System.out.println(domain);

        }
        else {
            System.out.println("Email must contains '@' character");
        }

        // .substring() = A method used to extract a portion of a string
        //                .substring(start, end)

        //String email = "HB213@gmail.com";
        // Making program flexible


        scanner.close();
    }
}

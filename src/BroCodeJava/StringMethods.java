package BroCodeJava;

public class StringMethods {
    static void main(String[] args) {

        String name = "Password";

       // int length = name.length();
       // char letter = name.charAt(2);
       // int index = name.indexOf("s"); // gives first index of the character
       // int lastindex = name.lastIndexOf("o");

        //To make capital all letters
        //name = name.toUpperCase();
        //name = name.toLowerCase();
       // name = name.trim(); // To remove all the not useful blank spaces
        //name = name.replace("o", "a");
        /*
        if(name.isEmpty()){
            System.out.println("Your name is empty.");
        }else {
            System.out.println("Hello " + name);
        }

         */

        //System.out.println(name);
        /*
        if(name.contains(" ")){
            System.out.println("Your name contains a space");

        } else {
            System.out.println("Your name DOESN'T contains any spaces");
        }

         */

        if (name.equalsIgnoreCase("password")){ // To ignore Case Sensitivity use IgnoreCase
            System.out.println("Your name can't be pasword");


        } else {
            System.out.println("Hello " + name);
        }
    }
}

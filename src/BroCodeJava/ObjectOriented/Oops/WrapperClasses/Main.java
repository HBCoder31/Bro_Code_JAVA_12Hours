package BroCodeJava.ObjectOriented.Oops.WrapperClasses;

public class Main {
    static void main(String[] args) {

        // Wrapper classes = Allow primitive values (int, char, double, boolean)
//                   to be used as objects. "Wrap them in an object"
//                   Generally, don't wrap primitives unless you need an object.
//                   Allows use of Collections Framework and static Utility Methods.

        // METHOD TO CREATE WRAPPER CLASSES
        // Modern approach is Autoboxing
        // but we use different way
/*
        Integer a = new Integer(123);
        Double b = new Double(3.14);
        Character c = new Character('$');
        Boolean d = new Boolean(true);

        // Moder way or AutoBoxing

        // we are directly assigning these primitives into an object using a wrapper
        // class

        Integer e = 123;
        Double f = 3.14;
        Character g ='$';
        Boolean h = true;
        String i = "Harsh";

        // UnBoxing
        // We're taking a primitive that's wrapped in an object
        // and unboxing it or unwrapping it and setting it back to its primitive
        int j = e;
        double k = f;
        char l = g;
        boolean m = h;

         Wrapper classes provide a static .toString() method to convert primitives to strings.
Example: String s = Integer.toString(123);
 */

        /*
String a = Integer.toString(123);
String b= Double.toString(3.14);
String c = Character.toString('@');
String d = Boolean.toString(false);

String x = a + b + c + d;

        System.out.println(x);

         */

        // another method is called PARSING

        /*
        int a = Integer.parseInt("123");
        double b = Double.parseDouble("3.14");
        char c = "Pizza".charAt(0); // built in methods for strings
        boolean d = Boolean.parseBoolean("true");

        String x = a + b + c + d;

        System.out.println(x);

         */

        // OTHER MISCELLANEOUS UTILITY METHODS within wrapper classes

        char letter = 'B';

    // Some of these Utility methods of Character wrapper class would be great for verifying user input
        // like Username or password

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));


    }
}

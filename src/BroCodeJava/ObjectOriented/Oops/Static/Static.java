package BroCodeJava.ObjectOriented.Oops.Static;

public class Static {
    static void main(String[] args) {
        // static = Makes a variable or method belong to the class
//          rather than to any specific object.
//          Commonly used for utility methods or shared resources.

        Friend friend1 = new Friend("Shubh");
        Friend friend2 = new Friend("Akshat");
        Friend friend3 = new Friend("Aditya");
        Friend friend4 = new Friend("Saaransh");
        Friend friend5 = new Friend("Sandeep");

/*
        System.out.println(friend1.numOfFriends);
        System.out.println(friend2.numOfFriends);
        System.out.println(friend3.numOfFriends);

 */

       // System.out.println(Friend.numOfFriends);

     //   Friend.showFriends();


        // Another place in which you see static members is through the maths class

       // Math.round(3.99); // Hover over math and jump to source
    }
}

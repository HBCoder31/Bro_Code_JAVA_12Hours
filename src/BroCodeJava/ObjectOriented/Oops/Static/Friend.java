package BroCodeJava.ObjectOriented.Oops.Static;

public class Friend {

    static int  numOfFriends;
    String name;

    Friend ( String name){
        this.name = name;
        numOfFriends++;
    }

    static void showFriends(){
        System.out.println("You have " + numOfFriends + " total friends"); // If we are working with static attributes we don't use "this"
    }
}

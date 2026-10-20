package BroCodeJava.ObjectOriented.Oops.Super;

public class Person { // It is superclass

    String first;
    String last;

    Person(String first, String last){
        this.first = first;
        this.last = last;
    }

    void showName(){
        System.out.println(this.first + " " + this.last);
    }
}

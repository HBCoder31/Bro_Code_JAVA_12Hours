package BroCodeJava.ObjectOriented.Oops.Inheritance;

public class Dog extends Animal {                  // Animal class will be the parent class
                                    // To inherit all the attributes and methods from another class
                                    // After the class name we will use extends keyword

    // Each child class can have unique attributes and methods too

    int lives = 1;
    void speak(){
        System.out.println("The dog goes *woof*");
    }
}

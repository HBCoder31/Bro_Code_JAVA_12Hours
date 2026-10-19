package BroCodeJava.ObjectOriented.Oops;

public class Car { // object = car here

    String make = "Dodge";
    String model = "Challenger";
    int year = 2026;
    double price = 40000.99;
    boolean isRunning = false;

    // things above  are known as attributes which an object has

    void start(){ // these are methods start, stop, etc.
        isRunning = true;
        System.out.println("You start the engine");
    }
    void stop(){
        isRunning = false;
        System.out.println("You stop the engine");
    }

    void drive(){
        System.out.println("You drive the " + model ); // used string concatenation, concatenate model of the car
    }

    void brake(){
        System.out.println("You brake the " + model);
    }

}

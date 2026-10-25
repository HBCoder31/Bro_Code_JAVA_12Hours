package BroCodeJava.ObjectOriented.Oops.Composition;

public class Main {
    static void main(String[] args) {
        // Composition = Represents a "part-of" relationship between objects.
//               For example, an Engine is "part of" a Car.
//               Allows complex objects to be constructed from smaller objects.

        Car car = new Car("Sierra", 2026, "1.5L Revotron Naturally Aspirated Petrol");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type); // To access engine

        car.start();
    }
}

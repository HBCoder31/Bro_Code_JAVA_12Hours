package BroCodeJava.ObjectOriented.Oops.Polymorphism;

public class Main {
    static void main(String[] args) {
        // Polymorphism = "POLY" = "MANY"
//                "MORPH" = "SHAPE"
//                Objects can identify as other objects.
//                Objects can be treated as objects of a common superclass.
        // Polymorphism can also be achieved using interfaces
        // A dog can be identified as a Dog, ALSO as animal, also as organism, also as object

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car, bike, boat};


        for (Vehicle vehicle : vehicles){
            vehicle.go();
        }

      //  car.go();
      //  bike.go();
       // boat.go();

    }
}

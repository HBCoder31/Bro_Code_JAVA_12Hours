package BroCodeJava.ObjectOriented.Oops.ToString;

public class ToString {
    static void main(String[] args) {

        // .toString() = Method inherited from the Object class.
//              Used to return a string representation of an object.
//              By default, it returns a hash code as a unique identifier.
//              It can be overridden to provide meaningful details.

        Car car1 = new Car("Dodge", "Challenger", 2025, "Blue");
         Car car2 = new Car("Hyundai", "Xcent", 2016, "White");
        System.out.println(car1);
        System.out.println(car2);

       // System.out.println(car.color + " " + car.year + " " + car.make + " " + car.model);


    }
}

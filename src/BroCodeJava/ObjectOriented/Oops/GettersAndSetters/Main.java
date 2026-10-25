package BroCodeJava.ObjectOriented.Oops.GettersAndSetters;

public class Main {
    static void main(String[] args) {

        // They help protect object data and add rules for accessing or modifying them.
// GETTERS = Methods that make a field READABLE. Use get to read
// SETTERS = Methods that make a field WRITEABLE. Use set to write

        Car car = new Car("Charger", "Yellow", 10000);


     car.setColor("Blue");
     car.setPrice( -5000);

        System.out.print(car.getColor() + " " + car.getModel() + " " + car.getPrice());

    }
}

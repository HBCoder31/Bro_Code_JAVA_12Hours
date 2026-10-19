package BroCodeJava.ObjectOriented.Oops;

public class Oops1 {
    static void main(String[] args) {
        // Object = An entity that holds data ( attributes)
        //          and can perform actions ( methods)
        //          It is a reference data type
        //             they are stored in heap
        //          class serves as a blueprint to create object
/*
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

 */
            // Now to create a car object, we will utilize car class
        Car car1 = new Car();
        Car car2 = new Car();

        // now we have a car object we can use
         // If we need to access the attributes from car class
                                        // we need to follow the object name with "." DOT OPERATOR
        // it allows us to access things within an object

        // car.isRunning = true;
         // We can change it here also
        /*
        //System.out.println(car.model);
        System.out.println(car.make);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);

         */

        /*
        System.out.println(car.isRunning);
         car.start();
        System.out.println(car.isRunning);
         car.stop();
        System.out.println(car.isRunning);

         */
       /*
        car.drive();
        car.brake();

        */

        System.out.println(car1.make + " " + car1.model);
        System.out.println(car2.make + " " + car2.model);

        // Video part 39 is important
    }
}

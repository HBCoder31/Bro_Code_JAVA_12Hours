package BroCodeJava.ObjectOriented.Oops.Array_Of_Objects;

public class Array_of_objects {
    static void main(String[] args) {
        /*
        Car car1 = new Car("Santro", "Silver");
        Car car2 = new Car("Xcent", "White");
        Car car3 = new Car("Sierra", "Yellow");


         */



      //  Car[] cars = new Car[3];
    // OR
      //  Car[] cars = {car1, car2, car3};
        // OR
        // WE CAN PASS IN ANONYMOUS OBJECTS RATHER THAN FIRST INSTANTIATING THE OBJECTS THEN ASSIGNING THEM TO ARRAY
        Car[] cars = {new Car("Santro", "Silver"),
                       new Car("Xcent", "White"),
                        new Car("Sierra", "Yellow") };
       /*
       Enhanced for loops will be better
        for (int i = 0; i < cars.length; i++){
            cars[i].drive();
        }

        */
        /*
        for(Car car : cars){
            car.drive();
        }

         */

        for(Car car : cars){
            car.color = "black";
        }

        for(Car car : cars){
            car.drive();
        }
    }
}

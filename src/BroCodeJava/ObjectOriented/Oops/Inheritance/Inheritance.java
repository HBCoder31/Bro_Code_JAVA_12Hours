package BroCodeJava.ObjectOriented.Oops.Inheritance;

public class Inheritance {
    static void main(String[] args) {
        // Inheritance = One class inherits the attributes and methods
//               from another class.
//               Child <- Parent <- Grandparent

       Dog dog = new Dog();
       Cat cat = new Cat();
       Plant plant = new Plant();

       // System.out.println(dog.isAlive);
        //System.out.println(cat.isAlive);

        plant.photosynthesis();

        System.out.println( dog.isAlive);
        System.out.println(cat.isAlive);

        dog.eat();
        cat.eat();

        System.out.println(dog.lives);
        System.out.println(cat.lives);

        dog.speak();
        cat.speaks();

    }

}

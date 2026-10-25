package BroCodeJava.ObjectOriented.Oops.Abstraction;

public abstract class Shape { // Shape class will be abstract , we can't create any shape objects

    abstract double area(); // ABSTRACT

    void display(){ // CONCRETE
        System.out.println("This is a shape");
    }
}

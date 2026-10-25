package BroCodeJava.ObjectOriented.Oops.Abstraction;

public class Abstraction {
    static void main(String[] args) {

        // abstract = Used to define abstract classes and methods.
        // We acn make classes and methods abstract using  'abstract' keyword
//            Abstraction is the process of hiding implementation details
//            and showing only the essential features;
        // Example if I am teaching someone how to drive car, I am not going to open
        // the hood of the car and explain and how the engines work
        // I'm instead going to tell the user that the Accelerator is to drive and Brake is to stop the car
//            Abstract classes CAN'T be instantiated directly
//            Can contain 'abstract' methods (which must be implemented)
//            Can contain 'concrete' methods (which are inherited)

//Shape shape = new Shape(); // Shape is abstract, since shape is abstract so we can't any objects from this class , it is little
                            // bit of security to our program, we don't want anybody generic shape objects
                            // we want them to create certain kind of shape
Circle circle = new Circle(3);
Triangle triangle = new Triangle(4,5);
Rectangle rectangle = new Rectangle(6,7);

circle.display();
triangle.display();
rectangle.display();

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}

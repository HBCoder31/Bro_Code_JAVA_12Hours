package BroCodeJava.ObjectOriented.Oops.Constructor;

public class Studentjava {
    static void main(String[] args) {

        // constructor = A special method to initialize objects
        //                  You can pass arguments to a constructor
        //                  and set up initial values
        // constructor is automatically called when you create a new object
        // But you need a matching set of arguments if a parameter is set up
        // By constructors we can create objects with unique values

        Student student1 = new Student("Spongebob", 30 , 3.2);
        Student student2 = new Student("Harsh", 20, 3.4);
        Student student3 = new Student("Gandu", 21, 3.8);

        /*
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println(stduent2.name);
        System.out.println(stduent2.age);
        System.out.println(stduent2.gpa);
        System.out.println(stduent2.isEnrolled);

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);

         */

        student1.study();
        student2.study();
        student3.study();

    }



}

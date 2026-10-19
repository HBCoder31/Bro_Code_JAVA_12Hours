package BroCodeJava.ObjectOriented.Oops.Constructor;

public class Student {

    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    // what if we want to give each object a unique name
    // We can do it using constructor
    // A constructor is just a special method within a class


    // To set UP CONSTRUCTOR

    Student(String name, int age, double gpa){
    this.name = name;                // To assign these attributes we use "this.'name of the attribute"
        this.age = age;                 //this refers to the object we are currently working with
        this.gpa = gpa;
        this.isEnrolled = true;
    }
    void study(){
        System.out.println(this.name + " is studying.");
    }

}

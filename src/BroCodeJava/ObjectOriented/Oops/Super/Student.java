package BroCodeJava.ObjectOriented.Oops.Super;

public class Student extends Person {

    double gpa;

    Student(String first, String last, double gpa){
        // If parent don't have below attributes we don't need super keyword
       super(first, last);
        this.gpa = gpa;
    }

    void showGPA(){
        System.out.println(this.first + "'s gpa is: " + this.gpa);
    }
}

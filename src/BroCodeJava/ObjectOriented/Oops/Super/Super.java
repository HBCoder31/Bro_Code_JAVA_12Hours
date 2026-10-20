package BroCodeJava.ObjectOriented.Oops.Super;

public class Super {
    static void main(String[] args) {
        // super = Refers to the parent class (subclass <- superclass)
//         Used in constructors and method overriding
//         Calls the parent constructor to initialize attributes

        Person person = new Person("Tom", "Cruise");
        Student student = new Student("Tom", "Huddleston", 3.45);
        Employee employee = new Employee("Rajkumar", "Rao", 50000);
        person.showName();
        student.showName();
        System.out.println(student.gpa);

        student.showGPA();
        employee.showSalary();

    }
}

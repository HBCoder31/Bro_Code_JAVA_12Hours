package BroCodeJava.ObjectOriented.Oops.Method_Overriding;

public class Fish extends Animal{

    @Override // Adding the @OVerride annotation provides a system of checks and balances
    void move(){
        System.out.println("This animal is swimming");
    }
}

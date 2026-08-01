package BroCodeJava;

public class VariableScope {

    static int x =3; // CLASS


    static void main(String[] args) {

        // variable scope = where a variable can be accessed

         int x = 1; // local variable

        System.out.println(x);
        doSomething(); // java want to use local variable first instead of class variable
    }
    static void doSomething(){
        int x = 2;// LOCAL
        System.out.println(x);
    }
}
//anything with the local scope is declared inside of a method or otherwise within a set of curly braces
// 4:30:0
// some important lines are there
// I am lazy I will not write those 🥲
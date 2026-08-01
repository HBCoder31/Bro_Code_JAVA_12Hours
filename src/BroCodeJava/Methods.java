package BroCodeJava;

public class Methods {
    public static void main(String[] args) {

        // method = a block of reusable code that is executed when called()

        // D.R.Y principle =  Don't Repeat Yourself
        String name = "Nigga";
        int age = 12;

        happyBirthday(name, age);// calling method


        System.out.println(square(3));
        System.out.println(cube(3));
        String fullName = getFullName("SpongeBob", "Squarepats");
        System.out.println(fullName);
        if(ageCheck(age)){
            System.out.println("You may sign up");
        } else{
            System.out.println("You must be 18+ to sign up");
        }

    }
    static void happyBirthday(String name, int age){ // Creating method // parameters
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!\n");
    }
    static double square (double number){
        return number * number;

    }
     static double cube( double number){
        return number * number * number;
     }
     static String getFullName(String first, String last){
        return first + " "+  last; // return keyword returns a value in methods

         }
    static boolean ageCheck(int age){
        if (age >= 18){
            return true;
        }
        else {
            return false;
        }
     }
}

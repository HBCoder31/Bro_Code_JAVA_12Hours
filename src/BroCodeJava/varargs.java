package BroCodeJava;

public class varargs {
    static void main(String[] args) {
// variable arguments ( varargs) = allow a method to accept a varying # of arguments
        //  makes methods more flexible, no need for overloaded methods
        //   java will pack the arguments into an array -> ... (ellipsis)

        // overloaded methods are the methods which share the same name but have different parameters
       // System.out.println(add(1 ,2 ,3 ,4, 5,6, 7));
        System.out.println(average());
    }
    static double average(double... numbers){

        double sum = 0;

        if(numbers.length == 0){
            return 0;
        }

        // enhanced for loop
        for(double number : numbers){
            sum += number;
        }
        return sum / numbers.length;
    }
   /* static int add(int...numbers){ // Java compiler packing all of these arguments into an array when we send them to a method

        int sum = 0;
        //enhanced for loops
        for(int number : numbers){
            sum += number;
        }
        return sum;

    */
    }



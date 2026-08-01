package BroCodeJava;

import java.util.Arrays;

public class array {
    static void main(String[] args) {

        // array = a collection of values of teh same data type
        //         * think of it as a variable that can store more than 1 value *

        String[] fruits = {"apple", "orange", "mango", "melons", "banana" };

        // to change value at specific index

        //fruits[0] = "pineapple";

        // length of an array

//        int numOfFruits = fruits.length;

       // System.out.println(numOfFruits);

        // to display all elemnts of array we will use for loop

        /*for (int i = 0; i < fruits.length; i++){
            System.out.print(fruits[i] + " ");
        }

         */

        // sorting an array
      //  Arrays.sort(fruits);

        // Array fill method
        Arrays.fill(fruits, "pineapple");
        // Enhanced for loop
// 4 each loop
        for (String fruit : fruits){
            System.out.println(fruit);
        }




    }
}

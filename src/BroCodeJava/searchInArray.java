package BroCodeJava;

import java.util.Scanner;

public class searchInArray {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = {1,6,78,84,12,23};
        String[] fruits = {"apple", "banana", "orange"};
        String target;
        System.out.print("Enter a fruit to search for: ");
        target = scanner.nextLine();
        boolean isFound = false;

        for(int i = 0; i < fruits.length; i++){
            if(fruits[i].equals(target)){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }
        if (!isFound){
            System.out.println("Element not found in the array. ");
        }
        scanner.close();
    }
}

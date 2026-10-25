package BroCodeJava.Codes;

public class arrays_2d {
    static void main(String[] args) {

         //2d arrays = an array where each element is an array
        //          Useful for storing a matrix of data


        // Making 2d arrays

        //method 1
        /*
        String[] fruits = {"Apple","Orange","Banana"};
        String[] vegetables = {"LadyFinger", "Carrot", "Radish"};
        String[] DairyProducts = {"Paneer","Ice-Cream","Buttermilk"}; // these are 1d arrays

        String[][] groceries = {fruits, vegetables, DairyProducts};

            output would be same

         */
        //method 2
    /*    String[][] groceries = {{"Apple","Orange","Banana"},
                {"LadyFinger", "Carrot", "Radish"},
                {"Paneer","Ice-Cream","Buttermilk"}};

        groceries[2][1] = "Butter"; // [row][column]

        for(String[] foods : groceries){
            for(String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }

     */

        //Making Number pad that are in phone

        char[][] telephone = {{'1','2','3'},
                                {'4','5','6'},
                                    {'7','8','9'},
                                       {'*', '0', '#'}};

        for(char[] row : telephone){
            for(char number : row){
                System.out.print(number + " ");

            }
            System.out.println();
        }


    }
}

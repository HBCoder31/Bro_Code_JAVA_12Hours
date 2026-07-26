package BroCodeJava;

public class printf {
    static void main(String[] args) {

        // printf() = is a method used to format output

        // %[flags] [ width] [.precision] [ specifier- character]

       /* String name = "SpiderMan";
        char firstLetter = 'S';
        int age = 25;
        double height = 170.5;
        boolean isHero = true;

        System.out.printf("Hello %s\n", name  );
        System.out.printf("Your name starts with a %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("You are %.2f cms tall\n", height);
        System.out.printf("Hero: %b\n", isHero);

        System.out.printf("%s is %d years old", name, age);

        */
        double price1 = 90.99;
        double price2 = 923.922339;
        double price3 = -19.9922;
        // + = output a plus
        // , = comma grouping separator
        // ( = negative numbers are enclosed in ()
        // space = display a minus id negative, space is positive

        System.out.printf("% .2f\n", price1);
        System.out.printf("% .2f\n", price2);
        System.out.printf("% .2f\n", price3);


        // [width]
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 19;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);



    }



}

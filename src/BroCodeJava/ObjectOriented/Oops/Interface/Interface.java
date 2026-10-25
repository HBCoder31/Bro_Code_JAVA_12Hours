package BroCodeJava.ObjectOriented.Oops.Interface;

import BroCodeJava.Codes.RandomClass;

public class Interface {
    static void main(String[] args) {
        // Interface = A blueprint for a class that specifies a set of abstract methods
//             that implementing classes MUST define.
//             Supports multiple inheritance-like behavior.
//             By using interface a class can have multiple parents

        rabbit rabbit = new rabbit();
        hawk hawk = new hawk();
        fish fish = new fish();

      //  rabbit.flee();
     //   hawk.hunt();
        fish.flee();
        fish.hunt();
    }
}

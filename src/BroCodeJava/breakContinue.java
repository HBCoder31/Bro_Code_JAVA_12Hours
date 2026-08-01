package BroCodeJava;

public class breakContinue {
    static void main(String[] args) {
        // break = break out of a loop (STOP)
        //continue = skip current iteration of a loop (SKIP)

        for (int i = 0; i < 10; i++){

            if (i ==  5){
                continue; // 5 will be missing in output
            }
            System.out.print(i + " ");
        }
    }
}

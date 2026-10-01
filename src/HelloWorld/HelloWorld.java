package HelloWorld;

import java.util.Scanner;

public class HelloWorld {
    static void main() {
        System.out.println("Hello World!");
        System.out.println("How are you today?");

        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();
        if (word.equals("God")) {
            System.out.println("Happy to hear that!");

        }else {
            System.out.println("Hope you day gets better?");
        }

    }
}

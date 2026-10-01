package HelloWorld;

import java.util.Scanner;

public class HelloWorld {
    static void main() {
        System.out.println("Hello World!");
        System.out.println("How are you today?");

        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine().toLowerCase();
        if (word.equals("good")) {
            System.out.println("Happy to hear that!");

        }else {
            System.out.println("Hope your day gets better?");
        }

    }
}

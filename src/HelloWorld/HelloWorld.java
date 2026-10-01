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

        } else {
            System.out.println("Hope your day gets better?");
        }

        System.out.println("How old are you?");

        Scanner scan2 = new Scanner(System.in);
        int number = scan2.nextInt();


        if (number >= 18) {
            System.out.println("Welcome");
            Scanner scan3 = new Scanner(System.in);

            System.out.println("Which country are you from");
            String word2 = scan3.nextLine();
            System.out.println(word2 + " is a nice country to live in");
        } else {
            System.out.println("You are to young to enter this webpage");

        }





    }
}


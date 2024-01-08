package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void nameRequest() {
        System.out.print("May I have your name? ");
        var in = new Scanner(System.in);
        String name = in.next();
        System.out.println("Hello, " + name + "!");
    }
}

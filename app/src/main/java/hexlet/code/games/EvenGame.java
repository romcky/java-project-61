package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;
public class EvenGame {
    public static boolean run(int count) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        var rand = new Random();
        var in = new Scanner(System.in);
        while (count > 0) {
            int x = rand.nextInt(100);
            System.out.println("Question: " + x);
            System.out.print("Your answer: ");
            String answer = in.next();
            if (x % 2 == 0 && !answer.equals("yes")) {
                System.out.println("'" + answer + "' is wrong answer. Correct answer was 'yes'.");
                return false;
            }
            if (x % 2 == 1 && !answer.equals("no")) {
                System.out.println("'" + answer + "' is wrong answer. Correct answer was 'no'.");
                return false;
            }
            System.out.println("Correct!");
            count--;
        }
        return true;
    }
}


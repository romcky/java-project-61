package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println(GREET + " - Greet");
        System.out.println(EVEN + " - Even");
        System.out.println(CALC + " - Calc");
        System.out.println(GCD + " - GCD");
        System.out.println(PROGRESSION + " - Progression");
        System.out.println(PRIME + " - Prime");
        System.out.println(EXIT + " - Exit");
        System.out.print("Your choice: ");

        Scanner in = new Scanner(System.in);
        int gameNumber = in.nextInt();
        if (gameNumber == EXIT) {
            return;
        }

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = in.next();
        System.out.println("Hello, " + userName + "!");
        if (gameNumber == GREET) {
            return;
        }

        boolean gameResult = Engine.startGame(gameNumber);
        String gameMessage = gameResult ? "Congratulations, " : "Let's try again, ";
        gameMessage += userName + "!";
        System.out.println(gameMessage);
    }

    public static final int EXIT = 0;
    public static final int GREET = 1;
    public static final int EVEN = 2;
    public static final int CALC = 3;
    public static final int GCD = 4;
    public static final int PROGRESSION = 5;
    public static final int PRIME = 6;
}

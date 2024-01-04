package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        Scanner in = new Scanner(System.in);
        int gameNumber = in.nextInt();
        if (gameNumber == 0) {
            return;
        }

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = in.next();
        System.out.println("Hello, " + userName + "!");
        if (gameNumber == 1) {
            return;
        }

        boolean gameResult = false;
        switch (gameNumber) {
            case 2:
                gameResult = Engine.startGame(new EvenGame());
                break;
            case 3:
                gameResult = Engine.startGame(new CalcGame());
                break;
            case 4:
                gameResult = Engine.startGame(new GCDGame());
                break;
            case 5:
                gameResult = Engine.startGame(new ProgressionGame());
                break;
            case 6:
                gameResult = Engine.startGame(new PrimeGame());
                break;
        }

        String gameAnswer = gameResult ? "Congratulations, " : "Let's try again, ";
        gameAnswer += userName + "!";
        System.out.println(gameAnswer);
    }
}

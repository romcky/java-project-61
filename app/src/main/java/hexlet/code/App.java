package hexlet.code;

import hexlet.code.games.EvenGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
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
                gameResult = EvenGame.run(3);
                break;
        }

        String gameAnswer = gameResult ? "Congratulations, " : "Let's try again, ";
        gameAnswer += userName + "!";
        System.out.println(gameAnswer);
    }
}

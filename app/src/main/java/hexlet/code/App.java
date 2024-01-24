package hexlet.code;

import hexlet.code.games.EvenGame;
import hexlet.code.games.CalcGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;
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
        String gameChoice = in.next();

        switch (gameChoice) {
            case "0":
                break;
            case "1":
                Cli.greetUser();
                break;
            case "2":
                EvenGame.startGame();
                break;
            case "3":
                CalcGame.startGame();
                break;
            case "4":
                GCDGame.startGame();
                break;
            case "5":
                ProgressionGame.startGame();
                break;
            case "6":
                PrimeGame.startGame();
                break;
            default:
                System.out.println("Wrong choice, try again!");
        }
    }
}

package hexlet.code;

import hexlet.code.games.EvenGame;
import hexlet.code.games.CalcGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.ProgressionGame;
import hexlet.code.games.PrimeGame;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final int countOfRounds = 3;

        final String infoEven = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        final String infoCalc = "What is the result of the expression?";
        final String infoGCD = "Find the greatest common divisor of given numbers.";
        final String infoPrime = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        final String infoProgression = "What number is missing in the progression?";

        final int choiceGreet = 1;
        final int choiceEven = 2;
        final int choiceCalc = 3;
        final int choiceGCD = 4;
        final int choiceProgression = 5;
        final int choicePrime = 6;
        final int choiceExit = 0;

        System.out.println("Please enter the game number and press Enter.");
        System.out.println(choiceGreet + " - Greet");
        System.out.println(choiceEven + " - Even");
        System.out.println(choiceCalc + " - Calc");
        System.out.println(choiceGCD + " - GCD");
        System.out.println(choiceProgression + " - Progression");
        System.out.println(choicePrime + " - Prime");
        System.out.println(choiceExit + " - Exit");
        System.out.print("Your choice: ");

        Scanner in = new Scanner(System.in);
        int gameNumber = in.nextInt();
        if (gameNumber == choiceExit) {
            return;
        }

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = in.next();
        System.out.println("Hello, " + userName + "!");
        if (gameNumber == choiceGreet) {
            return;
        }

        boolean gameResult = false;
        switch (gameNumber) {
            case choiceEven:
                EvenGame.generate(countOfRounds);
                gameResult = Engine.startGame(infoEven, EvenGame.getQuestionsAndAnswers());
                break;
            case choiceCalc:
                CalcGame.generate(countOfRounds);
                gameResult = Engine.startGame(infoCalc, CalcGame.getQuestionsAndAnswers());
                break;
            case choiceGCD:
                GCDGame.generate(countOfRounds);
                gameResult = Engine.startGame(infoGCD, GCDGame.getQuestionsAndAnswers());
                break;
            case choicePrime:
                PrimeGame.generate(countOfRounds);
                gameResult = Engine.startGame(infoPrime, PrimeGame.getQuestionsAndAnswers());
                break;
            case choiceProgression:
                ProgressionGame.generate(countOfRounds);
                gameResult = Engine.startGame(infoProgression, ProgressionGame.getQuestionsAndAnswers());
                break;
            default:
        }

        String gameMessage = gameResult ? "Congratulations, " : "Let's try again, ";
        gameMessage += userName + "!";
        System.out.println(gameMessage);
    }
}

package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.*;

public class Engine {
    public static boolean startGame(int gameNumber) {
        String[][] questionsAndAnswers;
        switch (gameNumber) {
            case App.EVEN:
                System.out.println(EvenGame.getCaption());
                questionsAndAnswers = EvenGame.generate(ROUNDS);
                break;
            case App.CALC:
                System.out.println(CalcGame.getCaption());
                questionsAndAnswers = CalcGame.generate(ROUNDS);
                break;
            case App.GCD:
                System.out.println(GCDGame.getCaption());
                questionsAndAnswers = GCDGame.generate(ROUNDS);
                break;
            case App.PRIME:
                System.out.println(PrimeGame.getCaption());
                questionsAndAnswers = PrimeGame.generate(ROUNDS);
                break;
            case App.PROGRESSION:
                System.out.println(ProgressionGame.getCaption());
                questionsAndAnswers = ProgressionGame.generate(ROUNDS);
                break;
            default:
                return false;
        }

        var in = new Scanner(System.in);
        for (int i = 0; i < ROUNDS; i++) {
            System.out.println("Question: " + questionsAndAnswers[i][0]);
            System.out.print("Your answer: ");
            String answer = in.next();
            if (!answer.equals(questionsAndAnswers[i][1])) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" +
                        questionsAndAnswers[i][1] + "'.");
                return false;
            }
            System.out.println("Correct!");
        }
        return true;
    }

    private static final int ROUNDS = 3;
}


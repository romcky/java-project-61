package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class PrimeGame {
    public static final String INFO = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MINVALUE = 1;
    private static final int MAXVALUE = 100;
    public static String[] generatePair(int a) {
        String question = String.valueOf(a);
        int d = a - 1;
        while (d > 0 && a % d != 0) {
            d--;
        }
        String answer = (d > 1) ? "no" : "yes";
        return new String[]{question, answer};
    }
    public static String[][] generate(int cnt) {
        var questionsAndAnswers = new String[cnt][];
        for (int i = 0; i < cnt; i++) {
            int a = Utils.generateNumber(MINVALUE, MAXVALUE);
            questionsAndAnswers[i] = generatePair(a);
        }
        return questionsAndAnswers;
    }

    public static void startGame() {
        Engine.runGame(INFO, generate(Engine.ROUNDSCNT));
    }
}

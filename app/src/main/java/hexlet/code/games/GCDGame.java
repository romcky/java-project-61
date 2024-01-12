package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCDGame {
    public static final String INFO = "Find the greatest common divisor of given numbers.";
    private static final int MINVALUE = 1;
    private static final int MAXVLAUE = 100;
    public static String[] generate() {
        int a = Utils.generateNumber(MINVALUE, MAXVLAUE);
        int b = Utils.generateNumber(MINVALUE, MAXVLAUE);
        String question = String.valueOf(a) + " " + String.valueOf(b);
        int gcd = Math.min(a, b);
        while (a % gcd != 0 || b % gcd != 0) {
            gcd--;
        }
        String answer = String.valueOf(gcd);
        return new String[]{question, answer};
    }
    public static String[][] generate(int cnt) {
        var questionsAndAnswers = new String[cnt][];
        for (int i = 0; i < cnt; i++) {
            questionsAndAnswers[i] = generate();
        }
        return questionsAndAnswers;
    }
    public static void startGame() {
        Engine.runGame(INFO, generate(Engine.ROUNDSCNT));
    }
}

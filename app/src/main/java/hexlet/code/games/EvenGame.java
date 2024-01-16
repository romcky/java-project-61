package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class EvenGame {
    public static final String INFO = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MINVALUE = 1;
    private static final int MAXVALUE = 100;
    public static String[] generatePair(int x) {
        String question = String.valueOf(x);
        String answer = (x % 2 == 0) ? "yes" : "no";
        return new String[]{question, answer};
    }
    public static String[][] generate(int cnt) {
        var questionsAndAnswers = new String[cnt][];
        for (int i = 0; i < cnt; i++) {
            int x = Utils.generateNumber(MINVALUE, MAXVALUE);
            questionsAndAnswers[i] = generatePair(x);
        }
        return questionsAndAnswers;
    }
    public static void startGame() {
        Engine.runGame(INFO, generate(Engine.ROUNDSCNT));
    }
}

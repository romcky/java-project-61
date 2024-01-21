package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class EvenGame {
    public static final String INFO = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MINVALUE = 1;
    private static final int MAXVALUE = 1000;

    public static boolean isEven(int x) {
        return x % 2 == 0;
    }

    public static String[][] generateData(int cnt) {
        var data = new String[cnt][];
        for (int i = 0; i < cnt; i++) {
            int x = Utils.generateNumber(MINVALUE, MAXVALUE);
            String question = String.valueOf(x);
            String answer = isEven(x) ? "yes" : "no";
            data[i] = new String[] {question, answer};
        }
        return data;
    }

    public static void startGame() {
        Engine.runGame(INFO, generateData(Engine.ROUNDSCNT));
    }
}

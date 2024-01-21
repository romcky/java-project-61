package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCDGame {
    public static final String INFO = "Find the greatest common divisor of given numbers.";
    private static final int MINVALUE = 1;
    private static final int MAXVLAUE = 100;

    public static int gcd(int a, int b) {
        int g = Math.min(a, b);
        while (a % g != 0 || b % g != 0) {
            g--;
        }
        return g;
    }

    public static String[][] generateData(int cnt) {
        var data = new String[cnt][];
        for (int i = 0; i < cnt; i++) {
            int a = Utils.generateNumber(MINVALUE, MAXVLAUE);
            int b = Utils.generateNumber(MINVALUE, MAXVLAUE);
            String question = String.valueOf(a) + " " + String.valueOf(b);
            String answer = String.valueOf(gcd(a, b));
            data[i] = new String[] {question, answer};
        }
        return data;
    }

    public static void startGame() {
        Engine.runGame(INFO, generateData(Engine.ROUNDSCNT));
    }
}

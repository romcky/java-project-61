package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class PrimeGame {
    public static final String INFO = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MINVALUE = 1;
    private static final int MAXVALUE = 100;

    public static boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i <= Math.round(Math.sqrt(x)); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String[][] generateData(int cnt) {
        var data = new String[cnt][];
        for (int i = 0; i < cnt; i++) {
            int x = Utils.generateNumber(MINVALUE, MAXVALUE);
            String question = String.valueOf(x);
            String answer = isPrime(x) ? "yes" : "no";
            data[i] = new String[] {question, answer};
        }
        return data;
    }

    public static void startGame() {
        Engine.runGame(INFO, generateData(Engine.ROUNDSCNT));
    }
}

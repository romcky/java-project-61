package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class CalcGame {
    public static final String INFO = "What is the result of the expression?";
    private static final int MINVALUE = 0;
    private static final int MAXVALUE = 100;
    private static final char[] OPERATORS = {'+', '-', '*'};
    private static final int MAXOP = 2;

    public static int calc(int a, int b, char op) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            default:
                return a * b;
        }
    }

    public static String[][] generateData(int cnt) {
        var data = new String[cnt][];
        for (int i = 0; i < cnt; i++) {
            int a = Utils.generateNumber(MINVALUE, MAXVALUE);
            int b = Utils.generateNumber(MINVALUE, MAXVALUE);
            char op = OPERATORS[Utils.generateNumber(MAXOP)];
            String question = String.valueOf(a) + " " + op + " " + String.valueOf(b);
            String answer = String.valueOf(calc(a, b, op));
            data[i] = new String[] {question, answer};
        }
        return data;
    }

    public static void startGame() {
        Engine.runGame(INFO, generateData(Engine.ROUNDSCNT));
    }
}

package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class CalcGame {
    public static final String INFO = "What is the result of the expression?";
    private static final int MINVALUE = 0;
    private static final int MAXVALUE = 100;
    private static final char[] OPERATORS = {'+', '-', '*'};
    private static final int MAXOP = 2;
    public static String[] generatePair(int a, int b, char op) {
        String question = String.valueOf(a) + " " + op + " " + b;
        String answer = "";
        switch (op) {
            case '+':
                answer = String.valueOf(a + b);
                break;
            case '-':
                answer = String.valueOf(a - b);
                break;
            default:
                answer = String.valueOf(a * b);
                break;
        }
        return new String[]{question, answer};
    }
    public static String[][] generate(int cnt) {
        var questionsAndAnswers = new String[cnt][];
        for (int i = 0; i < cnt; i++) {
            int a = Utils.generateNumber(MINVALUE, MAXVALUE);
            int b = Utils.generateNumber(MINVALUE, MAXVALUE);
            char op = OPERATORS[Utils.generateNumber(MINVALUE, MAXOP)];
            questionsAndAnswers[i] = generatePair(a, b, op);
        }
        return questionsAndAnswers;
    }
    public static void startGame() {
        Engine.runGame(INFO, generate(Engine.ROUNDSCNT));
    }
}

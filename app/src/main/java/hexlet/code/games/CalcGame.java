package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class CalcGame {
    public static final String INFO = "What is the result of the expression?";
    private static final int MINVALUE = 0;
    private static final int MAXVALUE = 100;
    public static String[] generate() {
        int a = Utils.generateNumber(MINVALUE, MAXVALUE);
        int b = Utils.generateNumber(MINVALUE, MAXVALUE);
        char[] operators = {'+', '-', '*'};
        char operator = operators[Utils.generateNumber(MINVALUE, MAXVALUE) % operators.length];
        String question = String.valueOf(a) + " " + operator + " " + b;
        String answer = "";
        switch (operator) {
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
            questionsAndAnswers[i] = generate();
        }
        return questionsAndAnswers;
    }
    public static void startGame() {
        Engine.runGame(INFO, generate(Engine.ROUNDSCNT));
    }
}

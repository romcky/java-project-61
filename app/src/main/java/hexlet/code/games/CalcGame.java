package hexlet.code.games;

import hexlet.code.Utils;

public class CalcGame {
    private static String[][] questionsAndAnswers;
    public static String[][] getQuestionsAndAnswers() {
        return questionsAndAnswers;
    }
    public static String[] generate() {
        final int minValue = 0;
        final int maxValue = 100;
        int a = Utils.random(minValue, maxValue);
        int b = Utils.random(minValue, maxValue);
        char[] operators = {'+', '-', '*'};
        char operator = operators[Utils.random(minValue, operators.length)];
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
    public static void generate(int cnt) {
        questionsAndAnswers = new String[cnt][];
        for (int i = 0; i < cnt; i++) {
            questionsAndAnswers[i] = generate();
        }
    }
}

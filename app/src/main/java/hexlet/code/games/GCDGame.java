package hexlet.code.games;

import hexlet.code.Utils;

public class GCDGame {
    private static String[][] questionsAndAnswers;
    public static String[][] getQuestionsAndAnswers() {
        return questionsAndAnswers;
    }
    public static String[] generate() {
        final int minValue = 1;
        final int maxValue = 100;
        int a = Utils.random(minValue, maxValue);
        int b = Utils.random(minValue, maxValue);
        String question = String.valueOf(a) + " " + String.valueOf(b);
        int gcd = Math.min(a, b);
        while (a % gcd != 0 || b % gcd != 0) {
            gcd--;
        }
        String answer = String.valueOf(gcd);
        return new String[]{question, answer};
    }
    public static void generate(int cnt) {
        questionsAndAnswers = new String[cnt][];
        for (int i = 0; i < cnt; i++) {
            questionsAndAnswers[i] = generate();
        }
    }
}

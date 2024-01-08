package hexlet.code.games;

import hexlet.code.Utils;

public class PrimeGame {
    private static String[][] questionsAndAnswers;
    public static String[][] getQuestionsAndAnswers() {
        return questionsAndAnswers;
    }
    public static String[] generate() {
        final int minValue = 1;
        final int maxValue = 100;
        int a = Utils.random(minValue, maxValue);
        String question = String.valueOf(a);
        int d = a - 1;
        while (d > 0 && a % d != 0) {
            d--;
        }
        String answer = (d > 1) ? "no" : "yes";
        return new String[]{question, answer};
    }
    public static void generate(int cnt) {
        questionsAndAnswers = new String[cnt][];
        for (int i = 0; i < cnt; i++) {
            questionsAndAnswers[i] = generate();
        }
    }
}

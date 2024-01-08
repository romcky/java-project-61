package hexlet.code.games;

import hexlet.code.Utils;

public class EvenGame {
    private static String[][] questionsAndAnswers;
    public static String[][] getQuestionsAndAnswers() {
        return questionsAndAnswers;
    }
    public static String[] generate() {
        final int minValue = 1;
        final int maxValue = 100;
        int x = Utils.random(minValue, maxValue);
        String question = String.valueOf(x);
        String answer = (x % 2 == 0) ? "yes" : "no";
        return new String[]{question, answer};
    }
    public static void generate(int cnt) {
        questionsAndAnswers = new String[cnt][];
        for (int i = 0; i < cnt; i++) {
            questionsAndAnswers[i] = generate();
        }
    }
}

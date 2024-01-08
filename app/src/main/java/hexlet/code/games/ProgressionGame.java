package hexlet.code.games;

import hexlet.code.Utils;

public class ProgressionGame {
    private static String[][] questionsAndAnswers;
    public static String[][] getQuestionsAndAnswers() {
        return questionsAndAnswers;
    }
    public static String[] generate() {
        final int minValue = 0;
        final int maxValue = 100;
        final int minLength = 5;
        final int maxLength = 15;
        int length = Utils.random(minLength, maxLength);
        int index = Utils.random(minValue, length);
        int start = Utils.random(minValue, maxValue);
        int step = Utils.random(minValue, maxValue);
        var builder = new StringBuilder();
        for (int j = 0; j < length; j++) {
            if (j == index) {
                builder.append("..");
            } else {
                builder.append(start + step * j);
            }
            builder.append(" ");
        }
        String question = builder.toString().trim();
        String answer = String.valueOf(start + step * index);
        return new String[]{question, answer};
    }
    public static void generate(int cnt) {
        questionsAndAnswers = new String[cnt][];
        for (int i = 0; i < cnt; i++) {
            questionsAndAnswers[i] = generate();
        }
    }
}

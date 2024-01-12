package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class ProgressionGame {
    public static final String INFO = "What number is missing in the progression?";
    private static final int MINVALUE = 0;
    private static final int MAXVALUE = 100;
    private static final int MINLENGTH = 5;
    private static final int MAXLENGTH = 15;
    public static String[] generate() {
        int length = Utils.generateNumber(MINLENGTH, MAXLENGTH);
        int index = Utils.generateNumber(MINVALUE, MAXVALUE) % length;
        int start = Utils.generateNumber(MINVALUE, MAXVALUE);
        int step = Utils.generateNumber(MINVALUE, MAXVALUE);
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

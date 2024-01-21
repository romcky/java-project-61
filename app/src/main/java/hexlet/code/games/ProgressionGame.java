package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class ProgressionGame {
    public static final String INFO = "What number is missing in the progression?";
    private static final int MINSTART = 0;
    private static final int MAXSTART = 100;
    private static final int MINSTEP = 1;
    private static final int MAXSTEP = 20;
    private static final int MINLENGTH = 5;
    private static final int MAXLENGTH = 15;

    public static String[] getProgression(int length, int start, int step) {
        String[] progression = new String[length];
        for (int i = 0; i < length; i++) {
            progression[i] = String.valueOf(start + i * step);
        }
        return progression;
    }

    public static String[][] generateData(int cnt) {
        var data = new String[cnt][];
        for (int i = 0; i < cnt; i++) {
            int length = Utils.generateNumber(MINLENGTH, MAXLENGTH);
            int index = Utils.generateNumber(length - 1);
            int start = Utils.generateNumber(MINSTART, MAXSTART);
            int step = Utils.generateNumber(MINSTEP, MAXSTEP);
            String[] progression = getProgression(length, start, step);
            String answer = new String(progression[index]);
            progression[index] = "..";
            String question = String.join(" ", progression);
            data[i] = new String[] {question, answer};
        }
        return data;
    }

    public static void startGame() {
        Engine.runGame(INFO, generateData(Engine.ROUNDSCNT));
    }
}

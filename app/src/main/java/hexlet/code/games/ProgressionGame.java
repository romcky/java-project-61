package hexlet.code.games;

import java.util.Random;

public class ProgressionGame {

    public static String getCaption() {
        return "What number is missing in the progression?";
    }

    public static String[][] generate(int cnt) {
        var rand = new Random();
        String[][] results = new String[cnt][];
        for (int i = 0; i < cnt; i++) {
            int length = Limits.PROGRESSIONLEN + rand.nextInt(Limits.PROGRESSIONLEN);
            int index = rand.nextInt(length);
            int start = rand.nextInt(Limits.MAXRAND);
            int step = 1 + rand.nextInt(Limits.PROGRESSIONLEN);
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
            results[i] = new String[]{question, answer};
        }
        return results;
    }
}

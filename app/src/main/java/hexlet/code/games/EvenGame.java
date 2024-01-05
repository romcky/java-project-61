package hexlet.code.games;

import java.util.Random;

public class EvenGame {

    public static String getCaption() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public static String[][] generate(int cnt) {
        var rand = new Random();
        String[][] results = new String[cnt][];
        for (int i = 0; i < cnt; i++) {
            int x = 1 + rand.nextInt(99);
            String question = String.valueOf(x);
            String answer = (x % 2 == 0) ? "yes" : "no";
            results[i] =  new String[]{question, answer};
        }
        return results;
    }
}



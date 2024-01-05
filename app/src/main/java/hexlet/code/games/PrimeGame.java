package hexlet.code.games;

import java.util.Random;

public class PrimeGame{

    public static String getCaption() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static String[][] generate(int cnt) {
        var rand = new Random();
        String[][] results = new String[cnt][];
        for (int i = 0; i < cnt; i++) {
            int a = 1 + rand.nextInt(99);
            String question = String.valueOf(a);
            int d = a - 1;
            while (d > 0 && a % d != 0) {
                d--;
            }
            String answer = (d > 1) ? "no" : "yes";
            results[i] = new String[]{question, answer};
        }
        return results;
    }
}

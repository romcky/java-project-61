package hexlet.code.games;

import java.util.Random;

public class GCDGame {

    public static String getCaption() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static String[][] generate(int cnt) {
        var rand = new Random();
        String[][] results = new String[cnt][];
        for (int i = 0; i < cnt; i++) {
            int a = 1 + rand.nextInt(Limits.MAXRAND);
            int b = 1 + rand.nextInt(Limits.MAXRAND);
            String question = String.valueOf(a) + " " + String.valueOf(b);
            int gcd = Math.min(a, b);
            while (a % gcd != 0 || b % gcd != 0) {
                gcd--;
            }
            String answer = String.valueOf(gcd);
            results[i] = new String[]{question, answer};
        }
        return results;
    }
}


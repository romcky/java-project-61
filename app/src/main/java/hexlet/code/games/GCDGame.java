package hexlet.code.games;

import java.util.Random;

public class GCDGame implements AbstractGame{
    public String caption() {
        return "Find the greatest common divisor of given numbers.";
    }
    public void generate() {
        a = rand.nextInt(100) + 1;
        b = rand.nextInt(100) + 1;
    }
    public String question() {
        return String.valueOf(a) + " " + b;
    }
    public String answer() {
        int gcd = Math.min(a, b);
        while (a % gcd != 0 || b % gcd != 0)
            gcd--;
        return String.valueOf(gcd);
    }

    private int a;
    private int b;
    private final Random rand = new Random();
}

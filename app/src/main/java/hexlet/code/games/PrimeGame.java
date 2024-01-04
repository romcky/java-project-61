package hexlet.code.games;

import java.util.Random;

public class PrimeGame implements AbstractGame{
    public void generate() {
        a = rand.nextInt(100) + 1;
    }
    public String answer() {
        int d = a - 1;
        while (d > 0 && a % d != 0) {
            d--;
        }
        return (d > 1) ? "no" : "yes";
    }
    public String question() {
        return String.valueOf(a);
    }
    public String caption() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
    int a;
    private final Random rand = new Random();
}

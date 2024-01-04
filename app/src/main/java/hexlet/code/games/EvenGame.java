package hexlet.code.games;

import java.util.Random;
public class EvenGame implements AbstractGame {
    public void generate() {
        a = rand.nextInt(100);
    }
    public String answer() {
        return (a % 2 == 0) ? "yes" : "no";
    }
    public String question() {
        return String.valueOf(a);
    }
    public String caption() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
    private int a;
    private final Random rand = new Random();
}


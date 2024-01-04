package hexlet.code.games;

import java.util.Random;
public class CalcGame implements AbstractGame {
    public String caption() {
        return "What is the result of the expression?";
    }
    public void generate() {
        a = rand.nextInt(100);
        b = rand.nextInt(100);
        op = new char[]{'+', '-', '*'}[rand.nextInt(3)];
    }

    public String question() {
        return a + " " + op + " " + b;
    }

    public String answer() {
        switch (op) {
            case '+':
                return String.valueOf(a + b);
            case '-':
                return String.valueOf(a - b);
            default:
                return String.valueOf(a * b);
        }
    }

    private int a;
    private int b;
    private char op;
    private final Random rand = new Random();
}

package hexlet.code.games;

import java.util.Random;

public class CalcGame {

    public static String getCaption() {
        return "What is the result of the expression?";
    }

    public static String[][] generate(int cnt) {
        var rand = new Random();
        String[][] results = new String[cnt][];
        for (int i = 0; i < cnt; i++) {
            int a = 1 + rand.nextInt(99);
            int b = 1 + rand.nextInt(99);
            char[] operators = {'+', '-', '*'};
            char operator = operators[rand.nextInt(operators.length)];
            String question = String.valueOf(a) + " " + operator + " " + b;
            String answer = "";
            switch (operator) {
                case '+':
                    answer = String.valueOf(a + b);
                    break;
                case '-':
                    answer = String.valueOf(a - b);
                    break;
                case '*':
                    answer = String.valueOf(a * b);
                    break;
            }
            results[i] = new String[]{question, answer};
        }
        return results;
    }
}

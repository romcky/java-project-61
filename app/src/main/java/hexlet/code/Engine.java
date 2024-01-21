package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDSCNT = 3;

    public static void runGame(String info, String[][] questionsAndAnswers) {
        System.out.println("Welcome to the Brain Games!");
        Scanner in = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = in.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(info);

        for (int i = 0; i < questionsAndAnswers.length; i++) {
            var question = questionsAndAnswers[i][0];
            var answer = questionsAndAnswers[i][1];
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = in.next();
            if (userAnswer.equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer
                        + "' is wrong answer ;(. Correct answer was '"
                        + answer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                in.close();
                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");
        in.close();
    }
}

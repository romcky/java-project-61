package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static boolean startGame(String info, String[][] questionsAndAnswers) {
        System.out.println(info);
        var in = new Scanner(System.in);
        for (var questionAndAnswer : questionsAndAnswers) {
            System.out.println("Question: " + questionAndAnswer[0]);
            System.out.print("Your answer: ");
            String answer = in.next();
            if (!answer.equals(questionAndAnswer[1])) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + questionAndAnswer[1] + "'.");
                return false;
            }
            System.out.println("Correct!");
        }
        return true;
    }
}


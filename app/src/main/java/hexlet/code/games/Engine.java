package hexlet.code.games;

import java.util.Scanner;

public class Engine {
    public static boolean startGame(AbstractGame game) {
        System.out.println(game.caption());
        for (int i = 0; i < ROUNDS; i++) {
            game.generate();
            System.out.println("Question: " + game.question());
            var in = new Scanner(System.in);
            String answer = in.next();
            if (!answer.equals(game.answer())) {
                System.out.println("'" + answer +
                        "' is wrong answer ;(. Correct answer was '" + game.answer() + "'.");
                return false;
            }
            System.out.println("Correct!");
        }
        return true;
    }

    private static final int ROUNDS = 3;
}

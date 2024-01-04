package hexlet.code.games;

import java.util.Random;

public class ProgressionGame implements AbstractGame{
    public void generate() {
        length = rand.nextInt(7) + 5;
        index = rand.nextInt(length);
        start = rand.nextInt(100);
        step = rand.nextInt(10) + 1;
    }
    public String answer() {
        int result = start;
        for (int i = 0; i < index; i++) {
            result += step;
        }
        return String.valueOf(result);
    }
    public String question() {
        var result = new StringBuilder();
        int curr = start;
        for (int i = 0; i < length; i++) {
            if (i == index) {
                result.append("..");
            } else {
                result.append(curr);
            }
            curr += step;
            result.append(" ");
        }
        return result.toString();
    }
    public String caption() {
        return "What number is missing in the progression?";
    }

    int start;
    int step;
    int index;
    int length;
    private final Random rand = new Random();
}

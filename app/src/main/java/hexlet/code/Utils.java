package hexlet.code;

import java.util.Random;

public class Utils {
    private static final Random RND = new Random();
    public static int random(int start, int stop) {
        return start + RND.nextInt(stop - start);
    }
}

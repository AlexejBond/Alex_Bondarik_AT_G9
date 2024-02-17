package homework.day4.playground.utils;

import java.util.Random;

public class DirectionGenerator {
    public static String generateDirection() {
        Random random  = new Random();
        int randomNumberforDirection = random.nextInt(39) + 1;

        if (randomNumberforDirection >= 1 && randomNumberforDirection <= 9) {
            return "NORTH";
        } else if (randomNumberforDirection >= 10 && randomNumberforDirection <= 19) {
            return "SOUTH";
        } else if (randomNumberforDirection >= 20 && randomNumberforDirection <= 29) {
            return "WEST";
        } else {
            return "EAST";
        }
    }
}

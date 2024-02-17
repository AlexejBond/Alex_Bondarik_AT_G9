package homework.day4.playground.utils;

import java.util.Random;

public class CoordinatesGenerator {
    public static int generateCoordinate() {
        int generatedCoordinate = new Random().nextInt(79) + 1;
        System.out.println("CoordinatesGenerator: I have generated point with value: " + generatedCoordinate);
        return generatedCoordinate;

    }
}

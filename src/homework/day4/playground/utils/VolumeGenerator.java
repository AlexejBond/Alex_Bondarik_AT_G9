package homework.day4.playground.utils;

import homework.day4.playground.essence.material.Diesel;
import homework.day4.playground.essence.material.Petrol;
import homework.day4.playground.essence.material.Pourable;
import homework.day4.playground.essence.material.Water;

import java.util.Random;

public class VolumeGenerator {
    public static int generateVolume(Pourable pourable) {

        Random random = new Random();
        int volume = 0;
        if (pourable instanceof Petrol || pourable instanceof Diesel) {
            volume = random.nextInt(50) + 1;
        } else if (pourable instanceof Water) {
            volume = random.nextInt(49, 100) + 1;
        }
        System.out.println("VolumeGenerator: I have generated volume of " + pourable.getClass().getSimpleName() + " with value: " + volume);

        return volume;
    }
}

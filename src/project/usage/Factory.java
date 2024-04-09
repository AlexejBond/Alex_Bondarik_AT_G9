package project.usage;

import project.boxing.Bottle;
import project.content.SparklingWater;
import project.materials.Glass;

public class Factory {

    public static void main(String[] args) throws InterruptedException {
        Bottle bottle1 = new Bottle(0.5, 5.0, new Glass());
        Bottle bottle2 = new Bottle(0.1, 6.0, new Glass());
        Bottle bottle3 = new Bottle(1.5, 6.0, new Glass());

        bottle1.addStuff(new SparklingWater("no", "no", "transparent", 5));
        bottle2.addStuff(new SparklingWater("no", "no", "transparent", 5));
        bottle3.addStuff(new SparklingWater("no", "no", "transparent", 22));

        new Thread(bottle1::open).start();

        new Thread(() -> {
            try {
                while (bottle2.getWater().getTemperature() < 40) {
                    bottle2.warm(bottle2.getWater().getTemperature() + 1);
                    Thread.sleep(60000);
                    bottle2.open();
                    System.out.println();
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(bottle3::open).start();
    }
}


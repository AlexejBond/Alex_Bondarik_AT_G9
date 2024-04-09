package project.content;


import java.awt.*;

public class SparklingWater extends Water {
    private boolean isOpened;
    private List <Bubble> bubbles;

    public SparklingWater(String color, String transparency, String smell, int temperature) {
        super(color, transparency, smell, temperature);

        this.isOpened = false;

    }

    public boolean isOpened() {
        return this.isOpened;
    }

    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }

    public void setOpened() {
        this.isOpened = true;
        degas();
    }


    private void degas() {
        int bubbleCount = 10 + 5 * getTemperature();
        for (int i = 0; i < this.bubbles.length; i++) {
            this.bubbles[i].cramp();
            if (i % bubbleCount == 0 && i != 0) {
                try {
                    System.out.println("Sleeping...");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("Finished degas process!");
    }

     public static void main(String[] args) {
         SparklingWater sparklingWater = new SparklingWater("no", "transparent", "no", 1);
         Bubble[] bubbles = new Bubble[50];
         for (int i = 0; i < 50; i++) {
             bubbles[i] = new Bubble("Oxygen");
         }
         sparklingWater.pump(bubbles);
         sparklingWater.setOpened();
     }
}
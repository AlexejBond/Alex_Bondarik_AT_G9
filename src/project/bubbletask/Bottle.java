package project.bubbletask;

public class Bottle {
    // Bottle:
    // содеждит приватные поля double volume, Water water
    // содержит конструктор Bottle(double volume), в котором сетается обьем бутылки
    // есть публичный метод void open(), который меняет состояние воды в "открытое"
    //      (приблизительно, как this.water.setOpened();)
    // есть публичный метод void warm(int temperature), который устанавливает температуру воды в бутылке
    // есть публичные методы Water getWater() и setWater(Water water) возвращающий/добавляющий обьект воды
    // есть публичный невозвратный метод setBubbles(), который генерирует массив из обьектов
    //      Bubble размерностью 10 тыс пузырьков на 1 литр воды и сетает его в воду

    private double volume;
    private Water water;

    public Bottle(double volume) {
        this.volume = volume;
    }

    public void open() {
        System.out.println("Opening the bottle");
        this.water.setOpened();
    }

    public void warm(int temperature) {
        System.out.printf("Warming water to: %s", temperature).println();
        this.water.setTemperature(temperature);
    }

    public Water getWater() {
        return this.water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public void setBubbles() {
        System.out.println("Generating bubbles");
        int bubbleCountPerVolume = (int) (this.volume * 10000);
        Bubble[] bubbles = new Bubble[bubbleCountPerVolume];
        for (int i = 0; i < bubbleCountPerVolume; i++) {
            bubbles[i] = new Bubble("Oxygen");
        }
        this.water.pump(bubbles);
    }

    // public static void main(String[] args) {
    //     Bottle bottle = new Bottle(1);
    //     SparklingWater sparklingWater = new SparklingWater("no", "transparent", "no", 0);
    //     bottle.setWater(sparklingWater);
    //     bottle.warm(10);
    //     bottle.setBubbles();
    //     bottle.open();
    // }
}


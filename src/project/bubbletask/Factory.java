package project.bubbletask;

public class Factory {
    // Factory, содержащий main
    // в нем создать 3 бутылки, объёмом 0.05, 0.1, 0.2 лира с газировкой, температура которой 12, 18 и 25 градусов соответственно
    // добавить газировку в бутылки и наполнить пузырьками
    // открыть поочередно все бутылки и выпустить из них газ

    public static void main(String[] args) {
        Bottle bottle1 = new Bottle(0.05);
        Bottle bottle2 = new Bottle(0.1);
        Bottle bottle3 = new Bottle(0.2);

        SparklingWater sparklingWater1 = new SparklingWater("no", "transparent", "no", 12);
        SparklingWater sparklingWater2 = new SparklingWater("no", "transparent", "no", 18);
        SparklingWater sparklingWater3 = new SparklingWater("no", "transparent", "no", 25);

        bottle1.setWater(sparklingWater1);
        bottle2.setWater(sparklingWater2);
        bottle3.setWater(sparklingWater3);

        bottle1.setBubbles();
        bottle2.setBubbles();
        bottle3.setBubbles();

        bottle1.open();
        System.out.println("Bottle 1 is opened");
        bottle2.open();
        System.out.println("Bottle 2 is opened");
        bottle3.open();
        System.out.println("Bottle 3 is opened");
    }
}

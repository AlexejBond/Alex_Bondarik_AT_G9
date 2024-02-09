package basetask;

public class TrainMethodsObjectsRunner {
    public static void main(String[] args) {
        Mouse newMouse = new Mouse("Лариска", 5);
        Souce newSouce = new Souce("Томатный", "Красный");
        Bee newBee = new Bee("Мужской", 136);
        Obstacle newObstacle = new Obstacle("очень важное", "сервер лег");
        Pineapple newPineapple = new Pineapple("вкусный", 2000);


        TrainMethodsObjects tmo = new TrainMethodsObjects();
        tmo.processMouse(newMouse);
        tmo.processSouce(newSouce);
        tmo.processBee(newBee);
        tmo.processObstacle(newObstacle);
        tmo.processPineapple(newPineapple);

    }
}

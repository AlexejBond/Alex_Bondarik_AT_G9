package basetask;


//-- создать класс TrainMethodsObjectsRunner с методом main, в котором создать обьект класса TrainMethodsObjects,
//и вызвать всего его методы

public class TrainMethodsObjects {

    public void processMouse(Mouse mouse) {
        System.out.println("Имя мыши: " + mouse.getName() + ", Возраст мыши: " + mouse.getAge());
        mouse.printMouseDetails();
    }

    public void processSouce(Souce souce) {
        System.out.println("Имя соуса: " + souce.getName() + ", Цвет соуса: " + souce.getColor());
        souce.printSouceDetails();
    }

    public void processBee(Bee bee) {
        System.out.println("Пол пчелы: " + bee.getGender() + ", Вес пчелы: " + bee.getWeight());
        bee.printBeeDetails();
    }

    public void processObstacle(Obstacle obstacle) {
        System.out.println("Возникло " + obstacle.getSeverity() + " препятствие: " + obstacle.getDescription());
        obstacle.printObstacleDetails();
    }

    public void processPineapple(Pineapple pineapple) {
        System.out.println("Сорт ананаса: " + pineapple.getGrade() + ", Теплоемкость ананаса: " + pineapple.getHeatCapacity());
        pineapple.printPineappleDetails();
    }


        public static void main (String[]args) {
            Mouse newMouse = new Mouse("Лариска", 5);
            Souce newSouce = new Souce("Томатный", "Красный");
            Bee newBee = new Bee("Мужской", 136);
            Obstacle newObstacle = new Obstacle("очень важное", "сервер лег");
            Pineapple newPineapple = new Pineapple("вкусный", 2000);


        }

}

package basetask;
//- создать класс Obstacle и в нем
//-- строковое поле description
//-- строковое поле severity
//-- конструктор, принимающий описание и важность и инициализирующий соответствующие поля
//-- геттеры и сеттеры на каждое поле
//-- невозвратный метод printObstacleDetails,
//который печатает в консоль информацию о трудности в виде "Возникло <важность> препятствиие <описание препятствия>"

public class Obstacle {
    String description;
    String severity;

    public Obstacle (String severity, String description) {
        this.severity = severity;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public void printObstacleDetails(){
        System.out.println("Возникло " + severity + " препятствие: " + description);
    }

    public static void main(String[] args) {
        Obstacle obstacle = new Obstacle("очень важное", "сервер лег");
        obstacle.printObstacleDetails();
    }

}

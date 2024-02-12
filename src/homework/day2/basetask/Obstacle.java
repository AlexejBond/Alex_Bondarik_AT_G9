package homework.day2.basetask;

public class Obstacle {
    String description;
    String severity;

    public Obstacle(String severity, String description) {
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

    public void printObstacleDetails() {
        System.out.println("Возникло " + severity + " препятствие: " + description);
    }

    public static void main(String[] args) {
        Obstacle obstacle = new Obstacle("очень важное", "сервер лег");
        obstacle.printObstacleDetails();
    }

}

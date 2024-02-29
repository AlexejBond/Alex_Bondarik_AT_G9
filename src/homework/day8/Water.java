package homework.day8;

public class Water {
    private String color;
    private String smell;

    public Water(String color, String smell) {
        this.color = color;
        this.smell = smell;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String getSmell() {
        return smell;
    }

    private void setSmell(String smell) {
        this.smell = smell;
    }
}

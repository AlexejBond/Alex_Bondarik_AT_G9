package homework.day2.basetask;


public class Souce {
    String name;
    String color;

    public Souce(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printSouceDetails() {
        System.out.println("Это соус " + name + " " + color + " цвета");
    }

    public static void main(String[] args) {
        Souce newSouce = new Souce("Кетчуп", "красного");
        newSouce.printSouceDetails();

        newSouce.setName("Майонез");
        newSouce.printSouceDetails();

        newSouce.setColor("белого");
        newSouce.printSouceDetails();
    }

}

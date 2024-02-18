package homework.day4.playground.essence.craft.field;

import homework.day4.playground.essence.Matter;

public abstract class Vehicle extends Matter {
    protected String name;

    public Vehicle(int mass, String name) {
        super(mass, name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int move(int pointA, int pointB) {
        return pointB - pointA;
    }
}

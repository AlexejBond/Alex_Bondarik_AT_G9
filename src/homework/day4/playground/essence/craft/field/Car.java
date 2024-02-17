package homework.day4.playground.essence.craft.field;

import homework.day4.playground.essence.craft.Rideable;
import homework.day4.playground.essence.craft.Transportable;

public class Car extends Vehicle implements Transportable, Rideable {
    public Car(int mass, String name) {
        super(mass, name);
    }

    @Override
    public int move(int pointA, int pointB) {
        return 0;
    }
}

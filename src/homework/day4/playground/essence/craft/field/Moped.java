package homework.day4.playground.essence.craft.field;

import homework.day4.playground.essence.craft.Rideable;
import homework.day4.playground.essence.craft.Transportable;

public class Moped extends Vehicle implements Transportable, Rideable {
    public Moped(int mass, String name) {
        super(mass, name);
    }

    @Override
    public int move(int pointA, int pointB) {
        System.out.printf("I am %s, my name is %s and I am moving from point %d to point %d", getClass().getSimpleName(), getName(), pointA, pointB);
        System.out.println();
        return pointB - pointA;
    }
}

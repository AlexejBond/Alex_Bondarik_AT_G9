package homework.day4.playground.essence.craft.air;

import homework.day4.playground.essence.Flyable;
import homework.day4.playground.essence.Matter;
import homework.day4.playground.essence.craft.Transportable;

public abstract class AirVehicles extends Matter implements Flyable, Transportable {
    protected String name;

    public AirVehicles(int mass, String name){
        super(mass);
        this.name = name;

    }
    public AirVehicles(String name, int mass) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void fly(String direction) {
        System.out.printf("I am %s, my name is %s and I amd flying to %s", this.getClass().getSimpleName(),
                this.getName(), direction).println();
    }

}

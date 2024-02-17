package homework.day4.playground.essence.craft.air;

public class Plane extends AirVehicles {
    public Plane(int mass,String name) {
        super(name, mass);
    }

    @Override
    public int move(int pointA, int pointB) {
        return 0;
    }
}
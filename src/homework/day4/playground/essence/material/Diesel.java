package homework.day4.playground.essence.material;

import homework.day4.playground.essence.Matter;

public class Diesel extends Matter implements Pourable, Powerable {

    public Diesel(int mass) {
        super(mass);
    }

    @Override
    public void spread(String storeName) {
        System.out.println("I am " + getClass().getSimpleName() + " and I am spreading in " + storeName);
        System.out.println("whooh..");
    }
}

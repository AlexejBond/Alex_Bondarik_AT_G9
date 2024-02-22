package homework.day4.playground.essence.craft.hand;

import homework.day4.playground.essence.material.Pourable;

public class Can extends Container implements Storable {
    public Can(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void store(Pourable pourable, int amount) {
        pourable.spread(name);
        System.out.println("I am " + this.getClass().getSimpleName() + ", my name is " + name + " and I received " + amount + " of " + pourable.getClass().getSimpleName());
        if (amount > getMass()) {
            System.out.println("waah-waah-waah-hh..");
        }
    }
}

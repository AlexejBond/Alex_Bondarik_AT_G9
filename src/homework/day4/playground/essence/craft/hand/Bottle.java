package homework.day4.playground.essence.craft.hand;

import homework.day4.playground.essence.material.Pourable;

public class Bottle extends Container implements Storable {
    public Bottle(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void store(Pourable pourable, int amount) {
        pourable.spread(name);
        System.out.println("I am " + this.getClass().getSimpleName() + ", my name is " + name + " and I received " + amount + " of " + pourable.getClass().getSimpleName());
        if (amount > getMass()) {
            System.out.println("wooh-wooh-wooh-hh..");
        }
    }
}

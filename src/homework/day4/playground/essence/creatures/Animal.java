package homework.day4.playground.essence.creatures;

import homework.day4.playground.essence.Matter;



public abstract class Animal extends Matter {
    protected String name;

    public Animal(int mass, String name) {
        super(mass, name);
        this.name = name;
        this.mass = mass;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // все животные имеют не абстрактный публичный метод void eat(Plant food) - принимает обьект растения и печатает
    //в консоль фразу "I am N and I am eating D", где N - имя соответствующего обьекта класса животного,
    //D - имя обьекта растения из передаваемого аргумента, использовать Format string syntax
//    public void eat(Plant food) {
//        System.out.printf("I am %s and I am eating %s%n", name,food.getClass().getSimpleName());
//
//    }
    public void eat(Plant food) {
        System.out.printf("I am %s and I am eating %s", name, food.getName()).println();
    }



}

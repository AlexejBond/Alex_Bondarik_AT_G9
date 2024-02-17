package homework.day4.playground.essence.creatures;

//у жука есть не абстрактный публичный метод void nest(Carrot home) - принимает обьект морковки, сравнивает свою массу с массой
//последней и если его масса меньше, то печатает в консоль фразу "I am N and I will nest there with D my family members!",
//где N - имя соответствующего обьекта класса жука, D -  целая чать от деления массы моркови на массу жука, в противном случае печатает в консоль фразу "This carrot is too small for nesting :(
//        ", использовать, Format string syntax

public class Beetle extends Insect {
    public Beetle(int mass, String name) {
        super(mass, name);
    }

    public void nest(Carrot home) {
        if (mass > home.getMass()) {
            System.out.printf("I am %s and I will nest here with my %d family members", name, (int) (home.getMass() / getMass())).println();
        } else {
            System.out.println("This carrot is too small for nesting");
        }
    }

}

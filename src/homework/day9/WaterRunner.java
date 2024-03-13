package homework.day9;

import homework.day8.Water;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WaterRunner {
    public static void main(String[] args) {

        Stream<Water> water = Stream.of(
                new Water("Прозрачная", "Нет"),
                new Water("Прозрачная", "Нет"),
                new Water("Мутная", "Аммиачный"),
                new Water("Синяя", "Мятный"));

        System.out.println(water
                .filter(w -> (w.getColor() != "Прозрачная"))
                .sorted(Comparator.comparing(Water::getSmell)
                        .reversed())
                .map(w -> {
                    if (w.getSmell().contains("ы")) {
                        w = new Water(w.getColor(), w.getSmell()
                                .replace("ы", "ыы"));
                    } else w = new Water(w.getColor(), w.getSmell());
                    return w;
                })
                .map(Water::getSmell)
                .collect(Collectors.joining())
                .length());


    }
}

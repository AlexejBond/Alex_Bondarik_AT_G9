package homework.day9;

import homework.day8.Person;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.stream.Stream;

public class PersonRunner {
    public static void main(String[] args) {

        Stream<Person> people = Stream.of(
                new Person(32, "Коля"),
                new Person(24, "Оля"),
                new Person(55, "Вася"),
                new Person(63, "Маша"));


        double averageAge = people
                .filter(person -> person.getAge() < 60)
                .sorted(Comparator.comparing(Person::getName))
                .map(person -> new Person(person.getAge() + 4, person.getName()))
                .mapToInt(Person::getAge)
                .average()
                .getAsDouble();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("AverageAge.txt"))) {
            writer.write(String.valueOf(averageAge));

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}

package homework.day9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BirdsRunner {
    public static void main(String[] args) {

        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

        Arrays.stream(birds.stream()
                        .map(string -> string.replace('о', 'а'))
                        .collect(Collectors.joining())
                        .toLowerCase()
                        .replace("ь", "")
                        .split("б"))
                .forEach(s -> System.out.println("--" + s + "--"));


    }
}

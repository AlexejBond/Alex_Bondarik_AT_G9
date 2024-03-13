package classwork.day10;

import java.util.List;

public class RunnerSec {

    public static void main(String[] args) {
        List<String> mystrings = List.of("First Text",
                "РУддщБ цщкдв", "apple", "строки");

        mystrings.
                stream().
                sorted().
                forEach(System.out::println);

//        










    }
}

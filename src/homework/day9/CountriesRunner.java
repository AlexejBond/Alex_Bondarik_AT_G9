package homework.day9;

import com.sun.tools.javac.Main;

import java.util.stream.Stream;

public class CountriesRunner {
    public static void main(String[] args) {

        Stream<String> countries = Stream.of("Андора", "Португалия", "Англия", "Замбия");

        countries.filter(string -> string.matches(".*[ауоиэыяюеёАУОИЭЫЯЮЕЁ]"))
                .filter(string -> string.length() < 7)
                .map(String::toUpperCase)
                .map(string -> "\"" + string + "\"")
                .forEach(System.out::println);

    }
}

package homework.day9;

//Создать поток данных стрингов elements (Text field, Radio, Check-box, Drop-down, Picker, Breadcrumb) (через Stream.of())
//Для каждого элемента стрима пробежаться по отдельным словам и если слово нечетное, то заменить в нем все буквы "e" на букву "o",
// а если четное, то заменить слово на число количества буков в этом слове
//Оставить в потоке только уникальные значения
//Отпечатать в консоль с новой строки

import java.util.stream.Stream;

public class ElementsRunner {
    public static void main(String[] args) {

        Stream<String> elements = Stream.of("Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb");

        elements.map(s -> {
                    int charLength = s.length();
                    if (charLength % 2 != 0) {
                        return s.replace('e', 'o');
                    } else {
                        return String.valueOf(charLength);
                    }
                })

                .distinct()
                .forEach(System.out::println);
    }


}



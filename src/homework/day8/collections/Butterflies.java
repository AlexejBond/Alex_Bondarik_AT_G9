package homework.day8.collections;

import java.util.ArrayList;
import java.util.List;


//Создать пустой список стрингов butterflies (через new ArrayList)
//Добавить в список 4 бабочек (Common blue, Swallowtail, Aglais io, Common blue)
//Проитерировать список через for-each и отпечатать слова в консоль в кавычках
//Посчитать сколько бабочек содержат букву "о" и вывести число в консоль
//Проитерировать список по индексу и отпечатать слова в консоль через пробел
//Проитерировать список через for-each и отпечатать слова в консоль через перенос строки

public class Butterflies {
    public static void main(String[] args) {


        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtai");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        for (String butterfly : butterflies) {
            System.out.println("\"" + butterfly + "\"");
        }

        int count = 0;
        for (String butterfly : butterflies) {
            if (butterfly.contains("o")) {
                count++;
            }

            System.out.println("Количество бабочек, содержащих букву 'о': " + count);
        }


        System.out.println("Через перенос строки: ");

        for (String iteratedButterfly : butterflies) {
            System.out.printf(" %s \n", iteratedButterfly);
        }


        System.out.println("Итерация по индексу и вывод через пробел:");

        for (int elementIndex = 0; elementIndex < butterflies.size(); elementIndex++) {
            System.out.printf(" %s", butterflies.get(elementIndex));
        }
    }
}


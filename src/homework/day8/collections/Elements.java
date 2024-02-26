package homework.day8.collections;
//Создать пустой список стрингов elements (через new ArrayList)
//Добавить в список 6 элементов (Text field, Radio, Check-box, Drop-down, Picker, Breadcrumb)
//Проитерировать список через for-each и отпечатать слова в консоль через пробел
//Посчитать сколько названий элементов состоит более, чем из одного слова и вывести число в консоль
//Проитерировать список по индексу и отпечатать слова в консоль через пробел
//На 4-ю позицию добавить Spinner
//Удалить 2-й элемент списка
//Заменить 5-й элемент на Switch
//Проитерировать список через for-each и отпечатать слова в консоль через пробел

import java.util.ArrayList;
import java.util.List;

public class Elements {
    public static void main(String[] args) {
        List<String> elements = new ArrayList<>();
        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Picker");
        elements.add("Breadcrumb");

        System.out.println("Итерация через пробел: ");
        for (String element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();


        int count = 0;
        for (String element : elements) {
            if (element.contains(" ")) {
                count++;
            }
        }
        System.out.println("Количество элементов имя которых, состоит более, чем из одного слова: " + count);


        System.out.print("Итерирация списока по индексу и отпечатать слова в консоль через пробел :");
        int i;
        for (i = 0; i < elements.size(); i++) {
            System.out.print(elements.get(i) + " ");

        }
        System.out.println();

        System.out.println("На 4-ю позицию добавить 'Spinner' - Done !");
        elements.add(3, "Spinner");


        System.out.println("Удалить 2-й элемент списка - Done !");
        elements.remove(1);

        System.out.println("Заменить 5-й элемент на 'Switch' - Done !");

        System.out.println("Проитерировать список через for-each и отпечатать слова в консоль через пробел - Done !");
        for (String element : elements) {
            System.out.print(element + " ");
        }



    }
}


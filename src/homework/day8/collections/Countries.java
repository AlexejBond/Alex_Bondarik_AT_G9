package homework.day8.collections;
//Создать пустой список стрингов countries (через new ArrayList)
//Добавить в список 4 страны (Андора, Португалия, Англия, Замбия)
//Проитерировать список через for-each и отпечатать слова в консоль через запятую с пробелом
//Посчитать сколько стран, в названии которых меньше 7 букв и вывести число в консоль
//Проитерировать список по индексу и отпечатать слова в консоль с новой строки

import java.util.ArrayList;
import java.util.List;

public class Countries {
    public static void main(String[] args) {

        List<String> countries = new ArrayList<>();
        countries.add("Андора");
        countries.add("Португалия");
        countries.add("Англия");
        countries.add("Замбия");

        for (String country : countries) {
            System.out.print(country + ", ");
        }
        System.out.println();

        int count = 0;
        for (String country : countries) {
            if (country.length() < 7) {
                count++;
            }
        }
        System.out.println("Количество стран, в названии которых меньше 7 букв: " + count);

        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i));
        }

    }
}

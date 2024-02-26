package homework.day8.collections;

import java.util.ArrayList;
import java.util.List;

public class Cities {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        System.out.println("Итерация через for-each: ");
        for (String city : cities) {
            System.out.println(city);
        }

        int sum = 0;
        for (String city : cities) {
            sum += city.length();
        }
        System.out.println("Сумма всех букв во всех словах: " + sum);

        System.out.println("Проитерировать список по индексу и отпечатать слова в консоль через пробел :");

        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }
    }
}


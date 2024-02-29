package homework.day8.collections;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cars {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Мерс");
        cars.add("Ауди");
        cars.add("Жигуль");
        cars.add("Рено");
        cars.add("Жигуль");
        cars.add("Жигуль");
        cars.add("Ауди");

        try (FileWriter fileWriter = new FileWriter("Cars.txt")) {
            System.out.println("Итерация через for-each записана в файл ! ");
            for (String car : cars) {
                fileWriter.write("\"" + car + "\"\n");
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        Iterator<String> iterator = cars.iterator();
        System.out.println("Найти и удалить из набора авто, в названии которых больше 4 букв");
        while (iterator.hasNext()) {
            String car = iterator.next();
            if (car.length() > 4) {
                iterator.remove();
            }
        }

        System.out.println("Проитерировать список через for-each и отпечатать слова в консоль через пробел:");
        for (String car : cars) {
            System.out.print(car + " ");
        }
    }
}






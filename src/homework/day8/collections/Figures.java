package homework.day8.collections;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

//Создать список строк стрингов figures из 5 фигур (Овал, Прямоугольник, Круг, Квадрат, Эллипс) через (Arrays.asList())
//Проитерировать список через for-each и отпечатать слова в файл figures через тире
//Посчитать сколько фигур НЕ содержат букву "и" и вывести число в консоль
//Проитерировать список по индексу и отпечатать слова в консоль через пробел
//Вставить на 3 позицию Треугольник
//Проитерировать список через for-each и отпечатать слова в консоль через пробел

public class Figures {
    public static void main(String[] args) {

        List<String> figures = Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("FileWithFigures"));

            for (String figure : figures) {
                out.write(figure + "-");
            }

            out.close();

        } catch (IOException e) {
            System.out.println(e);
        }
        int counter = 0;

        for (String figure : figures) {
            if (!figure.contains("и"))
                counter++;
        }

        System.out.println("Количество фигур без буквы \"и\": " + counter);

        for (int elemIndex = 0; elemIndex < figures.size(); elemIndex++) {
            System.out.println(" " + figures.get(elemIndex));

        }

        System.out.println();
        figures.add(2, "Треугольник");

        for (String figure : figures) {
            System.out.print(figure + " ");
        }
    }


}


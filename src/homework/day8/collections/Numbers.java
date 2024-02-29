package homework.day8.collections;

//Создать список целых чисел numbers из 8 чисел (3342, 34, 79, 23426, 68, 1324, 55, 7699) через (Arrays.asList())
//Проитерировать список через for-each и отпечатать числа в консоль новой строки
//Посчитать сумму всех чисел и вывести результат в консоль
//Отсортировать список по возрастанию
//Проитерировать список по индексу и отпечатать числа в консоль через пробел
//Развернуть список в обратном порядке
//Проитерировать список через for-each и отпечатать числа в консоль через пробел

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Numbers {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699);

        System.out.println("Проитерировать список через for-each и отпечатать числа в консоль новой строки: ");
        for (int number : numbers) {
            System.out.println(number);
        }


        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Посчитать сумму всех чисел и вывести результат в консоль: " + sum);

        System.out.println("Отсортированный список по возрастанию: ");
        Collections.sort(numbers);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("Развернутый список в обратном порядке: ");
        Collections.reverse(numbers);
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
        System.out.println("Проитерировать список через for-each и отпечатать числа в консоль через пробел: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }


    }
}

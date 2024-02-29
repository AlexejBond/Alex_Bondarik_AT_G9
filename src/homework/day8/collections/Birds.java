package homework.day8.collections;

//Создать список строк birds из 5 птиц (Чайка, Дрозд, Бусел, Голубь, Воробей, Цапля) через (Arrays.asList())
//Проитерировать список через for-each и отпечатать слова в консоль с новой строки в виде --Чайка--
//Посчитать сколько птиц содержат больше 1 гласной и вывести в число в консоль
//Проитерировать список по индексу и отпечатать слова в консоль через пробел
//Заменить 3-й элемент списка на Синица
//Проитерировать список через for-each и отпечатать слова в консоль через пробел

import java.util.Arrays;
import java.util.List;

public class Birds {
    public static void main(String[] args) {
        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

        for (String bird : birds) {
            System.out.println("--" + bird + "--");
        }

        int count = 0;

        for (String bird : birds) {
            if (bird.matches(".*[ауоиэыяюеёАУОИЭЫЯЮЕЁ].*[ауоиэыяюеёАУОИЭЫЯЮЕЁ].*")) {
                count++;
            }
        }
        System.out.println("Количество птиц, содержащих больше 1 гласной в названии: " + count);

        for (int index = 0; index < birds.size(); index++) {
            System.out.print(birds.get(index) + " ");
        }

        System.out.println();
        birds.set(2, "Синица");

        for (String bird : birds) {
            System.out.print(bird + " ");
        }

    }


}



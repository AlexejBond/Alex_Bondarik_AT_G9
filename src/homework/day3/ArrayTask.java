package homework.day3;

import java.time.LocalDateTime;

public class ArrayTask {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int n = 2;
        int sum = sumOfEachNthElement(array, n);
        System.out.println("Сумма каждого " + n + " элемента: " + sum);

        int[] comparingElementsInReverseOrder = getElementsGreaterThanN(array, n);
        System.out.println("Элементы больше " + n + " в обратном порядке:");
        for (int num : comparingElementsInReverseOrder) {
            System.out.print(num + " ");
        }
        System.out.println();

        ArrayTask arrayTask = new ArrayTask();
        int sum2 = arrayTask.sumOfMultiplesOfCurrentMonth(array);
        System.out.println("Сумма элементов, кратных числу текущего месяца: " + sum2);

        printCow();


    }



    private static int sumOfEachNthElement(int[] array, int n) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if ((i + 1) % n == 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static int[] getElementsGreaterThanN(int[] array, int n) {
        int counter = 0;
        for (int num : array) {
            if (num > n) {
                counter++;
            }
        }
        int[] comparingElementsInReverseOrder = new int[counter];
        int index = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > n) {
                comparingElementsInReverseOrder[index++] = array[i];
            }
        }
        return comparingElementsInReverseOrder;


    }

    public int sumOfMultiplesOfCurrentMonth(int[] array) {
        int currentMonth = LocalDateTime.now().getMonthValue();
        int sumOfMultiplesOfCurrentMonth = 0;
        for (int num : array) {
            if (num % currentMonth == 0){
                sumOfMultiplesOfCurrentMonth += num;
            }
        }
        return sumOfMultiplesOfCurrentMonth;
    }

    public static void printCow() {
        System.out.println("\t  ^__^\n" +
                "\t  (oo)\\\\_______\n" +
                "\t (__)\\ ) \\/\\  \\\n" +
                "\t      ||----w |\\\n" +
                "\t      ||     ||");
    }
}

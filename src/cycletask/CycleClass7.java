package cycletask;

public class CycleClass7 {
    public void printResult7 (int[] array) {
        System.out.println("Task 7 (Результат возведения каждого элемента массива в квадрат): ");
        for (int i = 0; i < array.length; i++) {
            int result = array[i] * array[i]; // Возводим элемент в квадрат
            System.out.print(result + " ");
        }
        System.out.println();

    }
}



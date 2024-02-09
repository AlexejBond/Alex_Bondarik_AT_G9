package cycletask;

public class CycleClass8 {
    public void printResult8 (int[] array) {
        int minNumOfArray = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minNumOfArray) {
                minNumOfArray = array[i];
            }
        }
        System.out.println("Task 8 (Минимальный элемент массива) : " + minNumOfArray);
        System.out.println();

    }
}

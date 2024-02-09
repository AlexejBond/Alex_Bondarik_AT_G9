package cycletask;
import java.util.Arrays;


public class CycleClass10 {
    public void printResult10(int[] array) {
        Arrays.sort(array);

        System.out.println("Task 10 (Элементы массива в порядке убывания): ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}




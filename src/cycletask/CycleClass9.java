package cycletask;

public class CycleClass9 {
    public void printResult9(int[] array) {
        if (array != null && array.length > 1) {
            int arrayNum = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = arrayNum;

            System.out.println("Task 9 (Массив после замены первого и последнего элементов): ");
            for (int num : array) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}



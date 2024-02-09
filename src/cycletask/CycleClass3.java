package cycletask;
//создать пустой массив типа int и размера n = 7 и заполнить его случайными элементами используя Random.nextInt(n)


import java.util.Random;

public class CycleClass3 {
    public void printResult3() {
        int n = 7;
        int[] array = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(n);
        }
        System.out.println("Task 3 (Массив случайными элементами через Random.nextInt): ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

    }

}

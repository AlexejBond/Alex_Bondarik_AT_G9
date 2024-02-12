package homework.day3;

public class ArrayTask {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int n = 5;
        int sum = sumEveryElement(array, n);
        System.out.println("Сумма каждого " + n + " элемента: " + sum);
    }

    private static int sumEveryElement(int[] array, int n) {
        int sum = 0;

        for (int i = n - 1; i < array.length; i += n) {
            sum += array[i];
        }
        return sum;
    }

}

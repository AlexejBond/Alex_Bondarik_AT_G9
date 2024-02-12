package homework.day2.cycletask;

public class CycleClass2 {
    public void printResult2() {
        System.out.println("Task 2 (Нечетное число от 3 до 19 включительно): ");

        for (int i = 3; i <= 19; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();


    }
}




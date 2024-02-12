package homework.day2.pretask;


public class SimpleLoopExample {
    public static void main(String[] args) {
        int x = 0;
        if (x <= 0) {
            for (int i = 1; i >= x; --i) {
                System.out.println(i);
            }

        }
        if (x >= 0) {
            for (int i = 1; i <= x; i++) {
                System.out.println(i);
            }
        }

    }

}

package classwork.day11;

import static java.lang.Math.atan;
import static java.lang.Math.tan;

public class HeavyMethod4 {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 3; i++) {
                    try {
                        Thread.currentThread().sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.printf("t1-%s  ", i);
                }
            }
        }).start();
        Thread.sleep(1000);

        synchronized (lock) {
            for (int i = 0; i < 3; i++) {
                Thread.currentThread().sleep(1000);
                System.out.printf("m-%s  ", i);
            }
        }


    }
}

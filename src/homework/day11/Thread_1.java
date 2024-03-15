package homework.day11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Thread_1 {
    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                List<Mouse> miceList = new ArrayList<>();
                for (int m = 1; m < 21; m++) {
                    miceList.add(new Mouse(m));
                }
                for (Mouse mouse : miceList) {
                    mouse.peep();
                }
            }).start();
        }
    }

}

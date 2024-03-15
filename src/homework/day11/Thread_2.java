package homework.day11;

import java.util.ArrayList;
import java.util.List;

public class Thread_2 {
    public static void main(String[] args) {


        for (int i = 0; i < 7; i++) {
            new Thread(() -> {
                List<Mouse> miceList = new ArrayList<>();
                for (int m = 0; m < 18; m++) {
                    miceList.add(new Mouse(m));
                }
                for (int n = 0; n < miceList.size(); n++) {
                    if (n % 2 == 0)
                        miceList.get(n).peep();
                }
            }).start();
        }
    }
}


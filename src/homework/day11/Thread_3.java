package homework.day11;

import java.util.ArrayList;
import java.util.List;

public class Thread_3 {
    public static void main(String[] args) {

        List<Mouse> miceList = new ArrayList<>();

        for (int m = 1; m < 28; m++) {
            miceList.add(new Mouse(m));
        }


        for (int t = 0; t < 5; t++) {
            new Thread(() -> {
                while (!miceList.isEmpty()) {
                    synchronized (miceList) {
                        if (!miceList.isEmpty()) {
                            Mouse mouseToRemove = miceList.remove(0);
                            mouseToRemove.peep();

                        }
                    }
                }
            }).start();
        }
    }
}




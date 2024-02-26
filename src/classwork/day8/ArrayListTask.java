package classwork.day8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTask {
    public static void main(String[] args) {

        long time0 = System.currentTimeMillis();
        List<String> myList1 = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            myList1.add("String Add " + i);
        }
        System.out.println(System.currentTimeMillis() - time0);


        time0 = System.currentTimeMillis();


        List<String> myList2 = new LinkedList<>();
        for (int i = 0; i < 10000000; i++) {
            myList2.add("String Add " + i);
        }
        System.out.println(System.currentTimeMillis() - time0);






    }
}


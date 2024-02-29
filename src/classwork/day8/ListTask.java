package classwork.day8;

import java.util.ArrayList;
import java.util.List;

public class ListTask {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();

        String mysting = "мама мыла раму мыла";
        String[] wordsInList = mysting.split(" ");

        for (String word : wordsInList) {
            myList.add(word);
        }
        System.out.println("Итерация через for: ");
        for (String word : wordsInList) {
            System.out.println(word);
        }

        System.out.println("Итерация по индексу: ");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }












    }
}

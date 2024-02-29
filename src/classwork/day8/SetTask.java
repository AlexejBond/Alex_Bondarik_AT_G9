package classwork.day8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTask {
    public static void main(String[] args) {

        Set<String> mySet = new HashSet<>();
        String myString = "мама мыла раму мыла";
        String[] wordsInList = myString.split(" ");

        for (String word : wordsInList) {
            mySet.add(word);
        }

        System.out.println("Итерация через итератор: ");
        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Итерация через for: ");
        for (String word : mySet) {
            System.out.println(word);
        }
    }
}

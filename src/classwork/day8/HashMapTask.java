package classwork.day8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapTask {
    public static void main(String[] args) {
        Map <Integer, String> wordMap = new HashMap<>();


        String myString = "мама мыла раму мыла";
        String[] wordsInArray = myString.split(" ");

        for (int i = 0; i < wordsInArray.length; i++) {
            wordMap.put(i, wordsInArray[i]);
        }

        System.out.println("Итерация по ключам : ");
        for (int key : wordMap.keySet()) {
            System.out.println(key);
        }

        System.out.println("Итерация по значению : ");
        for (String value : wordMap.values()) {
            System.out.println(value);
        }

        System.out.println("Итерация по записям : ");
        for (Map.Entry<Integer, String> entry : wordMap.entrySet()) {
            System.out.println(entry);
        }
    }

}

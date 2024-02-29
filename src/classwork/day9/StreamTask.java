package homework.day9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamTask {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

//        int counter = 0;
//        for (String s : list) {
//            if ("мама".equalsIgnoreCase(s)) {
//                counter++;
//            }
//        }
//        System.out.println(counter);

//        long counter2 = list.stream().filter(s -> s.contains("раму")).count();
//        System.out.println(counter2);

//        list.stream().filter("мама"::equalsIgnoreCase).counter2();
//        System.out.println(counter2);



        System.out.println(list.stream().findFirst().orElse("мама"));


        System.out.println(list.stream().filter("мама"::equalsIgnoreCase).findFirst().orElse("мама"));


        System.out.println(list.stream().skip(4).findFirst().get());


        System.out.println(list.stream().skip(2).limit(2).collect(Collectors.toList()));


        System.out.println(list.stream().filter(string -> string.contains("м")).collect(Collectors.toList()));








    }
}
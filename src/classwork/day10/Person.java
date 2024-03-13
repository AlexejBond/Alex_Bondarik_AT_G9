package classwork.day10;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Person {

    public String name;
    public int age;
    public Sex sex;


    public Person(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public enum Sex {
        MAN, WOMEN

    }
}


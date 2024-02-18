package homework.day5.generictask;

import homework.day4.playground.essence.craft.air.AirVehicles;
import homework.day4.playground.essence.craft.air.Copter;
import homework.day4.playground.essence.craft.air.Plane;
import homework.day4.playground.essence.craft.air.Rocket;
import homework.day4.playground.essence.craft.field.Car;
import homework.day4.playground.essence.craft.field.Motorbike;
import homework.day4.playground.essence.craft.field.Vehicle;
import homework.day4.playground.essence.creatures.Fly;

public class GenericMethodsInGenericClassTwoParamsRunner {
    public static void main(String[] args) {

        GenericMethodsInGenericClassTwoParams<String, String> StrStr = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(StrStr.genericMethodGenArgs("XArg", "56783"));
        StrStr.genericMethodHalfGenArgs("XArg", "YArg", "Test string for char calculation");
        StrStr.genericMethodHalfGenArgs("XArg", "Test string for char calculation");
        System.out.println();

        GenericMethodsInGenericClassTwoParams<String, Integer> StrInt = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(StrInt.genericMethodGenArgs("3235", 34567));
        StrInt.genericMethodHalfGenArgs("3235", 34567, "Test string for char calculation");
        StrInt.genericMethodHalfGenArgs("3235", "Test string for char calculation");
        System.out.println();

        GenericMethodsInGenericClassTwoParams<String, Double> StrDouble = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(StrDouble.genericMethodGenArgs("3235", 34.567));
        StrDouble.genericMethodHalfGenArgs("3235", 3.4567, "Test string for char calculation");
        StrDouble.genericMethodHalfGenArgs("3235", "Test string for char calculation");
        System.out.println();

        GenericMethodsInGenericClassTwoParams<Integer, Integer> IntInt = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(IntInt.genericMethodGenArgs(3235, 34567));
        IntInt.genericMethodHalfGenArgs(3235, 34567, "Test string for char calculation");
        IntInt.genericMethodHalfGenArgs(3235, "Test string for char calculation");
        System.out.println();


        GenericMethodsInGenericClassTwoParams<Copter, Plane> CopterPlane = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(CopterPlane.genericMethodGenArgs(new Copter(578, "Copter 578")));
        CopterPlane.genericMethodHalfGenArgs(new Copter(123123, "Copter 123123"), new Plane(5783456, "Plane 5783456"), "Test string for char calculation");
        System.out.println();

        GenericMethodsInGenericClassTwoParams<Motorbike, Car> MotorbikeCar = new GenericMethodsInGenericClassTwoParams<>();
        System.out.println(MotorbikeCar.genericMethodGenArgs(new Motorbike(578, "Motorbike 578")));
        MotorbikeCar.genericMethodGenArgs(new Motorbike(300, "MotoName 300"), new Car(1500, "New Car 1500"));







    }
}

package homework.day5.generictask;

import homework.day4.playground.essence.Matter;
import homework.day4.playground.essence.craft.air.AirVehicles;
import homework.day4.playground.essence.craft.air.Copter;
import homework.day4.playground.essence.craft.air.Plane;
import homework.day4.playground.essence.craft.air.Rocket;
import homework.day4.playground.essence.craft.field.Car;
import homework.day4.playground.essence.craft.field.Moped;
import homework.day4.playground.essence.craft.field.Motorbike;
import homework.day4.playground.essence.craft.field.Vehicle;
import homework.day4.playground.essence.craft.hand.Bottle;
import homework.day4.playground.essence.craft.hand.Can;
import homework.day4.playground.essence.craft.hand.Container;
import homework.day4.playground.essence.craft.hand.Mug;
import homework.day4.playground.essence.material.Diesel;
import homework.day4.playground.essence.material.Petrol;
import homework.day4.playground.essence.material.Water;

public class GenericMethodsInGenericClassTRunner {

    public static void main(String[] args) {

        GenericMethodsInGenericClassT genericMethodsInGenericClassT = new GenericMethodsInGenericClassT();
        genericMethodsInGenericClassT.genericMethodOneGenArg("SomeArgumentForTest");
        System.out.println(genericMethodsInGenericClassT.genericMethodTwoGenArgs("xArgumentForTest", 1234567890));
        genericMethodsInGenericClassT.genericMethodHalfGenArgs("SomeArgumentForTest ", "SomeArgumentForTest!");
        System.out.println();

        GenericMethodsInGenericClassT<String> genericMethodsInGenericClassTString = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT.genericMethodOneGenArg("New String");
        System.out.println(genericMethodsInGenericClassT.genericMethodTwoGenArgs("xArgForTest","yArgForTest"));
        genericMethodsInGenericClassT.genericMethodHalfGenArgs("100", "New Copter");
        System.out.println();

        GenericMethodsInGenericClassT<Integer> genericMethodsInGenericClassTInteger = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Double> genericMethodsInGenericClassTDouble = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Car> genericMethodsInGenericClassTCar = new GenericMethodsInGenericClassT<>();

        GenericMethodsInGenericClassT<Copter> genericMethodsInGenericClassTCopter = new GenericMethodsInGenericClassT<>();
        genericMethodsInGenericClassT.genericMethodOneGenArg(new Copter(100, "New Copter"));
        System.out.println(genericMethodsInGenericClassT.genericMethodTwoGenArgs(new Copter(100, "New Copter"), "yArgForTest"));
        genericMethodsInGenericClassT.genericMethodHalfGenArgs(new Copter(100, "New Copter"), "stringArgForTest");
        System.out.println();

        GenericMethodsInGenericClassT<Plane> genericMethodsInGenericClassTPlane = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Rocket> genericMethodsInGenericClassTRocket = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Moped> genericMethodsInGenericClassTMoped = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Motorbike> genericMethodsInGenericClassTMotorbike = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Vehicle> genericMethodsInGenericClassTVehicle = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<AirVehicles> aircraftGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Bottle> bottleGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Can> canGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Container> containerGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Mug> mugGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Diesel> dieselGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Petrol> petrolGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Water> waterGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Matter> matterGenericMethodsInGenericClassT = new GenericMethodsInGenericClassT<>();





    }
}

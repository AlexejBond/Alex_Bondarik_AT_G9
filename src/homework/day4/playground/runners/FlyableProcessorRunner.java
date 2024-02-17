package homework.day4.playground.runners;

import homework.day4.playground.essence.Flyable;
import homework.day4.playground.essence.craft.air.Copter;
import homework.day4.playground.essence.craft.air.Plane;
import homework.day4.playground.essence.craft.air.Rocket;
import homework.day4.playground.essence.creatures.Fly;
import homework.day4.playground.essence.creatures.Insect;
import homework.day4.playground.essence.creatures.Mosquito;
import homework.day4.playground.processors.FlyableProcessor;
import homework.day4.playground.essence.creatures.Plant;
import homework.day4.playground.essence.craft.air.AirVehicles;

import static homework.day4.playground.utils.CoordinatesGenerator.generateCoordinate;

public class FlyableProcessorRunner {
    public static void main(String[] args) {
        FlyableProcessor flyableProcessor = new FlyableProcessor();


        Flyable flyableCopter = new Copter(223, "Mi8 Flyable");
        flyableProcessor.runFlyable(flyableCopter);
        Flyable flyablePlane = new Plane(3452, "Boeing 837 Flyable");
        Flyable flyableRocket = new Rocket(7623, "Super Heavy Flyable");
        Flyable flyableFly = new Fly(23, "Domestica Flyable");
        Flyable flyableMosquito = new Mosquito(12, "Vulgaris Flyable");
        AirVehicles aircraftCopter = new Copter(223, "Mi8 Aircraft");
        AirVehicles aircraftPlane = new Plane(3452, "Boeing 837 Aircraft");
        AirVehicles aircraftRocket = new Rocket(7623, "Super Heavy Aircraft");
        Insect insectFly = new Fly(23, "Domestica Insect");
        Insect insectMosquito = new Mosquito(12, "Vulgaris Insect");
        Copter aCopter = new Copter(223, "Mi8 Copter");
        Plane aPlane = new Plane(3452, "Boeing 837 Plane");
        Rocket aRocket = new Rocket(7623, "Super Heavy Rocket");
        Fly aFly = new Fly(23, "Domestica Fly");
        Mosquito aMosquito = new Mosquito(12, "Vulgaris Mosquito");

        flyableProcessor.runFlyable(flyableCopter);
        flyableProcessor.runFlyable(flyablePlane);
        flyableProcessor.runFlyable(flyableRocket);
        flyableProcessor.runFlyable(flyableFly);
        flyableProcessor.runFlyable(flyableMosquito);

        flyableProcessor.runFlyable(flyablePlane, "nowhere");
        flyableProcessor.runFlyable(flyableRocket, "everywhere");

    }

}

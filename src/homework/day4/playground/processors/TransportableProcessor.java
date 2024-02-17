package homework.day4.playground.processors;

import homework.day4.playground.essence.craft.Transportable;
import homework.day4.playground.utils.CoordinatesGenerator;

public class TransportableProcessor {


    public void runTransportable(Transportable transportable, int pointA, int pointB) {
        int rangeDistance = transportable.move(pointA, pointB);
        System.out.printf("Transportable %s was moved to %s points", transportable.getClass().getSimpleName(), rangeDistance);
    }


    public void runTransportable(Transportable transportable) {
//        int rangeDistance = transportable.move(CoordinatesGenerator.generateCoordinate(),CoordinatesGenerator.generateCoordinate());
//        System.out.printf("Transportable %s was moved to %s points", transportable.getClass().getSimpleName(), rangeDistance);

        runTransportable(transportable, CoordinatesGenerator.generateCoordinate(), CoordinatesGenerator.generateCoordinate());
    }


}

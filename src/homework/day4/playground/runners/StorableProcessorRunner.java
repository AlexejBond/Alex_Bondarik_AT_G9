package homework.day4.playground.runners;

import homework.day4.playground.essence.Matter;
import homework.day4.playground.essence.craft.hand.Bottle;
import homework.day4.playground.essence.craft.hand.Can;
import homework.day4.playground.essence.craft.hand.Container;
import homework.day4.playground.essence.craft.hand.Storable;
import homework.day4.playground.essence.material.*;
import homework.day4.playground.processors.StorableProcessor;

public class StorableProcessorRunner {
    public static void main(String[] args) {

        StorableProcessor storableProcessor = new StorableProcessor();

//        FirstGroup
        Bottle bottle = new Bottle(23, "Glass");
        Storable storableBottle = new Bottle(4, "Plastic");
        Container containerBottle = new Bottle(78, "Metal");
        Matter matterBottle = new Bottle(33, "Blue");
        Can can = new Can(23, "Wooden");
        Storable storableCan = new Can(82, "Small");
        Container containerCan = new Can(54, "Big");
        Matter matterCan = new Can(8, "Old");

//        SecondGroup
        Petrol petrol = new Petrol(11);
        Pourable pourablePetrol = new Petrol(65);
        Pourable pourableDiesel = new Diesel(3);
        Powerable powerableDiesel = new Diesel(87);
        Matter matterPetrol = new Petrol(2);
        Water water = new Water(34);
        Pourable pourableWater = new Water(37);

        storableProcessor.runStorable(bottle, petrol);
        storableProcessor.runStorable(storableBottle, pourablePetrol);
        storableProcessor.runStorable((Bottle)containerBottle, pourableDiesel);
        storableProcessor.runStorable(can, water);
        storableProcessor.runStorable(storableCan, pourableWater);
        storableProcessor.runStorable(can, (Pourable) matterPetrol);
        storableProcessor.runStorable((Can) matterCan, petrol);




    }
}

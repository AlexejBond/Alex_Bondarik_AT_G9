package homework.day7.input_output_task;

import homework.day4.playground.essence.craft.air.AirVehicles;
import homework.day4.playground.essence.craft.air.Plane;
import homework.day4.playground.essence.craft.air.Rocket;
import homework.day4.playground.essence.craft.field.Vehicle;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;


//создает какой-нибудь обьект класса (добавить имплементацию интерфеса Serializable)
//из пакета playground.essence и записывает его в файл

public class CreateClassObjectAndWriteInFile implements Serializable {


    public void createClassObjectAndWriteInFile() {
        try (FileOutputStream fos = new FileOutputStream("CreateClassObjectAndWriteInFile.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            Rocket rocketForNewFile = new Rocket(2000, "Ferrari");
            oos.writeObject(rocketForNewFile);

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        CreateClassObjectAndWriteInFile classObjectAndWriteInFile = new CreateClassObjectAndWriteInFile();
        classObjectAndWriteInFile.createClassObjectAndWriteInFile();
    }
}




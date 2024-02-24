package homework.day7.input_output_task;

import java.io.*;

// читает текст из файла, считает в тексте количество символов и выводит результат в консоль.
public class ReadAndWriteNumberOfChar {
    public void readAndWriteNumberOfChar() {
        int numberOfChar = 0;


        try {
            BufferedReader in = new BufferedReader(new FileReader("ReadAndWriteNumberOfChar.txt"));
            String line;
            while ((line = in.readLine()) != null) {
                numberOfChar += line.length();
            }
            in.close();

        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("The number of characters has been successfully counted ! \n" +
                "Number of characters in file: " + numberOfChar);


    }

    public static void main(String[] args) {
        ReadAndWriteNumberOfChar writeNumberOfChar = new ReadAndWriteNumberOfChar();

        writeNumberOfChar.readAndWriteNumberOfChar();
    }
}


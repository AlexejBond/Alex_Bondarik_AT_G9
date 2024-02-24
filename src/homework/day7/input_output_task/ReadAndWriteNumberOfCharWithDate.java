package homework.day7.input_output_task;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReadAndWriteNumberOfCharWithDate {

    public void readAndWriteNumberOfCharWithDate() {
        int numberOfChar = 0;


        try {
            BufferedReader in = new BufferedReader(new FileReader("ReadAndWriteNumberOfChar.txt"));
            String line;
            while ((line = in.readLine()) != null) {
                numberOfChar += line.length();
            }
            in.close();


            String newFileNameWithFDate = generateNewFileName();
            BufferedWriter out = new BufferedWriter(new FileWriter(newFileNameWithFDate));

            out.write("The number of characters has been successfully counted ! \n" +
                    "Number of characters in file: " + numberOfChar);

            System.out.println("The number of characters has been successfully counted ! \n" +
                    "Number of characters in file: " + numberOfChar);
            out.close();

        } catch (IOException e) {
            System.out.println(e);
        }


    }


    public String generateNewFileName() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
        Date currentDate = new Date();
        String fileName = simpleDateFormat.format(currentDate) + ".txt";
        return fileName;
    }

    public static void main(String[] args) {
        ReadAndWriteNumberOfCharWithDate processor = new ReadAndWriteNumberOfCharWithDate();
        processor.readAndWriteNumberOfCharWithDate();
    }

}

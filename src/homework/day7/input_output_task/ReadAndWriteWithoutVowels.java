package homework.day7.input_output_task;

import java.io.*;

// читает текст из файла, убирает из него все гласные и записывает новый текст в тот же файл, затирая оригинал.

public class ReadAndWriteWithoutVowels {

    public void readAndWriteTextWithoutVowels() {
//        String vowels = "aeiouAEIOU";

        try {
            BufferedReader in = new BufferedReader(new FileReader("ReadAndWriteWithoutVowels.txt"));
            String line;
            String inputMessage = "";
            while ((line = in.readLine()) != null) {

                String textWithoutVowels = line.replaceAll("[aeiouAEIOU]", "");
                inputMessage += textWithoutVowels;
            }
            in.close();

            BufferedWriter out = new BufferedWriter(new FileWriter("ReadAndWriteWithoutVowels.txt"));
            out.write(inputMessage);
            out.close();

        } catch (IOException e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        ReadAndWriteWithoutVowels withoutVowels = new ReadAndWriteWithoutVowels();
        withoutVowels.readAndWriteTextWithoutVowels();
        System.out.print("All vowels were successfully removed from the file ! ");
    }
}

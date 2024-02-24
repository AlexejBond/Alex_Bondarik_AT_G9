package homework.day7.input_output_task;

import java.io.*;

//читает текст из файла, убирает из него все согласные и
// записывает новый текст в тот же файл в конец, через пустую строку ниже оригинал.
public class ReadAndWriteWithoutConsonantsWithAppend {

    public void readAndWriteTextWithoutConsonantsWithAppend() {


        try {
            BufferedReader in = new BufferedReader(new FileReader("ReadAndWriteWithoutConsonantsWithAppend.txt"));
            String line;
            String inputMessage = "";
            while ((line = in.readLine()) != null) {

                String textWithoutVowels = line.replaceAll("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]", "");
                inputMessage += textWithoutVowels + "\n " ;
            }
            in.close();

            BufferedWriter out = new BufferedWriter(new FileWriter("ReadAndWriteWithoutConsonantsWithAppend.txt", true));
            out.write("\n\n\n" + inputMessage);
            out.close();

        } catch (IOException e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        ReadAndWriteWithoutConsonantsWithAppend withoutConsonantsWithAppend = new ReadAndWriteWithoutConsonantsWithAppend();

        withoutConsonantsWithAppend.readAndWriteTextWithoutConsonantsWithAppend();
        System.out.print("All consonants were successfully removed from the file and written below into the same file ! ");
    }
}





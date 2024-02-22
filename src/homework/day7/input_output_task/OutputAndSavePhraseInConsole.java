package homework.day7.input_output_task;

//записывает в файл фразу "Hello, I just got 'X' from you!", где Х - фраза, вводимая в консоль с клавиатуры.

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//public class OutputAndSavePhraseInConsole {
//    BufferedWriter out;
//    public BufferedWriter createBuffer () {
//        try {
//           BufferedWriter saveFile = new BufferedWriter(new FileWriter("OutputAndSavePhraseInConsole.txt"));
//            return saveFile;
//
//        }
//        catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        catch (IOException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    public String showInputMessage()  {
//
//        Scanner scanner = new Scanner(System.in);
//        String inputMessage = scanner.nextLine();
//        System.out.println("Hello, I just got " + inputMessage + " from you!");
//        return "Hello, I just got " + inputMessage + " from you!";
//
//    }
//
//
//    public static void main(String[] args) throws IOException {
//
//        OutputAndSavePhraseInConsole writerObj = new OutputAndSavePhraseInConsole();
//
//        String newA = writerObj.showInputMessage();
//        BufferedWriter bufferedWriter = writerObj.createBuffer();
//        bufferedWriter.write(newA);
//        bufferedWriter.close();
//
//    }
//}
//
//public class OutputAndSavePhraseInConsole {
//    public void saveTextInFile() {
//        Scanner scanner = new Scanner(System.in);
//        String savedMessage = scanner.nextLine();
//        System.out.println("Hello, I just got " + savedMessage + " from you!");
//        try {
//            BufferedWriter out = new BufferedWriter(new FileWriter("OutputAndSavePhraseInConsole.txt"));
//            out.write(savedMessage);
//            out.close();
//        } catch (IOException e) {
//            System.out.println(e);
//        }
//
//
//    }
//
//    public static void main(String[] args) {
//        OutputAndSavePhraseInConsole writeText = new OutputAndSavePhraseInConsole();
//        writeText.saveTextInFile();
//
//
//    }
//}


//    1. Метод для чтения ввода из консоль.
//    2. Создание буфера и файлик.
//    3. Метод записи в буфер.

public class OutputAndSavePhraseInConsole {

    public String consoleReader() {
        Scanner scanner = new Scanner(System.in);
        String savedMessage = scanner.nextLine();
        return savedMessage;
    }

    public BufferedWriter createBuffer(String fileName) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
            return out;
        } catch (IOException e) {
            System.out.println(e);
        }
        return null;
    }

    public String modifyText (String text) {
       return "Hello, I just got " + text + " from you!";
    }


    public void writeContent(BufferedWriter buffer, String content) {
        try {
            buffer.write(content);
            buffer.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        OutputAndSavePhraseInConsole writeAndSave = new OutputAndSavePhraseInConsole();
        System.out.print("Input text please : ");
        String content = writeAndSave.consoleReader();
        BufferedWriter buffer = writeAndSave.createBuffer("OutputAndSavePhraseInConsole.txt");
        content = writeAndSave.modifyText(content);
        writeAndSave.writeContent(buffer, content);
        System.out.println(content);

    }
}







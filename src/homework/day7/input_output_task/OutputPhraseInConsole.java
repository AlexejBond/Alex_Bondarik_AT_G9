package homework.day7.input_output_task;

import java.util.Scanner;

public class OutputPhraseInConsole {
    public void showInputMessage() {

        Scanner scanner = new Scanner(System.in);
        String inputMessage = scanner.nextLine();
        System.out.println("Hello, I just got " + inputMessage + " from you!");

    }


    public static void main(String[] args) {

        OutputPhraseInConsole outputmessage = new OutputPhraseInConsole();
        outputmessage.showInputMessage();

    }
}
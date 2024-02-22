package classwork.day6;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();
            if (incoming.equals("Stop Word")) {
                System.out.println("I found the Stop Word");
                break;
            }
            System.out.printf("Just got '%s' text!", incoming);
        }

    }
}

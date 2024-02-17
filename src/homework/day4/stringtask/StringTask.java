package homework.day4.stringtask;

public class StringTask {
    public static void main(String[] args) {
        StringTask ABCaller = new StringTask();
        ABCaller.columnPrinter("Hello");


    }
    public void columnPrinter (String text) {
        for (int i = 0; i <= text.length(); i++){
            System.out.println(text.charAt(i));
        }
    }
}
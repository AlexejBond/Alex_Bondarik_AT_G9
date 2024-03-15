package homework.day11;

public class Mouse {

    private String pattern = "Mouse <n>";
    private String name;

    public Mouse(int number) {
        name = pattern.replace("<n>", String.valueOf(number));
    }

    public void peep() {
        System.out.println(name + ": PEEP!");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

//    public static void main(String[] args) {
//        Mouse mouse = new Mouse(1);
//        mouse.peep();
//    }

}

package basetask;

public class TrainMethodsPrimitive {
    public static void main(String[] args) {
        int number = 10;
        long number2 = 123456789;
        char symbol = '&';
        float number3 = 3.14159265f;
        double number4 = 1.234565432876543345678;
        short number5 = 3;
        byte number6 = 1;
        boolean number7 = true;

        printInt(number);
        printLong(number2);
        printChar(symbol);
        printFloat(number3);
        printDouble(number4);
        printShort(number5);
        printByte(number6);
        printBoolean(number7);
        

    }


    public static void printInt (int num){
        System.out.println("Я получил на вход число " + num);
    }

    public static void printLong(long num2){
        System.out.println("Я получил на вход длинное число " + num2);
    }

    public static void printChar(char Character){
        System.out.println("Я получил на вход символ " + Character);
    }
    public static void printFloat(float num3){
        System.out.println("Я получил на вход дробное число " + num3);
    }
    public static void printDouble(double num4){
        System.out.println("Я получил на вход длинное дробное число " + num4);
    }
    public static void printShort(short num5){
        System.out.println("Я получил на вход короткое число " + num5);
    }
    public static void printByte(byte num6){
        System.out.println("Я получил на вход очень короткое число " + num6);
    }
    public static void printBoolean(boolean num7){
        System.out.println("Я получил на вход булево " + num7);
    }

}

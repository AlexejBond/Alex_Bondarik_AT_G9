package basetask;
//-- создать класс TrainMethodsReturnRunner с методом main, в котором создать обьект класса TrainMethodsReturn,
// и отпечатать в консоль значение,
//возвращаемое каждым из его методов в виде "метод <название метода> вернул " и возвращаемое значение

public class TrainMethodsReturnRunner {
    public static void main(String[] args) {
        TrainMethodsReturn tmr = new TrainMethodsReturn();

        int result1 = tmr.returnNewInt(5);
        System.out.println("Метод <returnNewInt> вернул : " + result1);

        long result2 = tmr.returnNewLong(10);
        System.out.println("Метод <returnNewLong> вернул : " + result2);

        String result3 = tmr.returnNewChar('&');
        System.out.println("Метод <returnNewChar> вернул : " + result3);

        float result4 = tmr.returnNewFloat(10.5f);
        System.out.println("Метод <returnNewFloat> вернул : " + result4);

        short result5 = tmr.returnNewShort((short)5);
        System.out.println("Метод <returnNewShort> вернул : " + result5);

        byte result6 = tmr.returnNewByte((byte)2);
        System.out.println("Метод <returnNewByte> вернул : " + result6);


        boolean result7 = tmr.returnNewBoolean(true);
        System.out.println("Метод <returnNewBoolean> вернул : " + result7);


    }
}


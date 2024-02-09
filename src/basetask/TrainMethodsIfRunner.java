package basetask;
//    создать класс TrainMethodsIfRunner с методом main, в котором создать обьект класса TrainMethodsIf,
//// и отпечатать в консоль значение, возвращаемое каждым из его методов в виде "метод <название метода> вернул "
// и возвращаемое значение,
//// последний метод просто вызвать

public class TrainMethodsIfRunner {
    public static void main(String[] args) {
        TrainMethodsIf tmi = new TrainMethodsIf();

//        int result1 = tmi.returnNewInt(7);
        System.out.println("Метод <returnNewInt> вернул : " + tmi.returnNewInt(7));
        System.out.println("Метод <returnNewLong> вернул : " + tmi.returnNewLong(100));
        System.out.println("Метод <returnNewChar> вернул : " + tmi.returnNewChar('~'));
        System.out.println("Метод <returnNewFloat> вернул : " + tmi.returnNewFloat((float) 0.13));
        System.out.println("Метод <returnNewDouble> вернул : " + tmi.returnNewDouble(50));
        tmi.returnNewBoolean(true);












    }
}

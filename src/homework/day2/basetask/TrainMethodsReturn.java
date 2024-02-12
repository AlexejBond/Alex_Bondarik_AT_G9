package homework.day2.basetask;


public class TrainMethodsReturn {
    public static void main(String[] args) {
        TrainMethodsReturn tmr = new TrainMethodsReturn();

        int result1 = tmr.returnNewInt(5);
        System.out.println("Result 1: " + result1);

        long result2 = tmr.returnNewLong(10);
        System.out.println("Result 2: " + result2);

        String result3 = tmr.returnNewChar('&');
        System.out.println("Result 3: " + result3);

        float result4 = tmr.returnNewFloat(10.5f);
        System.out.println("Result 4: " + result4);

        short result5 = tmr.returnNewShort((short) 5);
        System.out.println("Result 5: " + result5);

        byte result6 = tmr.returnNewByte((byte) 2);
        System.out.println("Result 6: " + result6);


        boolean result7 = tmr.returnNewBoolean(true);
        System.out.println("Result 7: " + result7);


    }


    public int returnNewInt(int num) {
        return num * 3;
    }

    public long returnNewLong(long num2) {
        return num2 - 4;
    }

    public String returnNewChar(char Character) {
        String newString = "" + Character + Character;
        return newString;
    }

    public float returnNewFloat(float num4) {
        return num4 / 2;

    }

    public short returnNewShort(short num5) {
        return (short) (num5 - 1);
    }

    public byte returnNewByte(short num6) {
        return (byte) (num6 * 2);
    }


    public boolean returnNewBoolean(boolean inputBoolean) {
        return !inputBoolean;
    }


}

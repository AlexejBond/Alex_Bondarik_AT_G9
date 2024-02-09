package basetask;


public class TrainMethodsIf {
    public static void main(String[] args) {
        
    }

    public int returnNewInt(int num) {
        if (num < 8) {
            return num * 7;
        }
        return num / 4;
    }
    public long returnNewLong(long num2) {
        if (num2 > 300) {
            return num2 - 300;
        }
        return num2 + 20;
    }

    public String returnNewChar(char char1) {
        if (char1 == 'g') {
            return "go";
        }
        else {
            return "o" + char1;
        }
    }

    public float returnNewFloat(float num3) {
        if (num3 == 0.67) {
            return num3;
        }
        return num3 * 3;
    }

    public double returnNewDouble(double num4) {
        if (num4 > 30 && num4 < 80) {
            return num4 + 87;
        } else if (num4 > 80 && num4 < 400) {
            return num4 - 87;
        } else if (num4 > 400) {
            return num4 / 4;
        } else {
            return num4;
        }
    }

    public void returnNewBoolean (boolean booleanInput) {
        if (booleanInput == true) {
            System.out.println("Я получил на вход значение истины");
        }
        else {
            System.out.println("Я получил на вход ложь");
        }
    }


}


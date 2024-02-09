package basetask;

public class TrainMethodsString {
    public static void printMama () {
        System.out.println("мама мыла раму");
    }
    public static void printPapa () {
        System.out.println("папа мыл раму");
    }
    public static void printString(String thisString){
        System.out.println(thisString);


    }
    public static void printMamaString(String mamaString){
        System.out.println("мама мыла " + mamaString);
    }


    public static void main(String[] args) {
        printMama();
        printPapa();
        printString("Кто еще сыл раму ?");
        printMamaString("раму !");

    }
}

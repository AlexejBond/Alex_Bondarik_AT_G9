package cycletask;

public class CycleClassRunner {
    public static void main(String[] args) {
        CycleClass1 cycleClass1 = new CycleClass1();
        CycleClass2 cycleClass2 = new CycleClass2();
        CycleClass3 cycleClass3 = new CycleClass3();
        CycleClass4 cycleClass4 = new CycleClass4();
        CycleClass5 cycleClass5 = new CycleClass5();
        CycleClass6 cycleClass6 = new CycleClass6();
        CycleClass7 cycleClass7 = new CycleClass7();
        CycleClass8 cycleClass8 = new CycleClass8();
        CycleClass9 cycleClass9 = new CycleClass9();
        CycleClass10 cycleClass10 = new CycleClass10();

        int[] array = {77, 3, 7, 4, 2, 111, 33};

        cycleClass1.printResult();
        System.out.println();
        cycleClass2.printResult2();
        System.out.println();
        cycleClass3.printResult3();
        System.out.println();
        cycleClass4.printResult4(array);
        System.out.println();
        cycleClass5.printResult5(array);
        System.out.println();
        cycleClass6.printResult6(array);
        System.out.println();
        cycleClass7.printResult7(array);
        System.out.println();
        cycleClass8.printResult8(array);
        cycleClass9.printResult9(array);
        System.out.println();
        cycleClass10.printResult10(array);




    }
}

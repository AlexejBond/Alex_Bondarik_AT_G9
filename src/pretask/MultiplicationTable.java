package pretask;
//класс MultiplicationTable, используя цикл for,
//выведите на экран таблицу умножения для числа 5 (1  5, 2  5, и так далее);


public class MultiplicationTable {
    public static void main(String[] args) {
        int num = 5;
        for (int i =1; i <= 50; i++){
            System.out.println(i + " * " + num + " = " + (i * num));
        }

    }
}

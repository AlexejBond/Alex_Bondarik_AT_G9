package basetask;
//- создать класс Bee и в нем
//-- строковое поле gender
//-- длинное целочисленное поле weight
//-- конструктор, принимающий пол и массу и инициализирующий соответствующие поля
//-- геттеры и сеттеры на каждое поле
//-- невозвратный метод printBeeDetails, который делит 500 кг на массу пчелы
//и печатает в консоль информацию о ней в виде "Я легче лося в <> раз"
public class Bee {
    String gender;
    long weight;

    public Bee (String gender, long weight) {
        this.gender = gender;
        this.weight = weight;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void printBeeDetails() {
        double result = 500.0 / weight;
        System.out.println("Я легче лося в " + result + " раз");
    }

    public static void main(String[] args) {
        Bee bee = new Bee ("Male", 36);
        bee.printBeeDetails();
    }
}

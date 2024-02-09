package basetask;

public class Pineapple {
    String grade;
    double heatCapacity;

    public Pineapple(String grade, double heatCapacity){
        this.grade = grade;
        this.heatCapacity =heatCapacity;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getHeatCapacity() {
        return heatCapacity;
    }

    public void setHeatCapacity(double heatCapacity) {
        this.heatCapacity = heatCapacity;
    }

    //-- невозвратный метод printPineappleDetails, который сравнивает теплоемкость ананаса с 2140 и если она больше,
// то печатает в консоль "Я ананас, теплоемкость которого больше, чем у ветчины", в противном случае печатает в консоль
// "В ветчине тепла запасется больше :(

    public void printPineappleDetails(){
        if (heatCapacity > 2140) {
            System.out.println("Я ананас, теплоемкость которого больше, чем у ветчины");
        }
        System.out.println("В ветчине тепла запасется больше :( ");
    }

    public static void main(String[] args) {
        Pineapple pineapple = new Pineapple("хороший", 2000);
        pineapple.printPineappleDetails();
    }

}

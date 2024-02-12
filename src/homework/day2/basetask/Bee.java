package homework.day2.basetask;


public class Bee {
    String gender;
    long weight;

    public Bee(String gender, long weight) {
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
        Bee bee = new Bee("Male", 36);
        bee.printBeeDetails();
    }
}

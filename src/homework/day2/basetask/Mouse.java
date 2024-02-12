package homework.day2.basetask;

public class Mouse {
    String name;
    int age;


    public Mouse(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printMouseDetails() {
        System.out.println("Я мышь, меня зовут " + name + " и мне " + age + " лет");
    }

    public static void main(String[] args) {
        Mouse newMouse = new Mouse("Кнопка", 5);
        newMouse.printMouseDetails();

        newMouse.setAge(10);
        newMouse.printMouseDetails();

        newMouse.setName("Выжившая");
        newMouse.printMouseDetails();

    }


}

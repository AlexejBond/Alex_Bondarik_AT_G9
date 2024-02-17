package project.bubbletask;

// Bubble:
// содеждит приватные поля double volume = 0.3, String gas;
// содержит конструктор Bubble(String gas), в который передается строка с названием газа пузырька
// есть публичный метод void cramp(), который в консоль выводит слово "Cramp!"
// есть публичный метод double getVolume(), возвращающий обьем пузырька

public class Bubble {
    private final double volume = 0.3;
    private String gas;

    public Bubble(String gas) {
        this.gas = gas;
    }

    public void cramp() {
        System.out.println("Cramp!");
    }

    public String getGas() {
        return this.gas;
    }

    public double getVolume() {
        return this.volume;
    }

    // public static void main(String[] args) {
    //     Bubble bubble = new Bubble("Oxygen");
    //     bubble.cramp();
    //     System.out.println(bubble.getGas());
    //     System.out.println(bubble.getVolume());
    // }
}

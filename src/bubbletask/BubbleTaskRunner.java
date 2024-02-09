package bubbletask;

public class BubbleTaskRunner {
        public static void main(String[] args) {
            // Создаем пузырек с газовым составом кислород
            Bubble oxygenBubble = new Bubble("Oxygen");


            // Получаем газовый состав и выводим его в консоль
            System.out.println("Газовый состав пузырька: " + oxygenBubble.getGasComposition());

            // Лопаем пузырек
            oxygenBubble.burst();

            SparklingWater sw = new SparklingWater("Бесцветный", "100%", "Без запаха", 3);
            System.out.println(sw.getTemperature());




        }

}

package project.bubbletask;

    public abstract class Water {
        private String color;
        private String transparency;
        private String smell;
        private double temperature;

        // Конструктор класса
        public Water(String color, String transparency, String smell, double temperature) {
            this.color = color;
            this.transparency = transparency;
            this.smell = smell;
            this.temperature = temperature;
        }

        // Геттеры и сеттеры для характеристик воды
        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getTransparency() {
            return transparency;
        }

        public void setTransparency(String transparency) {
            this.transparency = transparency;
        }

        public String getSmell() {
            return smell;
        }

        public void setSmell(String smell) {
            this.smell = smell;
        }

        public double getTemperature() {
            return temperature;
        }

        public void setTemperature(double temperature) {
            this.temperature = temperature;
        }
    }


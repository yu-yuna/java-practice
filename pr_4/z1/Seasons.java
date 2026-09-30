package pr_4.z1;

public enum Seasons {
    WINTER(-5),
    SPRING(10),
    SUMMER(25) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(8);

    private final double averageTemperature;

    Seasons(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        return "Холодное время года";
    }

    public void printLove() {
        switch (this) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }

    @Override
    public String toString() {
        switch (this) {
            case WINTER:
                return "Зима: температура = "
                        + averageTemperature + ", "
                        + getDescription();

            case SPRING:
                return "Весна: температура = "
                        + averageTemperature + ", "
                        + getDescription();

            case SUMMER:
                return "Лето: температура = "
                        + averageTemperature + ", "
                        + getDescription();

            case AUTUMN:
                return "Осень: температура = "
                        + averageTemperature + ", "
                        + getDescription();

            default:
                return "";
        }
    }
}
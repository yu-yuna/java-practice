package pr_20.z4;

public class Test {

    public static void main(String[] args) {

        // MinMax
        Integer[] numbers = {5, 2, 9, 1, 7};
        MinMax<Integer> minMax = new MinMax<>(numbers);
        System.out.println("Мин: " + minMax.getMin());
        System.out.println("Макс: " + minMax.getMax());

        // Calculator
        System.out.println("\nКалькулятор:");
        System.out.println("Сложение: "
                + Calculator.sum(10, 5.5));

        System.out.println("Умножение: "
                + Calculator.multiply(10, 5.5));

        System.out.println("Деление: "
                + Calculator.divide(10, 5.0));

        System.out.println("Вычитание: "
                + Calculator.subtraction(10, 5.5));
    }
}

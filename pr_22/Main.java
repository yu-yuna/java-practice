package pr_22;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RPNCalculator calculator = new RPNCalculator();

        while (true) {
            System.out.print("Введите выражение (ex для выхода): ");
            String expression = sc.nextLine();

            if (expression.equalsIgnoreCase("ex")) {
                System.out.println("Выход");
                break;
            }

            try {
                double result = calculator.calculate(expression);
                System.out.println("Результат: " + result);
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }

        sc.close();
    }
}
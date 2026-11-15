package pr_18.z4;
import java.util.Scanner;

public class Exception4 {

    public void exceptionDemo() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число: ");

        try {
            String intString = sc.next();
            int i = Integer.parseInt(intString);
            System.out.println("Результат: " + 100 / i);

        } catch (NumberFormatException ex) {
            System.out.println("Ошибка: некорректное число");

        } catch (ArithmeticException ex) {
            System.out.println("Ошибка: деление на ноль");

        } finally {
            System.out.println("Блок finally");
        }

        sc.close();
    }
}
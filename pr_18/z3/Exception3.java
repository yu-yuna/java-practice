package pr_18.z3;

import java.util.Scanner;

public class Exception3 {

    public void exceptionDemo() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите целое число: ");

        try {
            String intString = sc.next();
            int i = Integer.parseInt(intString);
            System.out.println("Результат: " + 100 / i);

        } catch (Exception ex) {
            System.out.println("Ошибка");
            
        } /*catch (NumberFormatException e) {
            System.out.println("Ошибка: некорректное число");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль");
        }*/

        sc.close();
    }
}
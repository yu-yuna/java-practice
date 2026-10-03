package pr_7.z4;

import java.util.Scanner;

public class MathTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MathCalculable math = new MathFunc();
        System.out.print("Введите число: ");
        double number = sc.nextDouble();
        System.out.print("Введите степень: ");
        double degree = sc.nextDouble();
        System.out.println("Результат возведения в степень: "
                + math.pow(number, degree));

        System.out.print("\nВведите действительную часть комплексного числа: ");
        double real = sc.nextDouble();
        System.out.print("Введите мнимую часть комплексного числа: ");
        double imaginary = sc.nextDouble();
        System.out.println("Модуль комплексного числа: "
                + math.abs(real, imaginary));

        MathFunc func = new MathFunc();

        System.out.print("\nВведите радиус окружности: ");
        double radius = sc.nextDouble();
        System.out.println("Длина окружности: "
                + func.circleLength(radius));

        System.out.println("PI = " + MathCalculable.PI);

        sc.close();
    }
}

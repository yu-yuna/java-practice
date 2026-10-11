package pr_8;

import java.util.Scanner;

public class Main12 {

    void printOdd() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Нечётные числа:");
            return;
        }

        printOdd();

        if (n % 2 != 0) {
            System.out.println(n);
        }

        sc.close();
    }

    void main() {
        System.out.println("Введите числа(0 = коненц):D");
        printOdd();
    }
}
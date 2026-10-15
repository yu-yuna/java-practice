package pr_8;

import java.util.Scanner;

public class Main5 {

    static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }

        return n % 10 + sumDigits(n / 10);
    }

    void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите: ");
        int n = sc.nextInt();

        System.out.println("Сумма цифр: " + sumDigits(n));
        sc.close();
    }
}
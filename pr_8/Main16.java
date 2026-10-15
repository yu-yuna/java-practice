package pr_8;

import java.util.Scanner;

public class Main16 {

    int max = 0;
    int count = 0;

    void findMax() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Макс число: " + max);
            System.out.println("Кол-во макс элементов: " + count);
            return;
        }

        if (n > max) {
            max = n;
            count = 1;
        } else if (n == max) {
            count++;
        }

        findMax();
        sc.close();
    }

    void main() {
        System.out.println("Введите числа(0 = коненц):D");
        findMax();
    }
}
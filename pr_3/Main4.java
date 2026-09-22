package pr_3;

import java.util.Random;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args){
        Random random = new Random();
        Scanner sc  = new Scanner(System.in);
        int n;
        do {
            System.out.print("Введите размер: ");
            n = sc.nextInt();
        } while (n <= 0);

        int[] num = new int[n];

        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(n + 1);
        }

        System.out.print("Первый: ");

        for (int number : num) {
            System.out.print(number + " ");
        }

        int e = 0;

        for (int number : num) {
            if (number % 2 == 0) {
                e++;
            }
        }

        int[] num2 = new int[e];
        int j = 0;

        for (int number : num) {
            if (number % 2 == 0) {
                num2[j] = number;
                j++;
            }
        }

        System.out.print("\nВторой: ");
        for (int number : num2) {
            System.out.print(number + " ");
        }
        System.out.println("\n");

        sc.close();


    }
    
}

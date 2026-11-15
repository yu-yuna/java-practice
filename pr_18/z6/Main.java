package pr_18.z6;

import java.util.Scanner;

public class Main {

    void main() {

        Scanner sc = new Scanner(System.in);
        ThrowsDemo demo = new ThrowsDemo();
        System.out.print("Введите ключ: ");
        String key = sc.nextLine();

        if (key.isEmpty()) {
            key = null;
        }

        try {
            demo.printMessage(key);

        } catch (NullPointerException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        sc.close();
    }
}
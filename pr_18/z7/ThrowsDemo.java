package pr_18.z7;

import java.util.Scanner;

public class ThrowsDemo {

    public void getKey() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Введите ключ: ");
            String key = sc.nextLine();

            try {
                printDetails(key);
                break;
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
                System.out.println("Введите ключ ещё раз");
            }
        }

        sc.close();
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.isEmpty()) {
            throw new Exception("Пустой ключ");
        }

        return "Данные ключа: " + key;
    }
}
package pr_18.z5;

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
        
        demo.getDetails(key);
        sc.close();
    }
}
package pr_14;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main7 {

    void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите пароль: ");
        String password = sc.nextLine();

        String regex =
                "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)[A-Za-z\\d_]{8,}$";

        boolean result = Pattern.matches(regex, password);

        System.out.println("Надёжный пароль: " + result);

        sc.close();
    }
}
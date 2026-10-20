package pr_14;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main4 {

    void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str = sc.nextLine();

        String regex = "\\d\\s*\\+";

        boolean result =
                Pattern.compile(regex)
                        .matcher(str)
                        .find();

        System.out.println("Результат: " + result);

        sc.close();
    }
}
package pr_14;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main2 {

    void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str = sc.nextLine();

        String regex = "abcdefghijklmnopqrstuv18340";

        System.out.println(
                Pattern.matches(regex, str)
        );

        sc.close();
    }
}
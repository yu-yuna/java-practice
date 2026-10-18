package pr_11;

import java.util.Date;
import java.util.Scanner;

public class Main2 {

    void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = sc.nextInt();

        System.out.print("Введите месяц: ");
        int month = sc.nextInt();

        System.out.print("Введите день: ");
        int day = sc.nextInt();

        Date currentDate = new Date();

        Date enteredDate = new Date(
                year - 1900,
                month - 1,
                day
        );

        System.out.println("\nТекущая дата: " + currentDate);
        System.out.println("Введённая дата: " + enteredDate);

        if (enteredDate.before(currentDate)) {
            System.out.println("Введённая дата раньше текущей.");
        } else if (enteredDate.after(currentDate)) {
            System.out.println("Введённая дата позже текущей.");
        } else {
            System.out.println("Даты совпадают.");
        }

        sc.close();
    }
}
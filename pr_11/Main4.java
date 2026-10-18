package pr_11;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main4 {

    void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = sc.nextInt();

        System.out.print("Введите месяц: ");
        int month = sc.nextInt();

        System.out.print("Введите день: ");
        int day = sc.nextInt();

        System.out.print("Введите час: ");
        int hour = sc.nextInt();

        System.out.print("Введите минуты: ");
        int minute = sc.nextInt();

        Calendar calendar = Calendar.getInstance();

        calendar.set(
                year,
                month - 1,
                day,
                hour,
                minute
        );

        Date date = calendar.getTime();

        System.out.println("\nCalendar:");
        System.out.println(calendar.getTime());

        System.out.println("\nDate:");
        System.out.println(date);

        sc.close();
    }
}
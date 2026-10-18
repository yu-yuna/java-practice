package pr_11;

import java.util.Date;
import java.util.Scanner;

public class Main1 {

    void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите фамилию разработчика: ");
        String surname = sc.nextLine();

        System.out.print("Введите дату и время получения задания: ");
        String dateOfReceiving = sc.nextLine();

        Date dateOfSubmission = new Date();

        System.out.println("\nФамилия разработчика: " + surname);
        System.out.println("Дата и время получения задания: "
                + dateOfReceiving);
        System.out.println("Дата и время сдачи задания: "
                + dateOfSubmission);

        sc.close();
    }
}
package pr_19.z1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите ФИО клиента: ");
        String fio = sc.nextLine();

        System.out.print("Введите ИНН: ");
        String inn = sc.nextLine();

        System.out.println("Клиент: " + fio);
        InvalidInnException.checkInn(inn);

        sc.close();
    }
}
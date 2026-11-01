package pr_17.z3;

import pr_17.z2.Student;
import java.util.Scanner;

public class Main {

    void main() {

        Scanner sc = new Scanner(System.in);

        StudentQueue queue = null;

        int choice;

        do {
            System.out.println("\n--- МЕНЮ ---");
            System.out.println("1. Создать пустую");
            System.out.println("2. Добавить студента");
            System.out.println("3. Удалить студента");
            System.out.println("4. Вывести");
            System.out.println("5. Очистить");
            System.out.println("6. Пустая?");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    queue = new StudentQueue();
                    System.out.println("Создана пустая очередь.");
                    break;

                case 2:
                    if (queue == null) {
                        System.out.println("Сначала создайте пустую очередь.");
                        break;
                    }

                    Student student = new Student();
                    student.input(sc);
                    queue.add(student);
                    System.out.println("Студент добавлен.");
                    break;

                case 3:
                    if (queue == null) {
                        System.out.println("Сначала создайте пустую очередь.");
                        break;
                    }

                    queue.remove();
                    break;

                case 4:
                    if (queue == null) {
                        System.out.println("Сначала создайте пустую очередь.");
                        break;
                    }

                    queue.output();
                    break;

                case 5:
                    if (queue == null) {
                        System.out.println("Сначала создайте пустую очередь.");
                        break;
                    }

                    queue.clear();
                    System.out.println("Очередь очищена.");
                    break;

                case 6:
                    if (queue == null) {
                        System.out.println("Очередь ещё не создана.");
                    } else if (queue.isEmpty()) {
                        System.out.println("Очередь пуста.");
                    } else {
                        System.out.println("Очередь не пуста.");
                    }
                    break;

                case 0:
                    System.out.println("Выход.");
                    break;

                default:
                    System.out.println("Неверный пункт меню.");
            }

        } while (choice != 0);

        sc.close();
    }
}
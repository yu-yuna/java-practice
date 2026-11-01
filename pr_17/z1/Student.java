package pr_17.z1;

import java.util.Scanner;

public class Student {

    String name;
    int age;

    Student next;

    public Student() {
    }

    public void input(Scanner sc) {

        System.out.print("Введите имя: ");
        name = sc.nextLine();

        System.out.print("Введите возраст: ");
        age = sc.nextInt();
        sc.nextLine();
    }

    public void output() {
        System.out.println(
                "Имя: " + name +
                ", возраст: " + age
        );
    }
}
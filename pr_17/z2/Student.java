package pr_17.z2;

import java.util.Scanner;

public class Student {

    String name;
    int age;

    public Student next;
    public Student prev;

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
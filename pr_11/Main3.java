package pr_11;

import java.util.Date;

public class Main3 {

    void main() {

        Student[] students = {
                new Student("Иван Иванов", new Date(105, 4, 15)),
                new Student("Анна Петрова", new Date(104, 8, 23)),
                new Student("Пётр Сидоров", new Date(106, 1, 10)),
                new Student("Мария Смирнова", new Date(103, 11, 5))
        };

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
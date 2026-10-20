package pr_11;

import java.util.Date;

public class Main3 {

    void main() {

        Date date1 = new Date(2005 - 1900, 5 - 1, 15);
        Date date2 = new Date(2004 - 1900, 9 - 1, 23);
        Date date3 = new Date(2006 - 1900, 2 - 1, 10);
        Date date4 = new Date(2003 - 1900, 12 - 1, 5);

        Student[] students = {
                new Student("Иван Иванов", date1),
                new Student("Анна Петрова", date2),
                new Student("Пётр Сидоров", date3),
                new Student("Мария Смирнова", date4)
        };

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
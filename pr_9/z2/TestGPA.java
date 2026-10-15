package pr_9.z2;

import pr_9.z1.Student;

public class TestGPA {

    void main() {

        Student[] students = {
            new Student(105, "Иван", 4.2),
            new Student(102, "Анна", 4.8),
            new Student(104, "Пётр", 3.9),
            new Student(101, "Мария", 4.0),
            new Student(103, "Олег", 4.5)
        };

        GPAComparator sorting = new GPAComparator();

        sorting.quickSort(students, 0, students.length - 1);

        System.out.println("Студенты по GPA:");

        for (Student student : students) {
            System.out.println(
                student.iDNumber + " " +
                student.name + " " +
                student.GPA
            );
        }
    }
}
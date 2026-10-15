package pr_9.z1;

public class TestStudent {

    void main() {

        Student[] students = {
            new Student(105, "Иван"),
            new Student(102, "Анна"),
            new Student(104, "Пётр"),
            new Student(101, "Мария"),
            new Student(103, "Олег")
        };

        Student student = students[0];
        student.insertionSort(students);

        System.out.println("Отсортированный список:");

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
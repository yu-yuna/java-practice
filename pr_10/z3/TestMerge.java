package pr_10.z3;

import pr_9.z1.Student;

public class TestMerge {

    void main() {

        Student[] students1 = {
            new Student(101, "Мария", "Смирнова",
                    "ИВТ", 2, "ИВТ-1", 5.0),

            new Student(103, "Олег", "Кузнецов",
                    "ИВТ", 2, "ИВТ-2", 4.5),

            new Student(105, "Иван", "Иванов",
                    "ИВТ", 2, "ИВТ-2", 4.2)
        };

        Student[] students2 = {
            new Student(102, "Анна", "Петрова",
                    "ИВТ", 2, "ИВТ-1", 4.8),

            new Student(104, "Пётр", "Сидоров",
                    "ИВТ", 2, "ИВТ-2", 3.9),

            new Student(106, "Елена", "Волкова",
                    "ИВТ", 2, "ИВТ-1", 4.7)
        };

        MergeStudents mergeStudents = new MergeStudents();

        Student[] result =
            mergeStudents.merge(students1, students2);

        System.out.println("Объединённый отсортированный список:");

        mergeStudents.outArray(result);
    }
}

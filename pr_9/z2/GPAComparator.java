package pr_9.z2;

import pr_9.z1.Student;
import java.util.Comparator;

public class GPAComparator implements Comparator<Student> {

    public Student[] students;

    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.GPA, s1.GPA);
    }

    public void setArray() {

        students = new Student[] {

            new Student(
                105, "Иван", "Иванов",
                "ИВТ", 2, "ИВТ-2", 4.2
            ),

            new Student(
                102, "Анна", "Петрова",
                "ИВТ", 2, "ИВТ-1", 4.8
            ),

            new Student(
                104, "Пётр", "Сидоров",
                "ИВТ", 2, "ИВТ-2", 3.9
            ),

            new Student(
                101, "Мария", "Смирнова",
                "ИВТ", 2, "ИВТ-1", 5.0
            ),

            new Student(
                103, "Олег", "Кузнецов",
                "ИВТ", 2, "ИВТ-2", 4.5
            )
        };
    }

    public void quickSort(Student[] students, int left, int right) {

        int i = left;
        int j = right;

        Student pivot = students[(left + right) / 2];

        while (i <= j) {

            while (compare(students[i], pivot) < 0) {
                i++;
            }

            while (compare(students[j], pivot) > 0) {
                j--;
            }

            if (i <= j) {

                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;

                i++;
                j--;
            }
        }

        if (left < j) {
            quickSort(students, left, j);
        }

        if (i < right) {
            quickSort(students, i, right);
        }
    }

    public void mergeSort(Student[] students, int left, int right) {

        if (left >= right) {
            return;
        }

        int middle = (left + right) / 2;

        mergeSort(students, left, middle);
        mergeSort(students, middle + 1, right);

        merge(students, left, middle, right);
    }

    public void merge(Student[] students,
                      int left,
                      int middle,
                      int right) {

        Student[] temp = new Student[right - left + 1];

        int i = left;
        int j = middle + 1;
        int k = 0;

        while (i <= middle && j <= right) {

            if (compare(students[i], students[j]) <= 0) {

                temp[k] = students[i];
                i++;

            } else {

                temp[k] = students[j];
                j++;
            }

            k++;
        }

        while (i <= middle) {

            temp[k] = students[i];
            i++;
            k++;
        }

        while (j <= right) {

            temp[k] = students[j];
            j++;
            k++;
        }

        for (i = 0; i < temp.length; i++) {
            students[left + i] = temp[i];
        }
    }

    public void outArray() {

        for (Student student : students) {

            System.out.println(
                student.iDNumber + " " +
                student.name + " " +
                student.surname + " " +
                student.speciality + " " +
                student.course + " " +
                student.group + " " +
                student.GPA
            );
        }
    }
}
package pr_9.z2;

import pr_9.z1.Student;
import java.util.Comparator;

public class GPAComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.GPA, s1.GPA);
    }

    void quickSort(Student[] students, int left, int right) {

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
}
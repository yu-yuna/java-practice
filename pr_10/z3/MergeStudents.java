package pr_10.z3;

import pr_9.z1.Student;

public class MergeStudents {

    public Student[] merge(Student[] students1, Student[] students2) {

        Student[] result =
            new Student[students1.length + students2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < students1.length && j < students2.length) {

            if (students1[i].iDNumber < students2[j].iDNumber) {
                result[k] = students1[i];
                i++;
            } else {
                result[k] = students2[j];
                j++;
            }

            k++;
        }

        while (i < students1.length) {
            result[k] = students1[i];
            i++;
            k++;
        }

        while (j < students2.length) {
            result[k] = students2[j];
            j++;
            k++;
        }

        return result;
    }

    public void outArray(Student[] students) {

        for (Student student : students) {
            System.out.println(
                student.iDNumber + " " +
                student.name + " " +
                student.surname
            );
        }
    }
}
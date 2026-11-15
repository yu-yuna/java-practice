package pr_19.z2;

public class GPAComparator implements Interface {

    @Override
    public void sort(Student[] students) {
        mergeSort(students, 0, students.length - 1);
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

            if (students[i].GPA >= students[j].GPA) {
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

    @Override
    public Student findStudent(Student[] students,
                               String name,
                               String surname)
            throws StudentNotFoundException {

        return StudentNotFoundException.checkStudent(
                students, name, surname
        );
    }
}
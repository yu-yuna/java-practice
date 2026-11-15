package pr_19.z2;

public interface Interface {

    void sort(Student[] students);

    Student findStudent(Student[] students, String name, String surname)
            throws StudentNotFoundException;
}
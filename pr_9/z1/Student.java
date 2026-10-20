package pr_9.z1;
public class Student {

    public int iDNumber;
    public String name;
    public String surname;
    public String speciality;
    public int course;
    public String group;
    public double GPA;

    // Для задания 1
    Student(int iDNumber, String name) {
        this.iDNumber = iDNumber;
        this.name = name;
    }

    // Для задания 2.9
    public Student(int iDNumber, String name, double GPA) {
        this.iDNumber = iDNumber;
        this.name = name;
        this.GPA = GPA;
    }

    // Для практической 10
    public Student(int iDNumber, String name, String surname,
                   String speciality, int course, String group, double GPA) {
        this.iDNumber = iDNumber;
        this.name = name;
        this.surname = surname;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
        this.GPA = GPA;
    }

    void insertionSort(Student[] students) {

        for (int i = 1; i < students.length; i++) {

            Student current = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].iDNumber > current.iDNumber) {
                students[j + 1] = students[j];
                j--;
            }

            students[j + 1] = current;
        }
    }

    @Override
    public String toString() {
        return iDNumber + " " + name;
    }
}
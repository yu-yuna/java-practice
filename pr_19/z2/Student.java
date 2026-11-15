package pr_19.z2;

public class Student {

    public int iDNumber;
    public String name;
    public String surname;
    public String speciality;
    public int course;
    public String group;
    public double GPA;

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
}
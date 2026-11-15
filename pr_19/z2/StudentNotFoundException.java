package pr_19.z2;

public class StudentNotFoundException extends Exception {

    public StudentNotFoundException(String message) {
        super(message);
    }

    public static Student checkStudent(Student[] students,String name, String surname) {

        try {
            for (Student student : students) {

                if (student.name.equalsIgnoreCase(name)
                        && student.surname.equalsIgnoreCase(surname)) {
                    return student;
                }
            }

            throw new StudentNotFoundException(
                    "Студент " + name + " " + surname + " не найден"
            );

        } catch (StudentNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage());
            return null;
        }
    }
}
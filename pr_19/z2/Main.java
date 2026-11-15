package pr_19.z2;

public class Main {

    public static void main(String[] args) throws StudentNotFoundException {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        Student[] students = {

                new Student(105, "Иван", "Иванов",
                        "ИВТ", 2, "ИВТ-2", 4.2),

                new Student(102, "Анна", "Петрова",
                        "ИВТ", 2, "ИВТ-1", 4.8),

                new Student(104, "Пётр", "Сидоров",
                        "ИВТ", 2, "ИВТ-2", 3.9),

                new Student(101, "Мария", "Смирнова",
                        "ИВТ", 2, "ИВТ-1", 5.0),

                new Student(103, "Олег", "Кузнецов",
                        "ИВТ", 2, "ИВТ-2", 4.5)
        };

        Interface[] operations = {
                new GPAComparator()
        };

        System.out.println("1. Сортировка студентов по GPA");
        System.out.println("2. Поиск студента по ФИО");

        System.out.print("Выберите действие: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {

            case 1:

                operations[0].sort(students);

                System.out.println("\nСтуденты по GPA:");

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

                break;

            case 2:

                System.out.print("Введите имя: ");
                String name = sc.nextLine();

                System.out.print("Введите фамилию: ");
                String surname = sc.nextLine();

                Student found = operations[0].findStudent(
                        students, name, surname
                );

                if (found != null) {

                    System.out.println("Студент найден:");

                    System.out.println(
                            found.iDNumber + " " +
                            found.name + " " +
                            found.surname + " " +
                            found.speciality + " " +
                            found.course + " " +
                            found.group + " " +
                            found.GPA
                    );
                }

                break;

            default:
                System.out.println("Неверое знач");
        }

        sc.close();
    }
}
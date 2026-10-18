package pr_13;

public class Main2 {

    void main() {

        Person person1 = new Person(
                "Иванов",
                "Иван",
                "Иванович"
        );

        Person person2 = new Person(
                "Петров",
                "Анна",
                null
        );

        Person person3 = new Person(
                "Сидоров",
                null,
                null
        );

        System.out.println(person1.getFullName());
        System.out.println(person2.getFullName());
        System.out.println(person3.getFullName());
    }
}
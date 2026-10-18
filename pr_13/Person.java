package pr_13;

public class Person {

    String surname;
    String name;
    String patronymic;

    Person(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    String getFullName() {

        StringBuilder result = new StringBuilder(surname);

        if (name != null && !name.isEmpty()) {
            result.append(" ")
                  .append(name.charAt(0))
                  .append(".");
        }

        if (patronymic != null && !patronymic.isEmpty()) {
            result.append(" ")
                  .append(patronymic.charAt(0))
                  .append(".");
        }

        return result.toString();
    }
}
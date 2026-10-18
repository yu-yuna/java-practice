package pr_11;

import java.util.Date;
import java.text.DateFormat;

public class Student {

    String name;
    Date birthDate;

    Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        DateFormat format = DateFormat.getDateInstance(DateFormat.MEDIUM);
        return name + " " + format.format(birthDate);
    }
}
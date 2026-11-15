package pr_19.z1;

import java.util.regex.Pattern;

public class InvalidInnException extends Exception {

    public InvalidInnException(String message) {
        super(message);
    }

    public static void checkInn(String inn) {

        String lengthRegex = "^.{12}$";
        String digitsRegex = "^\\d+$";

        try {
            if (!Pattern.matches(lengthRegex, inn)) {
                throw new InvalidInnException(
                        "ИНН должен содержать 12 симв"
                );
            }

            if (!Pattern.matches(digitsRegex, inn)) {
                throw new InvalidInnException(
                        "ИНН должен содержать только циф"
                );
            }

            System.out.println("ИНН действителен!");

        } catch (InvalidInnException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
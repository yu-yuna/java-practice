package pr_13;

public class PhoneNumber {

    String formatPhone(String phone) {

        String countryCode;
        String number;

        if (phone.startsWith("+")) {

            // +7XXXXXXXXXX или +1XXXXXXXXXX
            countryCode = phone.substring(0, 2);
            number = phone.substring(2);

        } else if (phone.startsWith("8")) {

            // формат 8XXXXXXXXXX
            countryCode = "+7";
            number = phone.substring(1);

        } else {
            return "Неверный формат номера";
        }

        return countryCode
                + number.substring(0, 3)
                + "-"
                + number.substring(3, 6)
                + "-"
                + number.substring(6, 10);
    }
}
package pr_13;

public class Main5 {

    void main() {

        PhoneNumber phone = new PhoneNumber();

        String number1 = "+79175655655";
        String number2 = "+104289652211";
        String number3 = "89175655655";

        System.out.println(phone.formatPhone(number1));
        System.out.println(phone.formatPhone(number2));
        System.out.println(phone.formatPhone(number3));
    }
}
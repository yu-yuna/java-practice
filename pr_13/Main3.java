package pr_13;

public class Main3 {

    void main() {

        String[] addresses = {
                "Россия, Московская область, Москва, Ленина, 10, 2, 15",
                "Россия, Ленинградская область, Санкт-Петербург, Невский, 25, 1, 42",
                "Россия, Тульская область, Тула, Советская, 8, 3, 21",
                "Россия, Ярославская область, Ярославль, Победы, 15, 1, 37"
        };

        System.out.println("Вариант split():");

        for (String address : addresses) {

            Address a = new Address();

            a.parseBySplit(address);

            System.out.println("\n" + a);
        }


        System.out.println("\n-------------------------");
        System.out.println("Вариант StringTokenizer:");

        String[] addresses2 = {
                "Россия; Московская область; Москва; Ленина; 10; 2; 15",
                "Россия. Ленинградская область. Санкт-Петербург. Невский. 25. 1. 42",
                "Россия, Тульская область; Тула. Советская; 8, 3; 21",
                "Россия; Ярославская область. Ярославль; Победы. 15; 1. 37"
        };

        for (String address : addresses2) {

            Address a = new Address();
            a.parseByTokenizer(address);
            System.out.println("\n" + a);
        }
    }
}
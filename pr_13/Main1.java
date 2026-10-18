package pr_13;

public class Main1 {

    static void checkString(String str) {

        System.out.println("Последний символ: "
                + str.charAt(str.length() - 1));

        System.out.println("Заканчивается на \"!!!\": "
                + str.endsWith("!!!"));

        System.out.println("Начинается с \"I like\": "
                + str.startsWith("I like"));

        System.out.println("Содержит \"Java\": "
                + str.contains("Java"));

        System.out.println("Позиция \"Java\": "
                + str.indexOf("Java"));

        System.out.println("Замена a на o: "
                + str.replace('a', 'o'));

        System.out.println("Верхний регистр: "
                + str.toUpperCase());

        System.out.println("Нижний регистр: "
                + str.toLowerCase());

        int start = str.indexOf("Java");

        System.out.println("Вырезанная строка: "
                + str.substring(start, start + 4));
    }

    void main() {

        String str = "I like Java!!!";

        checkString(str);
    }
}
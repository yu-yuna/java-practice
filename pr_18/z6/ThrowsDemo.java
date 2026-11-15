package pr_18.z6;

public class ThrowsDemo {

    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }

    public String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("Пустой ключ");
        }

        return "Данные ключа: " + key;
    }
}
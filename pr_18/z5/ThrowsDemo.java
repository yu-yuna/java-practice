package pr_18.z5;

public class ThrowsDemo {

    public void getDetails(String key) {

        try {

            if (key == null) {
                throw new NullPointerException("Пустой ключ");
            }
            System.out.println("Данные ключа: " + key);

        } catch (NullPointerException ex) {
            System.out.println("Ошибка: " + ex.getMessage());
        }
    }
}
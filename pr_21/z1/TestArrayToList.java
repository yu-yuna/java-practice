package pr_21.z1;

public class TestArrayToList {

    public static void main(String[] args) {

        String[] names = {"Yuna", "Anna", "Maria"};
        Integer[] numbers = {10, 20, 30, 40};

        System.out.println("Список строк:");
        System.out.println(ArrayToList.convert(names));

        System.out.println("\nСписок чисел:");
        System.out.println(ArrayToList.convert(numbers));
    }
}
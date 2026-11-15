package pr_21.z2;

public class TestGenericArray {

    public static void main(String[] args) {

        Integer[] integers = {10, 20, 30};
        GenericArray<Integer> array1 = new GenericArray<>(integers);

        Long[] longs = {100L, 200L, 300L};
        GenericArray<Long> array2 = new GenericArray<>(longs);

        String[] strings = {"Yuna", "Anna", "Maria"};
        GenericArray<String> array3 = new GenericArray<>(strings);

        System.out.println("Массив целых чисел:");
        array1.printArray();

        System.out.println("Массив длинных чисел:");
        array2.printArray();

        System.out.println("Массив строк:");
        array3.printArray();

        System.out.println("\nПолучение элементов:");

        System.out.println("Integer: " + array1.getElement(1));
        System.out.println("Long: " + array2.getElement(2));
        System.out.println("String: " + array3.getElement(0));
    }
}
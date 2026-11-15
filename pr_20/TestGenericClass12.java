package pr_20;

public class TestGenericClass12 {

    public static void main(String[] args) {

        GenericClass12<String, Animal, Integer> obj =
                new GenericClass12<>("Yuna", new Animal("Кошка"), 20);

        System.out.println("Первое значение: " + obj.getFirst());
        System.out.println("Второе значение: " + obj.getSecond());
        System.out.println("Третье значение: " + obj.getThird());

        System.out.println("\nНазвания классов:");
        obj.printClassNames();
    }
}
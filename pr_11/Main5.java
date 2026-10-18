package pr_11;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main5 {

    void main() {

        int n = 100000;

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Добавление в конец
        long start = System.nanoTime();

        for (int i = 0; i < n; i++) {
            arrayList.add(i);
        }

        long end = System.nanoTime();

        System.out.println("ArrayList — добавление: "
                + (end - start) + " нс");


        start = System.nanoTime();

        for (int i = 0; i < n; i++) {
            linkedList.add(i);
        }

        end = System.nanoTime();

        System.out.println("LinkedList — добавление: "
                + (end - start) + " нс");


        // Вставка в начало
        start = System.nanoTime();

        arrayList.add(0, 999);

        end = System.nanoTime();

        System.out.println("ArrayList — вставка в начало: "
                + (end - start) + " нс");


        start = System.nanoTime();

        linkedList.add(0, 999);

        end = System.nanoTime();

        System.out.println("LinkedList — вставка в начало: "
                + (end - start) + " нс");


        // Удаление из начала
        start = System.nanoTime();

        arrayList.remove(0);

        end = System.nanoTime();

        System.out.println("ArrayList — удаление из начала: "
                + (end - start) + " нс");


        start = System.nanoTime();

        linkedList.remove(0);

        end = System.nanoTime();

        System.out.println("LinkedList — удаление из начала: "
                + (end - start) + " нс");


        // Поиск элемента
        start = System.nanoTime();

        arrayList.contains(n / 2);

        end = System.nanoTime();

        System.out.println("ArrayList — поиск: "
                + (end - start) + " нс");


        start = System.nanoTime();

        linkedList.contains(n / 2);

        end = System.nanoTime();

        System.out.println("LinkedList — поиск: "
                + (end - start) + " нс");
    }
}
package pr_23.z2;

public class Tests {

    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();

        System.out.println("=== LinkedQueue ===\n");

        System.out.println("Добавление:");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        printQueue(queue);

        System.out.println("\nПолучение первого: " + queue.element());
        printQueue(queue);

        System.out.println("\nУдаление первого: " + queue.dequeue());
        printQueue(queue);

        System.out.println("\nДобавление: 40");
        queue.enqueue(40);
        printQueue(queue);

        System.out.println("\nРазмер очереди: " + queue.size());
        System.out.println("\nПроверка isEmpty(): " + queue.isEmpty());
        System.out.println("\nОчистка: ");
        queue.clear();
        printQueue(queue);

        System.out.println("\nПроверка isEmpty() после очистки: " + queue.isEmpty());

        System.out.println("\n== Проверка искл ==");
        try {
            queue.dequeue();
        } catch (IllegalStateException e) {
            System.out.println("Удаление из пустой очереди: ок");
        }

        try {
            queue.element();
        } catch (IllegalStateException e) {
            System.out.println("Получение элемента из пустой очереди: ок");
        }

        try {
            queue.enqueue(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Добавление null: иок");
        }

    }

    private static void printQueue(LinkedQueue queue) {
        System.out.print("Содержимое очереди: ");

        if (queue.isEmpty()) {
            System.out.println("пустая");
            return;
        }

        int size = queue.size();

        for (int i = 0; i < size; i++) {
            Object element = queue.dequeue();
            System.out.print(element + " ");
            queue.enqueue(element);
        }

        System.out.println();
    }
}
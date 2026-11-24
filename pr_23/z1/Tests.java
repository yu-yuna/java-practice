
package pr_23.z1;

public class Tests {

    public static void main(String[] args) {
        testArrayQueueModule();
        testArrayQueueADT();
        testArrayQueue();

        System.out.println("\nВсе тесты ок");
    }

    private static void testArrayQueueModule() {
        System.out.println("\n== ArrayQueueModule ==");

        ArrayQueueModule.clear();

        ArrayQueueModule.enqueue(10);
        ArrayQueueModule.enqueue(20);
        ArrayQueueModule.enqueue(30);

        printModuleQueue();

        check(ArrayQueueModule.size() == 3, "size");
        check(ArrayQueueModule.element().equals(10), "element");
        check(ArrayQueueModule.dequeue().equals(10), "dequeue");

        printModuleQueue();

        ArrayQueueModule.clear();
        check(ArrayQueueModule.isEmpty(), "clear");
    }

    private static void testArrayQueueADT() {
        System.out.println("\n== ArrayQueueADT ==");

        ArrayQueueADT queue = new ArrayQueueADT();

        ArrayQueueADT.enqueue(queue, 10);
        ArrayQueueADT.enqueue(queue, 20);
        ArrayQueueADT.enqueue(queue, 30);

        printADTQueue(queue);

        check(ArrayQueueADT.size(queue) == 3, "size");
        check(ArrayQueueADT.element(queue).equals(10), "element");
        check(ArrayQueueADT.dequeue(queue).equals(10), "dequeue");

        printADTQueue(queue);

        ArrayQueueADT.clear(queue);
        check(ArrayQueueADT.isEmpty(queue), "clear");
    }

    private static void testArrayQueue() {
        System.out.println("\n== ArrayQueue ==");

        ArrayQueue queue = new ArrayQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        printQueue(queue);

        check(queue.size() == 3, "size");
        check(queue.element().equals(10), "element");
        check(queue.dequeue().equals(10), "dequeue");

        printQueue(queue);

        queue.clear();
        check(queue.isEmpty(), "clear");
    }

    private static void printModuleQueue() {
        int size = ArrayQueueModule.size();
        Object[] elements = new Object[size];

        for (int i = 0; i < size; i++) {
            elements[i] = ArrayQueueModule.dequeue();
        }

        System.out.print("Очередь: ");

        for (Object element : elements) {
            System.out.print(element + " ");
        }

        System.out.println();

        for (Object element : elements) {
            ArrayQueueModule.enqueue(element);
        }
    }

    private static void printADTQueue(ArrayQueueADT queue) {
        int size = ArrayQueueADT.size(queue);
        Object[] elements = new Object[size];

        for (int i = 0; i < size; i++) {
            elements[i] = ArrayQueueADT.dequeue(queue);
        }

        System.out.print("Очередь: ");

        for (Object element : elements) {
            System.out.print(element + " ");
        }

        System.out.println();

        for (Object element : elements) {
            ArrayQueueADT.enqueue(queue, element);
        }
    }

    private static void printQueue(ArrayQueue queue) {
        int size = queue.size();
        Object[] elements = new Object[size];

        for (int i = 0; i < size; i++) {
            elements[i] = queue.dequeue();
        }

        System.out.print("Очередь: ");

        for (Object element : elements) {
            System.out.print(element + " ");
        }

        System.out.println();

        for (Object element : elements) {
            queue.enqueue(element);
        }
    }

    private static void check(boolean condition, String testName) {
        if (!condition) {
            throw new AssertionError("Тест не ок: " + testName);
        }
    }
}

package pr_23.z1;

public class ArrayQueueADT {

    private Object[] elements = new Object[10];
    private int head = 0;
    private int size = 0;

    public static void enqueue(ArrayQueueADT adt, Object element) {
        if (adt == null || element == null) {
            throw new IllegalArgumentException("Аргументы null");
        }

        adt.ensureCapacity();
        adt.elements[(adt.head + adt.size) % adt.elements.length] = element;
        adt.size++;
    }

    public static Object element(ArrayQueueADT adt) {
        checkADT(adt);

        if (isEmpty(adt)) {
            throw new IllegalStateException("Очередь пуста.");
        }

        return adt.elements[adt.head];
    }

    public static Object dequeue(ArrayQueueADT adt) {
        checkADT(adt);

        if (isEmpty(adt)) {
            throw new IllegalStateException("Очередь пуста.");
        }

        Object result = adt.elements[adt.head];
        adt.elements[adt.head] = null;
        adt.head = (adt.head + 1) % adt.elements.length;
        adt.size--;

        if (adt.size == 0) {
            adt.head = 0;
        }

        return result;
    }

    public static int size(ArrayQueueADT adt) {
        checkADT(adt);
        return adt.size;
    }

    public static boolean isEmpty(ArrayQueueADT adt) {
        checkADT(adt);
        return adt.size == 0;
    }

    public static void clear(ArrayQueueADT adt) {
        checkADT(adt);
        adt.elements = new Object[10];
        adt.head = 0;
        adt.size = 0;
    }

    private void ensureCapacity() {
        if (size == elements.length) {
            Object[] newElements = new Object[elements.length * 2];

            for (int i = 0; i < size; i++) {
                newElements[i] = elements[(head + i) % elements.length];
            }

            elements = newElements;
            head = 0;
        }
    }

    private static void checkADT(ArrayQueueADT adt) {
        if (adt == null) {
            throw new IllegalArgumentException("Очередь null");
        }
    }
}
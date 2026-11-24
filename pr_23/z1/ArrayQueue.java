package pr_23.z1;

public class ArrayQueue {

    private Object[] elements = new Object[10];
    private int head = 0;
    private int size = 0;

    public void enqueue(Object element) {
        if (element == null) {
            throw new IllegalArgumentException("Элемент null");
        }

        ensureCapacity();
        elements[(head + size) % elements.length] = element;
        size++;
    }

    public Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }

        return elements[head];
    }

    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }

        Object result = elements[head];
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;

        if (size == 0) {
            head = 0;
        }

        return result;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        elements = new Object[10];
        head = 0;
        size = 0;
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
}

package pr_23.z2;

public class LinkedQueue extends AbstractQueue {

    private Node head;
    private Node tail;

    @Override
    public void enqueue(Object element) {
        if (element == null) {
            throw new IllegalArgumentException("Элемент не может быть null.");
        }

        Node node = new Node(element);

        if (tail == null) {
            head = node;
        } else {
            tail.next = node;
        }

        tail = node;
        size++;
    }

    @Override
    public Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста.");
        }

        return head.value;
    }

    @Override
    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Очередь пуста");
        }

        Object result = head.value;
        head = head.next;
        size--;

        if (head == null) {
            tail = null;
        }

        return result;
    }

    @Override
    protected void clearImpl() {
        head = null;
        tail = null;
    }

    private static class Node {
        private Object value;
        private Node next;

        private Node(Object value) {
            this.value = value;
        }
    }
}

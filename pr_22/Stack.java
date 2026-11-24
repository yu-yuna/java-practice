package pr_22;

public class Stack {

    private Node top;
    private int size;

    private static class Node {
        double value;
        Node next;

        Node(double value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void push(double value) {
        top = new Node(value, top);
        size++;
    }

    public double pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Невозможный POP стек пуст.");
        }

        double value = top.value;
        top = top.next;
        size--;

        return value;
    }

    public double peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Стек пуст");
        }

        return top.value;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int count() {
        return size;
    }
}
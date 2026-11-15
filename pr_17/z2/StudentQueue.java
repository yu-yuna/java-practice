package pr_17.z2;

public class StudentQueue {

    Student head;
    Student tail;


    public StudentQueue() {
        head = null;
        tail = null;
    }

    public void add(Student student) {

        if (head == null) {
            head = student;
            tail = student;
            return;
        }

        student.prev = tail;
        tail.next = student;
        tail = student;
    }

    public void remove() {

        if (head == null) {
            System.out.println("Очередь пуста.");
            return;
        }

        head = head.next;

        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }
    }


    public void output() {

        System.out.println("Очередь:");

        if (isEmpty()) {
            System.out.println("пустая");
            return;
        }

        Student current = head;

        while (current != null) {
            current.output();
            current = current.next;
        }
    }


    public void clear() {
        head = null;
        tail = null;
    }


    public boolean isEmpty() {
        return head == null;
    }
}
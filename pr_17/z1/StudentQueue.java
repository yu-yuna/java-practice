package pr_17.z1;

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
        }
    }


    public void output() {
        System.out.println("Студенты: \n");
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
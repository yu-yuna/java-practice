package pr_17.z3;

import pr_17.z2.Student;

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

            student.next = student;
            student.prev = student;

            return;
        }

        
        student.next = head;
        student.prev = tail;

        tail.next = student;
        head.prev = student;

        tail = student;

        head.next = tail;
        tail.prev = head;
    }


    public void remove() {

        if (isEmpty()) {
            System.out.println("Очередь пуста.");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        head = head.prev;

        head.next = tail;
        tail.prev = head;
    }


    public void output() {

        System.out.println("Очередь:");

        if (isEmpty()) {
            System.out.println("пустая");
            return;
        }

        Student current = head;

        do {
            current.output();
            current = current.prev;
        } while (current != head);
    }

    public void clear() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }
}

package pr_23.z2;

public interface Queue {
    // эл в конец очереди.
    void enqueue(Object element);
    // возвращён первый
    Object element();
    // первый удалён и возвращён
    Object dequeue();

    int size();
    boolean isEmpty();
    void clear();
}

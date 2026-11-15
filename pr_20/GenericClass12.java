package pr_20;

import java.io.Serializable;

public class GenericClass12<T extends Comparable<T>, V extends Animal & Serializable, K> {

    private T first;
    private V second;
    private K third;

    public GenericClass12(T first, V second, K third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public K getThird() {
        return third;
    }

    public void printClassNames() {
        System.out.println("Первый тип: " + first.getClass().getName());
        System.out.println("Второй тип: " + second.getClass().getName());
        System.out.println("Третий тип: " + third.getClass().getName());
    }
}
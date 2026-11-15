package pr_21.z2;

public class GenericArray<T> {

    private T[] array;

    public GenericArray(T[] array) {
        this.array = array;
    }

    public void printArray() {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public T getElement(int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException(
                    "Неверный индекс: " + index
            );
        }

        return array[index];
    }
}
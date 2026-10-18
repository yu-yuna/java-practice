package pr_10.z2;

import pr_9.z2.GPAComparator;

public class TestGPA {

    void main() {

        GPAComparator sorting = new GPAComparator();

        sorting.setArray();

        System.out.println("Исходный массив:");
        sorting.outArray();

        sorting.quickSort(
            sorting.students,
            0,
            sorting.students.length - 1
        );

        System.out.println("\nПосле Quick Sort:");
        sorting.outArray();

        sorting.setArray();

        sorting.mergeSort(
            sorting.students,
            0,
            sorting.students.length - 1
        );

        System.out.println("\nПосле Merge Sort:");
        sorting.outArray();
    }
}
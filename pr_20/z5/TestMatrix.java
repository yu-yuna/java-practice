package pr_20.z5;

public class TestMatrix {

    public static void main(String[] args) {

        Integer[][] array1 = {
                {1, 2},
                {3, 4}
        };

        Integer[][] array2 = {
                {5, 6},
                {7, 8}
        };

        Matrix<Integer> matrix1 = new Matrix<>(array1);
        Matrix<Integer> matrix2 = new Matrix<>(array2);


        System.out.println("Сложение:");
        Matrix<Double> sum = matrix1.add(matrix2);
        sum.printMatrix();

        System.out.println("\nВычитание:");
        Matrix<Double> difference = matrix1.subtract(matrix2);
        difference.printMatrix();

        System.out.println("\nУмножение:");
        Matrix<Double> product = matrix1.multiply(matrix2);
        product.printMatrix();

        System.out.println("\nТрансп 1 матр:");
        Matrix<Double> transposed = matrix1.transpose();
        transposed.printMatrix();
    }
}
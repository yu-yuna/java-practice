package pr_20.z5;

public class Matrix<T extends Number> {

    private T[][] data;
    private int rows;
    private int columns;

    public Matrix(T[][] data) {
        this.data = data;
        this.rows = data.length;
        this.columns = data[0].length;
    }

    public Matrix<Double> add(Matrix<T> other) {

        if (rows != other.rows || columns != other.columns) {
            throw new IllegalArgumentException(
                    "Размеры матриц должны совпадать"
            );
        }

        Double[][] result = new Double[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = data[i][j].doubleValue()
                        + other.data[i][j].doubleValue();
            }
        }

        return new Matrix<>(result);
    }

    public Matrix<Double> subtract(Matrix<T> other) {

        if (rows != other.rows || columns != other.columns) {
            throw new IllegalArgumentException(
                    "Размеры матриц должны совпадать"
            );
        }

        Double[][] result = new Double[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = data[i][j].doubleValue()
                        - other.data[i][j].doubleValue();
            }
        }

        return new Matrix<>(result);
    }

    public Matrix<Double> multiply(Matrix<T> other) {

        if (columns != other.rows) {
            throw new IllegalArgumentException(
                    "Кол-во столб 1 матр должно совпадать с кол-вом строк 2"
            );
        }

        Double[][] result = new Double[rows][other.columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < other.columns; j++) {

                result[i][j] = 0.0;

                for (int k = 0; k < columns; k++) {
                    result[i][j] += data[i][k].doubleValue()
                            * other.data[k][j].doubleValue();
                }
            }
        }

        return new Matrix<>(result);
    }

    public Matrix<Double> transpose() {

        Double[][] result = new Double[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[j][i] = data[i][j].doubleValue();
            }
        }

        return new Matrix<>(result);
    }

    public void printMatrix() {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
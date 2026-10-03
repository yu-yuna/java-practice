package pr_7.z4;

public class MathFunc implements MathCalculable {

    @Override
    public double pow(double number, double degree) {
        return Math.pow(number, degree);
    }

    @Override
    public double abs(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    public double circleLength(double radius) {
        return 2 * PI * radius;
    }
}

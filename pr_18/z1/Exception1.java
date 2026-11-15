package pr_18.z1;

public class Exception1 {

    public void exceptionDemo() {

        try {
            System.out.println(100 / 0);
        } catch (ArithmeticException ex) {
            System.out.println("Attempted division by zero");
        }
    }
}
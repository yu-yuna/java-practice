package pr_3.z2;
import java.util.Random;
import java.util.Scanner;

public class Tester {

    private Circle[] circles;
    private int count;

    public Tester(int size) {
        circles = new Circle[size];
        count = 0;
    }

    public void add(Circle circle) {
        if (count < circles.length) {
            circles[count] = circle;
            count++;
        }
    }

    public Circle findSmallest() {
        Circle min = circles[0];
        for (int i = 1; i < count; i++) {
            if (circles[i].getRadius() < min.getRadius()) {
                min = circles[i];
            }
        }
        return min;
    }

    public Circle findLargest() {
        Circle max = circles[0];
        for (int i = 1; i < count; i++) {
            if (circles[i].getRadius() > max.getRadius()) {
                max = circles[i];
            }
        }
        return max;
    }

    public void sort() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {

                if (circles[j].getRadius() > circles[j + 1].getRadius()) {
                    Circle temp = circles[j];
                    circles[j] = circles[j + 1];
                    circles[j + 1] = temp;
                }
            }
        }
    }

    public void show() {
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ": " + circles[i]);
        }
    }

    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc  = new Scanner(System.in);
        System.out.print("кол-во?: ");
        int k = sc.nextInt();
        Tester tester = new Tester(k);

        for (int i = 0; i < k; i++) {
            double x = random.nextDouble(100);
            double y = random.nextDouble(100);
            double radius = random.nextDouble(1, 50);

            Point point = new Point(x, y);
            Circle circle = new Circle(point, radius);
            tester.add(circle);
        }

        System.out.println("Исходный массив:");
        tester.show();
        System.out.println("\nСамая маленькая:");
        System.out.println(tester.findSmallest());
        System.out.println("\nСамая большая:");
        System.out.println(tester.findLargest());
        tester.sort();
        System.out.println("\nПосле сорт.:");
        tester.show();

        sc.close();
    }
    
}

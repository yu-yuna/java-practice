package pr_2.z3;

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

    public static void main(String[] args) {

        Point p1 = new Point(5.0, 10.0);
        Point p2 = new Point(15.0, 20.0);
        Point p3 = new Point(25.0, 30.0);

        Circle circle1 = new Circle(p1, 5.0);
        Circle circle2 = new Circle(p2, 15.0);
        Circle circle3 = new Circle(p3, 20.0);

        Tester tester = new Tester(3);

        tester.add(circle1);
        tester.add(circle2);
        tester.add(circle3);

        System.out.println("Центр: " + circle1.getCenter());
        System.out.println("Радиус: " + circle1.getRadius());

        circle1.setCenter(new Point(50.0, 60.0));
        circle1.setRadius(12.0);

        System.out.println("Новый центр: " + circle1.getCenter());
        System.out.println("Новый радиус: " + circle1.getRadius());
    }
}
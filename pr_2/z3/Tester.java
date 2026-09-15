

public class Tester {
    public static void main(String[] args){

        Point p1 = new Point(5.0, 10.0);
        Point p2 = new Point(15.0, 20.0);
        Point p3 = new Point(25.0, 30.0);

        Circle circle1 = new Circle(p1, 5.0);
        Circle circle2 = new Circle(p2, 15.0);
        Circle circle3 = new Circle(p3, 20.0);

        System.out.println(circle1.getCenter());
        System.out.println(circle1.getRadius());

        circle1.setCenter(new Point(50.0, 60.0));
        circle1.setRadius(12.0);

        System.out.println(circle1.getCenter());
        System.out.println(circle1.getRadius());

        Circle[] circles = {circle1, circle2, circle3};

        int c = 0;

        for (Circle circle : circles) {
            if (circle.getRadius() > 10) {
                c++;
            }
        }

        System.out.println("Кол-во r > 10: " + c);
    }
    
}

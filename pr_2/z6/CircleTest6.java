package pr_2.z6;
public class CircleTest6 {
    public static void main(String[] args) {

        Circle6 circle1 = new Circle6(5.0, "red");
        Circle6 circle2 = new Circle6(10.0, "blue");

        System.out.println(circle1);
        System.out.println("Площадь: " + circle1.getArea());
        System.out.println("Длина окружности: " + circle1.getCircumference());

        System.out.println();

        System.out.println(circle2);
        System.out.println("Площадь: " + circle2.getArea());
        System.out.println("Длина окружности: " + circle2.getCircumference());

        System.out.println();

        circle1.setRadius(7.0);
        circle1.setColor("green");

        System.out.println("После изменения:");
        System.out.println(circle1);
        System.out.println("Площадь: " + circle1.getArea());
        System.out.println("Длина окружности: " + circle1.getCircumference());

        System.out.println("\nCравнение: " + circle1.compare(circle2));
    }
}
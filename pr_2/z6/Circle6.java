package pr_2.z6;
public class Circle6 {
    private double radius;
    private String color;

    public Circle6(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public int compare(Circle6 other) {
    if (this.radius > other.radius) {
            return 1;
        } else if (this.radius < other.radius) {
            return -1;
        } else {
            return 0;
    }
    }

    @Override
    public String toString() {
        return "Circle: " +
                "radius = " + radius +
                ", color = " + color;
    }
}
package pr_13;

public class Shirt {

    String id;
    String name;
    String color;
    String size;

    Shirt(String id, String name, String color, String size) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                "\nНазвание: " + name +
                "\nЦвет: " + color +
                "\nРазмер: " + size;
    }
}
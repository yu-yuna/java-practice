
public class Computer {
    private String name;
    private String brand;
    private double price;

    public Computer(String name, String brand, double price){
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public String getBrand() {
        return brand;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Computer: " +
                "name = " + name +
                ", brand = " + brand +
                ", price = " + price;
    }
    
}

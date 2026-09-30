package pr_6.z10;

public class Computer {

    public enum Brand {
        ASUS,
        LENOVO,
        HP,
        DELL,
        APPLE
    }

    private String name;
    private Brand brand;
    private double price;

    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(
            String name,
            Brand brand,
            double price,
            Processor processor,
            Memory memory,
            Monitor monitor) {

        this.name = name;
        this.brand = brand;
        this.price = price;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public String getName() {
        return name;
    }

    public Brand getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    @Override
    public String toString() {
        return "Computer: " +
                "name = " + name +
                ", brand = " + brand +
                ", price = " + price +
                ", processor = " + processor +
                ", memory = " + memory +
                ", monitor = " + monitor;
    }
}
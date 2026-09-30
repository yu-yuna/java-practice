package pr_6.z10;

public class Processor {

    private String name;
    private double frequency;

    public Processor(String name, double frequency) {
        this.name = name;
        this.frequency = frequency;
    }

    public String getName() {
        return name;
    }

    public double getFrequency() {
        return frequency;
    }

    @Override
    public String toString() {
        return name + ", " + frequency + " GHz";
    }
}
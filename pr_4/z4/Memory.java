package pr_4.z4;

public class Memory {

    private int size;

    public Memory(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return size + " GB";
    }
}
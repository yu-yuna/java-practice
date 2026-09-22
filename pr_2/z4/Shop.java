package pr_2.z4;
public class Shop {
    private Computer[] comps;
    private int c = 0;
    
    public Shop(int s){
        comps = new Computer[s];
    }

    public void add(Computer computer){
        if (c < comps.length) {
            comps[c] = computer;
            c++;
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < c) {
            for (int i = index; i < c - 1; i++) {
                comps[i] = comps[i + 1];
            }

            comps[c - 1] = null;
            c--;
        }
    }

    public Computer search(String name) {
        for (int i = 0; i < c; i++) {
            if (comps[i].getName().equals(name)) {
                return comps[i];
            }
        }

        return null;
    }

    public void showComputers() {
        for (int i = 0; i < c; i++) {
            System.out.println((i+1) + ": " + comps[i]);
        }
    }
}

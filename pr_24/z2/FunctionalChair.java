package pr_24.z2;

public class FunctionalChair implements Chair {
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public void sit() {
        System.out.println("Сидим на многофункциональном стуле");
    }
}
package pr_24.z2;

public class MagicChair implements Chair {
    public void doMagic() {
        System.out.println("Магический стул магичит");
    }

    @Override
    public void sit() {
        System.out.println("Сидим на магическом стуле");
    }
}
package pr_24.z2;

public class Main {
    public static void main(String[] args) {
        AbstractChairFactory factory = new ChairFactory();
        Client client = new Client();

        VictorianChair victorianChair = factory.createVictorianChair();
        MagicChair magicChair = factory.createMagicChair();
        FunctionalChair functionalChair = factory.createFunctionalChair();

        client.setChair(victorianChair);
        client.sit();
        System.out.println("Возраст стула: " + victorianChair.getAge());

        client.setChair(magicChair);
        client.sit();
        magicChair.doMagic();

        client.setChair(functionalChair);
        client.sit();
        System.out.println("Сумма: " + functionalChair.sum(10, 20));
    }
}
package pr_24.z2;

public class Client {
    private Chair chair;

    public void sit() {
        if (chair == null) {
            System.out.println("Стул не выбран.");
            return;
        }

        chair.sit();
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
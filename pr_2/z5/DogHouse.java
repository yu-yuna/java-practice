
public class DogHouse {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Bobik", 5);
        Dog dog2 = new Dog("Sharik", 3);
        Dog dog3 = new Dog("Rex", 7);

        Dog[] dogs = {dog1, dog2, dog3};
        for (Dog dog : dogs) {
            System.out.println(dog);
            System.out.println("По человечески: " + dog.humanAge());
        }

    }
    
}

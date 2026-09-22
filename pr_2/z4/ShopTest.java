package pr_2.z4;
import java.util.Scanner;
public class ShopTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Сколько компьютеров добавить? ");
        int n = sc.nextInt();
        sc.nextLine();

        Shop shop = new Shop(n);
        for (int i = 0; i < n; i++) {

            System.out.println("\nКомпьютер №" + (i + 1));

            System.out.print("Название: ");
            String name = sc.nextLine();

            System.out.print("Бренд: ");
            String brand = sc.nextLine();

            System.out.print("Цена: ");
            double price = sc.nextDouble();
            sc.nextLine();

            Computer computer = new Computer(name, brand, price);

            shop.add(computer);
        }

        System.out.println("\nКомпьютеры в магазине:");
        shop.showComputers();

        System.out.print("\nпоиск?: ");
        String searchName = sc.nextLine();

        Computer found = shop.search(searchName);
        if (found != null) {
            System.out.println("Найден: " + found);
        } else {
            System.out.println("Компьютер не найден");
        }

        System.out.print("\nУдалаем номер?: ");
        int index = sc.nextInt();
        index -=1;
        shop.remove(index);

        System.out.println("\nПосле удаления:");
        shop.showComputers();
        sc.close();
    }
    
}

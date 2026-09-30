package pr_6.z10;

import java.util.Scanner;

public class ComputerTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Сколько компьютеров добавить? ");
        int n = sc.nextInt();
        sc.nextLine();

        Shop shop = new Shop(n);

        Input input = new ComputerInput();

        for (int i = 0; i < n; i++) {

            System.out.println("\nКомпьютер №" + (i + 1));

            Computer computer = input.createComputer(sc);

            shop.add(computer);
        }

        System.out.println("\nКомпьютеры в магазине:");
        shop.showComputers();

        System.out.print("\nПоиск компьютера: ");
        String searchName = sc.nextLine();

        Computer found = shop.search(searchName);

        if (found != null) {
            System.out.println("Найден: " + found);
        } else {
            System.out.println("Компьютер не найден");
        }

        System.out.print("\nУдалить номер?: ");
        int index = sc.nextInt();
        index--;

        shop.remove(index);

        System.out.println("\nПосле удаления:");
        shop.showComputers();

        sc.close();
    }
}
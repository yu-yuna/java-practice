package pr_4.z4;

import java.util.Scanner;

public class ComputerTest {
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

            System.out.print("Бренд (ASUS, LENOVO, HP, DELL, APPLE): ");
            String brandName = sc.nextLine().toUpperCase();
            Computer.Brand brand = Computer.Brand.valueOf(brandName);

            System.out.print("Цена: ");
            double price = sc.nextDouble();

            sc.nextLine();

            System.out.print("Процессор: ");
            String processorName = sc.nextLine();

            System.out.print("Частота процессора (GHz): ");
            double frequency = sc.nextDouble();

            System.out.print("Оперативная память (GB): ");
            int memorySize = sc.nextInt();

            System.out.print("Диагональ монитора: ");
            double diagonal = sc.nextDouble();

            sc.nextLine();

            System.out.print("Разрешение монитора: ");
            String resolution = sc.nextLine();

            Processor processor =
                    new Processor(processorName, frequency);

            Memory memory =
                    new Memory(memorySize);

            Monitor monitor =
                    new Monitor(diagonal, resolution);

            Computer computer =
                    new Computer(
                            name,
                            brand,
                            price,
                            processor,
                            memory,
                            monitor
                    );

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

        System.out.print("\nУдалить номер?: ");
        int index = sc.nextInt();
        index--;

        shop.remove(index);

        System.out.println("\nПосле удаления:");
        shop.showComputers();

        sc.close();
    }
}
package pr_6.z10;

import java.util.Scanner;

public class ComputerInput implements Input {

    @Override
    public Computer createComputer(Scanner sc) {

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

        return new Computer(
                name,
                brand,
                price,
                processor,
                memory,
                monitor
        );
    }
}

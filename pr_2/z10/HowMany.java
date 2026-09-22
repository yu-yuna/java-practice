import java.util.Scanner;

public class HowMany {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String text = sc.nextLine();

        String[] words = text.split(" ");
        System.out.println(words.length);
        sc.close();
    }
}

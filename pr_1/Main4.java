import java.util.Scanner;

public class Main4 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Сколько?: ");
        int n = sc.nextInt();
        int[] num = new int[n];
        int i = 0;
        do{
            System.out.print("Введи число: ");
            num[i] = sc.nextInt();
            i++;
        }while (i!= n);

        int sum = 0;
        i = 0;
        while (i < n) {
            sum += num[i];
            i++;
        }
        System.out.println("Сумма: " + sum);

        int max = num[0];
        int min = num[0];
        i = 0;
        while (i+1 < n) {
            if (num[i+1]> max) {
                max = num[i+1];
            }
            if (num[i+1]< min) {
                min = num[i+1];
                
            }
            i++;
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);
        sc.close();
    }
    
}

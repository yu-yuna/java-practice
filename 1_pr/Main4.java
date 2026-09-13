import java.util.Scanner;

public class Main4 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Скока?: ");
        int n = sc.nextInt();
        int[] num = new int[n];
        int i = 0;
        do{
            System.out.print("Введи: ");
            num[i] = sc.nextInt();
            i++;
        }while (i!= n);

        int sum = 0;
        i = 0;
        while (i < n) {
            sum += num[i];
            i++;
        }
        System.out.println(sum);

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
        System.err.println("max: " + max);
        System.err.println("min: " + min);
        sc.close();
    }
    
}

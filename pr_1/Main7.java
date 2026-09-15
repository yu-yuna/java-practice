import java.util.Scanner;

public class Main7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ввкди чило: ");
        int n = sc.nextInt();

        System.out.println("Факториал: " + fact(n));
        sc.close();
    }

    static int fact(int n){
        int res = 1;
        for(int i = 1; i<=n; i++){
            res *= i;
        }
        return res;
    }
    
}

package pr_3;
import java.util.Arrays;
import java.util.Random;

public class Main1 {
    public static void main(String[] args){
        double[] a = new double[10];
        double[] b = new double[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = Math.random();
        }

        Random random = new Random();

        for (int i = 0; i < b.length; i++) {
            b[i] = random.nextDouble();
        }

        System.out.println("Math:");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("После:");
        System.out.println(Arrays.toString(a));

        System.out.println("\nRandom:");
        System.out.println(Arrays.toString(b));
        Arrays.sort(b);
        System.out.println("После:");
        System.out.println(Arrays.toString(b));

    }  
    
}

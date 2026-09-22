package pr_3;

import java.util.Random;

public class Main3 {
    public static void main(String[] args){
        Random random = new Random();
        int[] num = new int[4];

        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(10, 100);
        }

        System.out.print("Массив: ");

        for (int n : num) {
            System.out.print(n + " ");
        }

        boolean isStrog = true;

        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] >= num[i + 1]) {
                isStrog = false;
                break;
            }
        }

        if (isStrog) {
            System.out.println("\nМассив строго возраст.");
        } else {
            System.out.println("\nМассив не строго возраст.");
        }



    }
    
}

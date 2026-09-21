public class Main3 {
    public static void main(String[] args){
        int[] num = {1, 7, 5, 4, 5};
        int sum = 0;
        for(int i = 0 ; i < num.length; i++){
            sum+= num[i];
        }
        System.out.println("Сумма: "+ sum);
        System.out.println("Ср. арифм.: " + (double) sum/(num.length));

        System.out.println("Массив: ");
        for(int i = 0 ; i < num.length; i++){
            System.out.print(num[i] + " ");
        }
        System.out.println('\n');
    }

    
}

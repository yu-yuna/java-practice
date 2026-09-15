public class Main3 {
    public static void main(String[] args){
        System.out.println("Практика 1");
        int[] num = {1, 2, 3, 4, 5};
        int sum = 0;
        for(int i = 0 ; i < num.length; i++){
            sum+= num[i];
        }
        System.out.println(sum);
        System.out.println((double) sum/(num.length));

    }
    
}


public class ReverseArray {
    public static void main(String[] args){
        String[] words = {"A", "B", "C", "D"};
        String[] rev = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            rev[i] = words[words.length - 1 - i];
        }

        for (String w : rev) {
            System.out.print(w + " ");
        }
        System.out.println();
    }


}

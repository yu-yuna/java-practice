public class ReverseArray {

    public static void main(String[] args) {
        String[] words = {"A", "B", "C", "D"};
        for (int i = 0; i < words.length / 2; i++) {
            String temp = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = temp;
        }
        for (String w : words) {
            System.out.print(w + " ");
        }
        System.out.println();
    }
}

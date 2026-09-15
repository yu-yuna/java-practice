import java.util.Random;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Количество игроков: ");
        int n = sc.nextInt();

        String[] suits = {"♠", "♥", "♦", "♣"};
        String[] ranks = {
                "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "J", "Q", "K", "A"
        };

        String[] deck = new String[52];

        int k = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[k] = rank + suit;
                k++;
            }
        }

        Random random = new Random();

        for (int i = deck.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);

            String temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }

        int cardIndex = 0;

        for (int player = 1; player <= n; player++) {

            System.out.println("\nИгрок " + player + ":");

            for (int card = 0; card < 5; card++) {
                System.out.print(deck[cardIndex] + " ");
                cardIndex++;
            }

            System.out.println();
        }

        sc.close();
    }
}
public class DeckOfCards {
    public static void main(String[] args) {
         int[] deck = new int[52];
         String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
         String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
            "10", "Jack", "Queen", "King"};
         int n = deck.length;
         for (int i = 0; i < n; i++) {
            deck[i] = i;
          }    
         for (int i = 0; i < n; i++) {
            int index = (int) (Math.random() * n);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
         }
         for (int i = 0; i < 4; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println(
                "Card Number "+deck[i]+":" +rank+ " Of"+suit
            );
         }
        }
    }

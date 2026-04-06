import java.util.Scanner;

public class GuessNumberOneTime {
 public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   // Generating Number:
   int number = (int)(Math.random() * 100);
   // Getting Number From User
   int guessnumber;
   do {
   System.out.print("Guess Number 0-100: ");
   guessnumber = sc.nextInt();
   
   // Now Checking Condition
   if (number == guessnumber) {
      System.out.println("Yes, The Number Is "+number);
   
    }
   else if (number > guessnumber) {
       System.out.println("Your Guess Is Too Low");
     }
   else
     System.out.println("Your Guess Is Too High");
     } while (number != guessnumber);
  }
}
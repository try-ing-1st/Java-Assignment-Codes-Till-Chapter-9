import java.util.Scanner;

public class Reverse {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
   // Getting Digit
   int n;
   System.out.print("Enter Number: ");
    n = sc.nextInt();
   int originalNumber = n;
   // Now Executing Function
   // Showing Reverse
   int revNumber = reverse(n);
   System.out.println(revNumber+" Is The Reverse Of "+originalNumber);
  }
  public static int reverse(int a) {
       int rev = 0;
   // Loop Until Digit Becomes "Zero"
   while (a != 0) { 
   // Recalling That 
   // Remainder Gives Us Last Digit
      int digit = a % 10;
   // Making Space For Next Digit For Adding
      rev = rev * 10 + digit;
   // Removing Last Digit
      a /= 10;
     }  
   return rev;
   }
}
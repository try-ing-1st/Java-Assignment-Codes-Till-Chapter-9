import java.util.Scanner;

public class PalindromeNumber {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n;
  System.out.print("Enter Number: ");
  n = sc.nextInt();
  int originalNumber = n;
  int reversedNumber = reverse(n);
  boolean palendrome = isPalendrome(n);
  if (palendrome)
    System.out.println(reversedNumber+" Is The Reverse Of "+originalNumber+", And Palindrome");
  else 
    System.out.println(reversedNumber+" Is The Reverse Of "+originalNumber+", And Not Palindrome");
  }
  public static int reverse(int a) {
   int rev = 0;
   while (a != 0) {
     int digit = a % 10;
         rev = rev * 10 + digit;
         a /= 10;
    }
  return rev;
  }
  public static boolean isPalendrome(int b) {
     int number = b;
     int checkNumber = reverse(b);
     if (number == checkNumber)
       return true;
     else 
       return false;
  }
}
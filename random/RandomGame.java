import java.util.Scanner;


public class RandomGame {
 public static void main (String args[]) {
   
   Scanner sc = new Scanner(System.in);
   long number1, number2;
   long orResult;
   long result;
   char choice = 'Y';
   do {
    number1 = System.currentTimeMillis() % 10;
    number2 = System.currentTimeMillis() % 7;
   System.out.print(number1+" + "+number2+" = ");
   result = sc.nextInt();
   orResult = number1 + number2;
   if(result == orResult) {
       System.out.println("You Won!");
      }  else {
       System.out.println("Oh It Was Easy Like Life");
       System.out.print("Play IT More And More: ");
       choice = sc.next().charAt(0);
      }
   
    
  } while (result == orResult || (choice == 'Y' || choice == 'y'));
     sc.close();
 System.out.println("So You Don't Want To Play,"
  + " Life Is Playing With You Hahahaha");
  
  }
}